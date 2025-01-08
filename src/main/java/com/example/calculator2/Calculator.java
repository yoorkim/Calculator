package com.example.calculator2;

import java.util.LinkedList;
import java.util.List;

public class Calculator {
    private List<Integer> result = new LinkedList<>();

    public List<Integer> calculate (char operator, int num1, int num2) {
        switch(operator) {
            case('+'):
                result.add(num1 + num2);
                break;
            case('-'):
                result.add(num1 - num2);
                break;
            case('*'):
                result.add(num1 * num2);
                break;
            case('/'):
                if (num2 == 0) {
                    System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                    App.pass = false;  // 분모가 0인 경우 result 값 계산 생략
                } else {
                    result.add(num1 / num2);
                }
                break;
        }
        return result;
    }

    // 데이터 삭제 메서드
    public void removeResult() { result.remove(0); }  // 가장 먼저 저장된 데이터가 있는 첫 번째 인덱스 삭제

    // Getter 메서드
    public List<Integer> getResult() {
        return result;
    }

    // Setter 메서드
    public void setResult(LinkedList<Integer> result) {
        this.result = result;
    }
}
