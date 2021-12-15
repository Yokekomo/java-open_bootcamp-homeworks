/*
 * @author Albano Chicharro Altur
 * @date 15/12/2021
 * @version 1.0
 * Tema 4
 * Ejercicio 1
 */
public class SmartPhone extends SmartDevice{

    public static boolean camera;

    public SmartPhone(){
    }

    public SmartPhone(String manufacturer, String model, String color, double price, boolean waterproof, int memory, double screen, String batery, boolean camara) {
        super(manufacturer, model, color, price, waterproof, memory, screen, batery);
        this.camera = camara;
    }
}
