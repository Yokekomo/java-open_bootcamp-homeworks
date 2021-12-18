package Tema7_8_9_Ejercicios_JavaBasico;
import java.util.Vector;

/*
Si se rebasa la dimensión inicial guardando más elementos por ejemplo 1000,
la dimensión del vector se duplica por dos cada 10 elementos y se vuelven a copiar todos los elementos, así sucesivamente
hasta que quepan los 1000 elementos, dando como resultado elementos duplicados innecesariamente.
Si se pretende guardar un número grande de elementos se tiene que especificar el incremento de la capacidad del vector,
si no se quiere desperdiciar inútilmente la memoria del ordenador y provocar una lenta ejecución del programa.
 */

public class VectorProblem {
    public static void main(String[] args) {
        Vector<Integer> problem = new Vector();
        problem.add(1);
        problem.add(2);
        problem.add(3);
        System.out.println("Vector tamaño: " + problem.size() + " y capacidad: " + problem.capacity());
    }
}
