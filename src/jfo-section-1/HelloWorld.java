import javax.swing.JOptionPane;
import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your grade level (number): ");
        int grade = sc.nextInt();
        System.out.println("Next year, you are in grade " + (grade+1));

        sc.close();

        System.out.println("Hello World!");

        byte x = 2;
        short y = 1000;
        int z = 10000;
        long w = 1_000_000_000_000L;

        int i = 0;
        while (i < 10)
        {
            System.out.print(i++); // prints og value and then adds one
        }

        int j = 0;
        System.out.println(x: "\nj loop");
        while (j < 10)
        {
            System.out.println(++j); //adds one first then prints
        }
        
    }
}
