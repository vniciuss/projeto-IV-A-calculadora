package com.calculadora;

public class Calculator {

    /**
     * Realiza a adição de dois números.
     * @parametro a O primeiro número.
     * @parametro b O segundo número.
     * @retorna A soma de a e b.
     */
    public double adicionar(double a, double b) {
        return a + b;
    }

    /**
     * Realiza a subtração de dois números.
     * @parametro a O minuendo.
     * @parametro b O subtraendo.
     * @retorna A diferença entre a e b.
     */
    public double subtrair(double a, double b) {
        return a - b;
    }

    /**
     * Realiza a multiplicação de dois números.
     * @parametro a O primeiro fator.
     * @parametro b O segundo fator.
     * @retorna O produto de a e b.
     */
    public double multiplicar(double a, double b) {
        return a * b;
    }

    /**
     * Realiza a divisão de dois números.
     * @parametro a O dividendo.
     * @parametro b O divisor.
     * @retorna O quociente de a por b.
     * @Exibe IllegalArgumentException Se o divisor for zero.
     */
    public double dividir(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divisão por zero não é permitida.");
        }
        return a / b;
    }
}


