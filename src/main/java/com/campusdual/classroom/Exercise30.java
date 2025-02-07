package com.campusdual.classroom;

public class Exercise30 {



    public static int divisionWithCustomException(int dividend, int divisor) throws DivisionByZeroException {
        if (divisor == 0) {
            throw new DivisionByZeroException("Error: División por cero no permitida.");
        }
        return dividend / divisor;
    }

    public static void main(String[] args) {
        try {
            int result = divisionWithCustomException(10, 0);
            System.out.println("Resultado: " + result);
        } catch (DivisionByZeroException e) {
            System.out.println("Excepción capturada: " + e.getMessage());
        }
    }
}

