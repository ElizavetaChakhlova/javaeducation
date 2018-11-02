package lesson1;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String message = scanner.nextLine();
        scanner.close();
        String message1;
        //message1 = reverseWord(message);
    }

    private void reverseWord(String message) {
       int i = message.length();
       String h;

        for (message.charAt(i); message.charAt(i) == message.charAt(0); i--) {

            h = String.valueOf(message.charAt(i) + message.charAt(i));
            //return h;
        }

    }
}


