
package com.selva;

public class Calculator {

    public double addition(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException(
                    "The Denominator zero is not allowed in the mathematical rules"
            );
        }
        return a / b;
    }
}
