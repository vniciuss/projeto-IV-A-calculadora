package com.calculadora;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Testes para a Classe Calculadora")
class CalculatorTest {

    private Calculator calculator;

    @BeforeEach // Este método é executado antes de cada teste
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    @DisplayName("Teste de Adição: Números Positivos")
    void testAdicionarPositivos() {
        assertEquals(5.0, calculator.adicionar(2.0, 3.0), "2 + 3 deveria ser 5.0");
    }

    @Test
    @DisplayName("Teste de Adição: Números Negativos")
    void testAdicionarNegativos() {
        assertEquals(-5.0, calculator.adicionar(-2.0, -3.0), "-2 + -3 deveria ser -5.0");
    }

    @Test
    @DisplayName("Teste de Adição: Zero e Positivo")
    void testAdicionarZeroEPositivo() {
        assertEquals(10.0, calculator.adicionar(0.0, 10.0), "0 + 10 deveria ser 10.0");
    }

    @Test
    @DisplayName("Teste de Subtração: Números Positivos")
    void testSubtrairPositivos() {
        assertEquals(1.0, calculator.subtrair(3.0, 2.0), "3 - 2 deveria ser 1.0");
    }

    @Test
    @DisplayName("Teste de Subtração: Números Negativos")
    void testSubtrairNegativos() {
        assertEquals(-1.0, calculator.subtrair(-2.0, -1.0), "-2 - -1 deveria ser -1.0");
    }

    @Test
    @DisplayName("Teste de Subtração: Zero")
    void testSubtrairZero() {
        assertEquals(5.0, calculator.subtrair(5.0, 0.0), "5 - 0 deveria ser 5.0");
    }

    @Test
    @DisplayName("Teste de Multiplicação: Números Positivos")
    void testMultiplicarPositivos() {
        assertEquals(6.0, calculator.multiplicar(2.0, 3.0), "2 * 3 deveria ser 6.0");
    }

    @Test
    @DisplayName("Teste de Multiplicação: Números Negativos")
    void testMultiplicarNegativos() {
        assertEquals(6.0, calculator.multiplicar(-2.0, -3.0), "-2 * -3 deveria ser 6.0");
    }

    @Test
    @DisplayName("Teste de Multiplicação: Por Zero")
    void testMultiplicarPorZero() {
        assertEquals(0.0, calculator.multiplicar(5.0, 0.0), "5 * 0 deveria ser 0.0");
    }

    @Test
    @DisplayName("Teste de Divisão: Números Positivos")
    void testDividirPositivos() {
        assertEquals(2.0, calculator.dividir(6.0, 3.0), "6 / 3 deveria ser 2.0");
    }

    @Test
    @DisplayName("Teste de Divisão: Por Número Negativo")
    void testDividirPorNegativo() {
        assertEquals(-2.0, calculator.dividir(6.0, -3.0), "6 / -3 deveria ser -2.0");
    }

    @Test
    @DisplayName("Teste de Divisão: Por Zero (Cenário de Falha)")
    void testDividirPorZero() {
        // Espera-se que uma IllegalArgumentException seja lançada
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calculator.dividir(10.0, 0.0);
        });
        assertEquals("Divisão por zero não é permitida.", exception.getMessage());
    }
}