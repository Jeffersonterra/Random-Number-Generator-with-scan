import java.lang.Math;
import java.util.Scanner;

public class RandomNumber {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println(
                "The random number generator will generate a number, input the minimum and maximum values for the number generator: ");
        int min = sc.nextInt();
        int max = sc.nextInt();
       /* // Generate random double value from 200 to 400
        System.out.println("Random value of type double between " + min + " to " + max + ":");
        double a = Math.random() * (max - min + 1) + min;
        System.out.println(a);*/
        // Generate random int value from 200 to 400
        System.out.println("Random value of type int between " + min + " to " + max + ":");
        int b = (int) (Math.random() * (max - min + 1) + min);
        System.out.println(b);
    }

}
