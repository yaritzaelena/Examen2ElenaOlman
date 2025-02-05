package com.example.examen2;

import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    //Olman PU
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
    public void testConvertirADestino_Hexadecimal() {
        assertEquals("a", Calculadora.convertirADestino(10, 3)); // 10 decimal = "a" en hexadecimal
    }

    //Elena PU
    @Test
    public void testConvertirNumero_Binario() {
        assertEquals(10, Calculadora.convertirNumero("1010", 0)); // 1010 (Binario) = 10 (Decimal)
    }

    @Test
    public void testConvertirNumero_Hexadecimal() {
        assertEquals(255, Calculadora.convertirNumero("FF", 3)); // FF (Hexadecimal) = 255 (Decimal)
    }

    @Test
    public void testConvertirNumero_Invalido() {
        assertEquals(-1, Calculadora.convertirNumero("2", 0)); // Error: "2" no es un número binario válido
    }

    @Test
    public void testConvertirNumero_Null() {
        assertEquals(-1, Calculadora.convertirNumero(null, 2)); // Error: entrada nula
    }

    // Pruebas para realizarOperacion()
    /*
    @Test
    public void testRealizarOp_Suma() {
        assertEquals(15, Calculadora.realizarOperacion(10, 5, "+")); // 10 + 5 = 15
    }*/
    /**
     * Error intencional en las pruebas*/
    @Test
    public void testRealizarOp_Suma() {
        assertEquals(15, Calculadora.realizarOperacion(11, 5, "+")); // 10 + 5 = 15
    }

    @Test
    public void testRealizarOperacion_Division() {
        assertEquals(2, Calculadora.realizarOperacion(10, 5, "/")); // 10 / 5 = 2
    }

    @Test
    public void testRealizarOp_DivisionPorCero() {
        assertThrows(ArithmeticException.class, () -> Calculadora.realizarOperacion(10, 0, "/"));
    }

    @Test
    public void testRealizarOperacion_OperadorNoSoportado() {
        assertThrows(IllegalArgumentException.class, () -> Calculadora.realizarOperacion(10, 5, "%"));
    }

    // Pruebas para convertirADestino()
    @Test
    public void testConvertirADestino_Bin() {
        assertEquals("1010", Calculadora.convertirADestino(10, 0)); // 10 (Decimal) = 1010 (Binario)
    }

    @Test
    public void testConvertirADestino_Hexa() {
        assertEquals("ff", Calculadora.convertirADestino(255, 3)); // 255 (Decimal) = FF (Hexadecimal)
    }

    @Test
    public void testConvertirADestino_BaseNoSoportada() {
        assertThrows(IllegalArgumentException.class, () -> Calculadora.convertirADestino(10, 5)); // Base no válida
    }

    /**
     * Prueba Unitaria para metodo Encunetra(Lista, numero)*/
    // Prueba cuando el elemento está en la lista
    @Test
    public void testEncuentra_ElementoPresente() {
        List<Integer> lista = Arrays.asList(1, 2, 3, 4, 5);
        assertTrue(Calculadora.Encuentra(lista, 3)); // El número 3 está en la lista
    }

    // Prueba cuando el elemento NO está en la lista
    @Test
    public void testEncuentra_ElementoAusente() {
        List<Integer> lista = Arrays.asList(1, 2, 3, 4, 5);
        assertFalse(Calculadora.Encuentra(lista, 10)); // El número 10 no está en la lista
    }
}