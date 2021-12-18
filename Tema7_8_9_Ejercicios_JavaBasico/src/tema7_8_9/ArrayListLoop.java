package Tema7_8_9_Ejercicios_JavaBasico;
import java.util.ArrayList;

public class ArrayListLoop {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<Integer>();

        for(int i=1; i <= 10; i++){
            numbers.add(i);
        }
        for(int i=0; i < numbers.size(); i++){
            numbers.removeIf(n -> (n%2 == 0));
        }
        for(int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
