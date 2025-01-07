package com.example.calculator3;

import java.util.LinkedList;

public class ArithmeticCalculator {
    private LinkedList<Integer> result = new LinkedList<>();

    public LinkedList<Integer> calculate (char operator, int num1, int num2) {
        try {
            OperatorType operatorType = OperatorType.compare(operator);
            switch (operatorType) {
                case ADD:
                    result.add(num1 + num2);
                    break;
                case SUBTRACT:
                    result.add(num1 - num2);
                    break;
                case MULTIPLY:
                    result.add(num1 * num2);
                    break;
                case DIVIDE:
                    if (num2 == 0) {
                        App.pass = false; // 예외 발생한 경우 pass를 false로 변경
                        throw new ArithmeticException("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                    }
                    result.add(num1 / num2);
                    break;
            }
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
    public LinkedList<Integer> getResult() {
        return result;
    }

    // Setter 메서드
    public void setResult(LinkedList<Integer> result) {
        this.result = result;
    }
}

