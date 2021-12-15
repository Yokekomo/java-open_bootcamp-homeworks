/*
 * @author Albano Chicharro Altur
 * @date 15/12/2021
 * @version 1.0
 * Tema 4
 * Ejercicio 1
 */
public class SmartDevice {

    static String manufacturer;
    static String model;
    static String color;
    static double price;
    static boolean waterproof;
    static int memory;
    static double screen;
    static String batery;

    public SmartDevice(){
    }

    public SmartDevice(String manufacturer, String model, String color, double price, boolean waterproof, int memory, double screen, String batery) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.color = color;
        this.price = price;
        this.waterproof = waterproof;
        this.memory = memory;
        this.screen = screen;
        this.batery = batery;
    }
}
