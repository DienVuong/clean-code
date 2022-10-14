package com.codegym;

public class Calculator {
    public static final char ADDITION = '+';
    public static final char SUBTRACTION = '-';
    public static final char MULTIPLICATION = '*';
    public static final char DIVISION = '/';

    public static int calculate(int firstOperand, int secondeOperand, char operator) {
        switch (operator) {
            case ADDITION:
                return firstOperand + secondeOperand;
            case SUBTRACTION:
                return firstOperand - secondeOperand;
            case MULTIPLICATION:
                return firstOperand * secondeOperand;
            case DIVISION:
                if (secondeOperand != 0)
                    return firstOperand / secondeOperand;
                else
                    throw new RuntimeException("Can not divide by 0");
            default:
                throw new RuntimeException("Unsupported operation");
        }
    }
}
