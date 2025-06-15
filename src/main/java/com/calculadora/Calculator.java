package com.calculadora;

public class Calculator {

    /**
     * Realiza a adição de dois números.
     * @param a O primeiro número.
     * @param b O segundo número.
     * @return A soma de a e b.
     */
    public double adicionar(double a, double b) {
        return a + b;
    }

    /**
     * Realiza a subtração de dois números.
     * @param a O minuendo.
     * @param b O subtraendo.
     * @return A diferença entre a e b.
     */
    public double subtrair(double a, double b) {
        return a - b;
    }

    /**
     * Realiza a multiplicação de dois números.
     * @param a O primeiro fator.
     * @param b O segundo fator.
     * @return O produto de a e b.
     */
    public double multiplicar(double a, double b) {
        return a * b;
    }

    /**
     * Realiza a divisão de dois números.
     * @param a O dividendo.
     * @param b O divisor.
     * @return O quociente de a por b.
     * @throws IllegalArgumentException Se o divisor for zero.
     */
    public double dividir(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divisão por zero não é permitida.");
        }
        return a / b;
    }
}