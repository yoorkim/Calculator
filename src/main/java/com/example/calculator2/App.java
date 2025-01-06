package com.example.calculator2;

import java.util.LinkedList;
import java.util.Scanner;

public class App {
    protected static boolean pass;
    public static void main(String[] args) {
        Calculator calculator = new Calculator();  // Calculator 객체 생성

        System.out.println("Hello, Calculator!");
        Scanner sc = new Scanner(System.in);

        while(true) {
            pass = true;  // pass 초기화
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int num1 = sc.nextInt();
            System.out.print("두 번째 숫자를 입력하세요: ");
            int num2 = sc.nextInt();
            sc.nextLine();
            System.out.print("사칙연산 기호를 입력하세요: ");
            char operator = sc.next().charAt(0);

            calculator.calculate(operator, num1, num2);

            // 연산 조건 만족할 경우 계산 결과 출력
            if (pass) System.out.println("결과: " + num1 + operator + num2 + "=" + calculator.getResult().getLast());
            System.out.println("결과 리스트: " + calculator.getResult());  // getResult()를 사용하여 결과 리스트 출력

            if (calculator.getResult().size() > 5) { // 결과 리스트의 크기가 5보다 큰 경우
                calculator.removeResult();  // 맨 앞의 데이터 삭제
                System.out.println("가장 먼저 저장된 값 삭제 결과: " + calculator.getResult());
            }

            System.out.print("더 계산하시겠습니까? (exit 입력 시 종료) ");
            if (sc.next().equals("exit")) {
                calculator.setResult(new LinkedList<>());  // setResult()를 사용하여 결과 초기화
                System.out.println("결과 리스트: " + calculator.getResult());
                break;
            }
        }
        System.out.println("계산기가 종료되었습니다.");
    }
}
