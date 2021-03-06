package cipher;
// Import for scanner
import model.Decode;
import model.Encode;

import javax.sound.sampled.AudioFormat;
import java.util.Locale;
import java.util.Scanner;

public class cipher {
    public static void main(String[] args) {
        String message;
        Integer shiftKey;
        Scanner sc = new Scanner(System.in);
        System.out.println("WELCOME TO CAESAR CIPHER APPLICATION");
        System.out.println("Please select option(either 1 or 2); 1.to Encrypt or  2.to Decrypt");

        int option=sc.nextInt(); // .nextInt() is used with integers
        sc.nextLine(); // .nextLine() is used with strings

        if(option==1){
            System.out.println("Input message to encrypt:");
            message=sc.nextLine().toUpperCase();
            System.out.println("Input preferred shift key between 1 and 26:");
            shiftKey=sc.nextInt();

            Encode encode = new Encode(message, shiftKey);
            System.out.println(String.format("Your input text was:%s", encode.getMessage()));
            System.out.println(String.format("Your encrypted message is:%s",encode.encrypt()));

        } else if (option==2) {
            System.out.println("Input the text to decrypt:");
            message=sc.nextLine().toUpperCase();
            System.out.println("Input preferred shift key between 1 and 26:");
            shiftKey=sc.nextInt();

            Decode decode= new Decode(shiftKey, message);
            System.out.println(String.format("Your input text was:%s", decode.getMessage()));
            System.out.println(String.format("Your decrypted message is:%s",decode.decrypt()));

        }else{
            System.out.println("This is not among the given options");
        }
    }
}
