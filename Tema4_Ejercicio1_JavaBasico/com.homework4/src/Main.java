/*
 * @author Albano Chicharro Altur
 * @date 15/12/2021
 * @version 1.0
 * Tema 4
 * Ejercicio 1
 */
public class Main {

    public static void main(String[] args) {

        SmartDevice smartDevice = new SmartDevice();


        smartDevice= new SmartPhone("Xiaomi", "Mi", "Azul", 105.90, false, 64, 6.55, "4250 mAh", true);
        System.out.println(
                "Marca: " + SmartDevice.manufacturer + " - " +
                        "Modelo: " + SmartDevice.model + " - " +
                        "Color: " + SmartDevice.color + " - " +
                        "Precio: " + SmartDevice.price + "€" + " - " +
                        "Waterproof: " + SmartDevice.waterproof + " - " +
                        "Memory: " + SmartDevice.memory + "GB" + " - " +
                        "Pantalla: " + SmartDevice.screen + " - " +
                        "Bateria: " + SmartDevice.batery + " - " +
                        "Camara: " + SmartPhone.camera);

        smartDevice= new SmartPhone("Samsung", "Galaxy", "Rojo", 455.90, false, 128, 8.45, "6250 mAh", true);
        System.out.println(
                "Marca: " + SmartDevice.manufacturer + " - " +
                        "Modelo: " + SmartDevice.model + " - " +
                        "Color: " + SmartDevice.color + " - " +
                        "Precio: " + SmartDevice.price + "€" + " - " +
                        "Waterproof: " + SmartDevice.waterproof + " - " +
                        "Memory: " + SmartDevice.memory + "GB" + " - " +
                        "Pantalla: " + SmartDevice.screen + " - " +
                        "Bateria: " + SmartDevice.batery + " - " +
                        "Camara: " + SmartPhone.camera);

        smartDevice= new SmartWatch("Apple", "Watch", "Gold", 600.90, true, 64, 2.1, "2200 mAh");
        System.out.println(
                "Marca: " + SmartDevice.manufacturer + " - " +
                        "Modelo: " + SmartDevice.model + " - " +
                        "Color: " + SmartDevice.color + " - " +
                        "Precio: " + SmartDevice.price + "€" + " - " +
                        "Waterproof: " + SmartDevice.waterproof + " - " +
                        "Memory: " + SmartDevice.memory + "GB" + " - " +
                        "Pantalla: " + SmartDevice.screen + " - " +
                        "Bateria: " + SmartDevice.batery);
    }
}
