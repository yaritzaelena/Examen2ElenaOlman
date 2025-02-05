package com.example.examen2;
import org.junit.Test;
import static org.junit.Assert.*;
public class CalculadoraTestElenaOlman {
    // Pruebas para convertirNumero
    @Test
    public void testConvertirNumero_Binario_Valido() {
        assertEquals(5, Calculadora.convertirNumero("101", 0)); // 101 en binario = 5 en decimal
    }

    @Test
    public void testConvertirNumero_Binario_Invalido() {
        assertEquals(-1, Calculadora.convertirNumero("102", 0)); // 102 no es un número binario válido
    }

    @Test
    public void testConvertirNumero_Hexadecimal_Valido() {
        assertEquals(255, Calculadora.convertirNumero("FF", 3)); // FF en hexadecimal = 255 en decimal
    }

    @Test
    public void testConvertirNumero_Hexadecimal_Invalido() {
        assertEquals(-1, Calculadora.convertirNumero("G1", 3)); // G no es un número hexadecimal válido
    }

    // Pruebas para realizarOperacion
    @Test
    public void testRealizarOperacion_Suma() {
        assertEquals(15, Calculadora.realizarOperacion(10, 5, "+")); // 10 + 5 = 15
    }

    @Test
    public void testRealizarOperacion_Resta() {
        assertEquals(5, Calculadora.realizarOperacion(10, 5, "-")); // 10 - 5 = 5
    }

    @Test
    public void testRealizarOperacion_Multiplicacion() {
        assertEquals(50, Calculadora.realizarOperacion(10, 5, "*")); // 10 * 5 = 50
    }

    @Test(expected = ArithmeticException.class)
    public void testRealizarOperacion_DivisionPorCero() {
        Calculadora.realizarOperacion(10, 0, "/"); // Debe lanzar ArithmeticException
    }

    // Pruebas para convertirADestino
    @Test
    public void testConvertirADestino_Binario() {
        assertEquals("1010", Calculadora.convertirADestino(10, 0)); // 10 decimal = 1010 binario
    }

    @Test
    public void testConvertirADestino_Octal() {
        assertEquals("12", Calculadora.convertirADestino(10, 1)); // 10 decimal = 12 en octal
    }

    @Test
    public void testConvertirADestino_Decimal() {
        assertEquals("10", Calculadora.convertirADestino(10, 2)); // 10 decimal = 10 en decimal
    }

    @Test
    public void testConvertirADestino_Hexadecimal() {
        assertEquals("a", Calculadora.convertirADestino(10, 3)); // 10 decimal = "a" en hexadecimal
    }
}
