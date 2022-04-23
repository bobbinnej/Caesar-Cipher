package cipher;
// Import for scanner
import java.util.Scanner;

public class cipher {
    public static void main(String[] args) {
        //Declare your variables
        String message;
        int shiftKey;
        // Begin with gathering user input using scanner
        Scanner sc = new Scanner(System.in);
        /* Expected input is like
        String message = "HELLO WORLD";
         */
        System.out.print("Please input the message to encrypt:\n");
        //.nextLine(); is used with strings
        message= sc.nextLine();

          /* Expected input is like
        int shiftKey = "-14";
         */
        System.out.println("Input desired shift key ( number between 1 and 25:)");
        //.nextInt(); is used with integers
        shiftKey=sc.nextInt();



    }
}
