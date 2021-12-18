package Tema7_8_9_Ejercicios_JavaBasico;
import java.io.IOException;

public class DividesByZero {
    public static void main(String[] args) {
        try {
            divides(9, 0);
        }catch (Exception e) {
            System.out.println("Esto no puede hacerse");
        }
    }
    public static int divides(int A, int B) throws ArithmeticException, IOException {
        int result = 0;
        try {
            result = A / B;
        }catch(ArithmeticException e) {
            throw new IOException();
        }finally {
            System.out.println("Demo de código");
        }
        return result;
    }
}
