package Домашнее_Задание1;

import java.util.Scanner;

/**
 * Напишите метод который принимает String и возвращает данную строку в обратном порядке символов.
 * Пример:
 * 	reverseWord("переверни строку"); //вернёт "укотрс инревереп"
 */
public class task2 {
    public static void main(String[] args) {
        System.out.println("Введите строку:");
        Scanner scanner = new Scanner(System.in);
        String message = scanner.nextLine();
        scanner.close();
        String message1 = "";

        for (int i = message.length() - 1; i >= 0; i--) {
            String m = String.valueOf(message.charAt(i));
            message1 = message1 + m;
        }

        System.out.println("Строка наоборот " + message1);
    }
}
