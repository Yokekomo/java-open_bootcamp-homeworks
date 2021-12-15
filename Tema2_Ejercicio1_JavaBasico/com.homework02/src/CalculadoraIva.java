/*
 * @author Albano Chicharro Altur
 * @date 15/12/2021
 * @version 1.0
 * Tema 2
 * Ejercicio 1
 */
public class CalculadoraIva {
    public static void main(String[] args) {

        double price = 1543.0;
        double addIva = 1.21d;
        double iva = 0.21d;
        double finalPrice = getPrice(price, addIva);
        double getIva = getPrice(price, iva);
        System.out.println(price + " Tv plana super mega pantalla");
        System.out.println(getIva + " Iva");
        System.out.println(finalPrice + " Precio final con Iva incluido");
    }

    static double getIva(double price, double iva) {
        return price * iva;
    }

    static double getPrice(double price, double addIva) {
        return price * addIva;
    }
}
