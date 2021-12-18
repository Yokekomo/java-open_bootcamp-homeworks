package Tema7_8_9_Ejercicios_JavaBasico;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListString {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Juan");
        list.add("Pepe");
        list.add("Miguel");
        list.add("Enriqueta");

        LinkedList<String> linked = new LinkedList<String>(list);

        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
        for(int i = 0; i < linked.size(); i++){
            System.out.println(linked.get(i));
        }
    }
}
