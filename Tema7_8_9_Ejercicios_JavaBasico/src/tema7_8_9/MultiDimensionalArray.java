package Tema7_8_9_Ejercicios_JavaBasico;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3},
                {4, 5, 6}
        };

        for(int i = 0; i < array.length; i++) {
                for(int j = 0; j < array[i].length; j++) {
                System.out.println("Posición de i:" + i + " + j:" + j + " / Tiene el valor: " + array[i][j]);
            }
        }
    }
}
