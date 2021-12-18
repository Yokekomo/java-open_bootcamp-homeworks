package Tema7_8_9_Ejercicios_JavaBasico;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/*
Me ha llevado una eternidad investigar como hacerlo con:
    public static String reverse(String texto) {
    }

Este era el que pensé al principio, lo incluyo:
    public static void main(String[] args) {
        String texto = "Hola mundo";
        for (int i = texto.length() - 1; i >= 0; i--) {
            System.out.print(texto.charAt(i));
        }
    }
*/

public class PrintReverse {

    public static String reverse(String texto) {

        if (texto == null || texto.equals(""))
            return texto;

        List < Character > list = new ArrayList < Character > ();

        for (char i: texto.toCharArray())
            list.add(i);

        Collections.reverse(list);

        StringBuilder builder = new StringBuilder(list.size());
        for (Character i: list)
            builder.append(i);
        return builder.toString();
    }

    public static void main(String[] args) {
        String texto = "Hola mundo";

        texto = reverse(texto);
        System.out.println(texto);
    }
}