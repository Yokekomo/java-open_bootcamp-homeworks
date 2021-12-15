/*
 * @author Albano Chicharro Altur
 * @date 15/12/2021
 * @version 1.0
 * Tema 5
 * Ejercicio 1
 */
public class Main {

   public static void main(String[] args) {

        CocheCRUDImpl coche = new CocheCRUDImpl();

        coche.save();
        coche.findAll();
        coche.delete();
    }
}