package com.example.calculator3;

public enum OperatorType {  // Enum 타입으로 연산자 타입 정의
    ADD('+'),
    SUBTRACT('-'),
    MULTIPLY('*'),
    DIVIDE('/');

    private final char symbol;

    OperatorType (char symbol) {
        this.symbol = symbol;
    }

    public char getSymbol() {
        return symbol;
    }

    // 연산자 비교 메서드
    public static OperatorType compare(char operator) {
        for (OperatorType operatorType : OperatorType.values()) {
            if (operatorType.getSymbol() == operator) return operatorType;
        }
        throw new IllegalArgumentException("\t> [Error] 부적절한 연산자 타입: " + operator);  // 부적절한 연산자 입력 시 예외 처리
    }
}
