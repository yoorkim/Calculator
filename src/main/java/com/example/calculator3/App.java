package com.example.calculator3;

import java.util.LinkedList;
import java.util.Scanner;

public class App {
    protected static boolean pass;
    public static void main(String[] args) {
        ArithmeticCalculator calculator = new ArithmeticCalculator(); // ArithmeticCalculator 객체 생성

        System.out.println("Hello, Calculator!");
        Scanner sc = new Scanner(System.in);

        while(true) {
            pass = true;  // pass 초기화
            Number num1 = null, num2 = null;  // 초기화

            System.out.print("\n첫 번째 숫자를 입력하세요: ");
            String input1 = sc.next();
            System.out.print("두 번째 숫자를 입력하세요: ");
            String input2 = sc.next();
            System.out.print("사칙연산 기호를 입력하세요: ");
            char operator = sc.next().charAt(0);

            try {
                num1 = Double.parseDouble(input1);  // 형 변환하여 Number 타입 변수에 삽입
                num2 = Double.parseDouble(input2);
            } catch (NumberFormatException e) {
                System.out.println("숫자가 아닙니다. 숫자를 입력해주세요.");
                continue;  // 숫자 입력 오류 시 다시 입력 받음
            }
            calculator.calculate(operator, num1, num2);

            // 예외 발생 없이 연산된 경우에만 계산식 출력
            if (pass) System.out.println("결과: " + num1 + operator + num2 + "=" + calculator.getResult().getLast());
            // getResult()를 사용하여 결과 리스트 출력
            System.out.println("결과 리스트: " + calculator.getResult() + "\n");

            if (calculator.getResult().size() > 5) { // 결과 리스트의 크기가 5보다 큰 경우
                while (true) {
                    Number input = null;
                    try {
                        System.out.print("\t> 숫자를 입력하세요: ");
                        input = Double.parseDouble(sc.next());
                        // maxResult() 호출하여 필터링된 리스트 받아옴
                        System.out.println("\t> 입력받은 값보다 큰 결과값 리스트: " + calculator.maxResult(input));
                        break;  // 숫자가 정상적으로 입력되면 루프 종료
                    } catch (NumberFormatException e) {
                        System.out.println("\t> 숫자가 아닙니다. 숫자를 입력해주세요.");
                    }
                }
                calculator.removeResult();  // 맨 앞의 데이터 삭제
                System.out.println("\t> 가장 먼저 저장된 값 삭제 결과: " + calculator.getResult() + "\n");
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
