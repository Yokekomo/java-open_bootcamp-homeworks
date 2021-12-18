package Tema7_8_9_Ejercicios_JavaBasico;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class CopiedTo {
    public static void main(String[] args) {
        try {
            InputStream fileIn = new FileInputStream("/fileIn.txt");
            byte[] file = fileIn.readAllBytes();
            fileIn.close();
            PrintStream fileOut = new PrintStream("/fileOut.txt");
            fileOut.write(file);
            fileOut.close();
            System.out.println("Fichero copiado");
        }catch(Exception e){
            System.out.println("No se ha encontrado el fichero => " + e.getMessage());
        }finally {
            System.out.println("Fin programa");
        }
    }
}
