package com.example.calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Hello, Calculator!");
        Scanner sc = new Scanner(System.in);

        while(true) {
            int result = 0;
            boolean pass = true;  // pass 초기화

            System.out.print("첫 번째 숫자를 입력하세요: ");
            int num1 = sc.nextInt();
            System.out.print("두 번째 숫자를 입력하세요: ");
            int num2 = sc.nextInt();
            System.out.print("사칙연산 기호를 입력하세요: ");
            char operator = sc.next().charAt(0);

            switch(operator) {
                case('+'):
                    result = num1 + num2;
                    break;
                case('-'):
                    result = num1 - num2;
                    break;
                case('*'):
                    result = num1 * num2;
                    break;
                case('/'):
                    if(num2 == 0) {
                        System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                        pass = false;  // 분모가 0인 경우 result 값 계산 생략
                    } else {
                        result = num1 / num2;
                    }
                    break;
            }
            // 연산 조건 만족할 경우 계산 결과 출력
            if (pass) System.out.println("결과: " + num1 + operator + num2 + "=" + result);
            System.out.print("더 계산하시겠습니까? (exit 입력 시 종료) ");
            if (sc.next().equals("exit")) break;
        }
        System.out.println("계산기가 종료되었습니다.");
    }
}

