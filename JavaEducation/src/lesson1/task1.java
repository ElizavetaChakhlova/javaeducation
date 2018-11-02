package lesson1;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        System.out.println("Введите ваше имя:");
        Scanner scanner = new Scanner(System.in);
        String message = scanner.nextLine();
        scanner.close();
        System.out.println("Привет " + message);
    }
}
