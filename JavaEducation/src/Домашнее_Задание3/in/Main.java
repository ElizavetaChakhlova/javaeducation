package Домашнее_Задание3.in;

import java.util.Scanner;

/**
 * Напишите программу которая бы считывала данные из консоли до тех пор пока пользователь не напишет слова exit, quit или close
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = "Старт!";

    //в цикле проверяем, что если пользователь ввел одно из стоп-слов, то завершаем программу, закрываем сканер
        while (!(str.equalsIgnoreCase("exit") || str.equalsIgnoreCase("quit")  || str.equalsIgnoreCase("close"))) {
            str = scanner.nextLine();
        }

        scanner.close();

    }
}
