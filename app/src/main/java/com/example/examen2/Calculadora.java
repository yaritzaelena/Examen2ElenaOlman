package com.example.examen2;

import java.util.List;

public class Calculadora {

    // Método para convertir el número a la base seleccionada (0: Binario, 1: Octal, 2: Decimal, 3: Hexadecimal)
    public static int convertirNumero(String input, int base) {
        int num = 0;
        try {
            switch (base) {
                case 0: // Binario
                    num = Integer.parseInt(input, 2);
                    break;
                case 1: // Octal
                    num = Integer.parseInt(input, 8);
                    break;
                case 2: // Decimal
                    num = Integer.parseInt(input, 10);
                    break;
                case 3: // Hexadecimal
                    num = Integer.parseInt(input, 16);
                    break;
                default:
                    throw new NumberFormatException("Base no soportada");
            }
        } catch (NumberFormatException e) {
            return -1; // Retornar -1 en caso de error en la conversión
        }
        return num;
    }

    // Método para realizar operaciones matemáticas (suma, resta, multiplicación, división)
    public static int realizarOperacion(int num1, int num2, String operador) {
        int result = 0;
        switch (operador) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    throw new ArithmeticException("División por 0");
                }
                break;
            default:
                throw new IllegalArgumentException("Operador no soportado");
        }
        return result;
    }

    // Método para convertir un número decimal a cualquier base (0: Binario, 1: Octal, 2: Decimal, 3: Hexadecimal)
    public static String convertirADestino(int numeroDecimal, int baseDestino) {
        switch (baseDestino) {
            case 0: // Binario
                return Integer.toBinaryString(numeroDecimal);
            case 1: // Octal
                return Integer.toOctalString(numeroDecimal);
            case 2: // Decimal
                return Integer.toString(numeroDecimal);
            case 3: // Hexadecimal
                return Integer.toHexString(numeroDecimal);
            default:
                throw new IllegalArgumentException("Base de destino no soportada");
        }
    }

    // Método para verificar si un elemento está en la lista
    public static boolean Encuentra(List<Integer> lista, int elemento) {
        return lista.contains(elemento);
    }
}