package com.example.calculator3;

import java.util.LinkedList;

public class ArithmeticCalculator {
    private LinkedList<Number> result = new LinkedList<>();

    public <T extends Number> LinkedList<Number> calculate (char operator, T num1, T num2) {
        try {
            double n1 = num1.doubleValue(), n2 = num2.doubleValue();  // Number -> double 타입 변환
            double resultValue = 0;
            OperatorType operatorType = OperatorType.compare(operator);
            switch (operatorType) {
                case ADD:
                    resultValue = n1 + n2;
                    break;
                case SUBTRACT:
                    resultValue = n1 - n2;
                    break;
                case MULTIPLY:
                    resultValue = n1 * n2;
                    break;
                case DIVIDE:
                    if (n2 == 0) {
                        throw new ArithmeticException("나눗셈 연산에서 분모(두번째 숫자)에 0이 입력될 수 없습니다.");
                    }
                    resultValue = n1 / n2;
                    break;
            }
            double roundedResult = Math.round(resultValue * 100.0) / 100.0;  // 반올림하여 소수점 둘째 자리까지 저장
            result.add(roundedResult);
        } catch (ArithmeticException | IllegalArgumentException e) {
            App.pass = false;  // 예외 발생한 경우 pass를 false로 변경
            System.out.println(e.getMessage());
        }
        return result;
    }

    public void removeResult() {
        result.remove(0);  // 가장 먼저 저장된 데이터가 있는 첫 번째 인덱스 삭제
    }

    // Getter 메서드
    public LinkedList<Number> getResult() {
        return result;
    }

    // Setter 메서드
    public void setResult(LinkedList<Number> result) {
        this.result = result;
    }
}

