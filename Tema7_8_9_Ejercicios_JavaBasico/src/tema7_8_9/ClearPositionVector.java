package Tema7_8_9_Ejercicios_JavaBasico;

import java.util.Vector;

public class ClearPositionVector {
    public static void main(String[] args) {

        Vector<String> vector = new Vector();
        vector.add("Juan");
        vector.add("Pedro");
        vector.add("Marcos");
        vector.add("Julio");
        vector.add("Maria");
        vector.add("Francisco");
        vector.remove(1);
        vector.remove(2);

        System.out.println(vector);
    }
}
