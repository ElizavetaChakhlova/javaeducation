package Домашнее_Задание1;

/**
 * Напишите метод который бы принимал время в секундах и возвращал форматированную строку.
 * Пример:
 * 	format(50); //вернёт "50 секунд""
 * 	format(90); //вернёт "1 минута 30 секунд"
 * 	format(3640); //вернёт "1 час 40 секунд"
 * 	format(-2); //вернёт "0 секунд"
 * 	format(0); //вернёт "0 секунд"
 */

public class task9 {
    public static void main(String[] args) {
        format(50);
    }

    private static void format(int i) {
        int second = 0;
        int minutes = 0;
        int hours = 0;

        if (i < 60)
            System.out.println(i + " секунд");
        else
            if (i <3600) {
            minutes = i/60;
            second = i % 60;
            System.out.println(minutes + " минут " + second + " секунд");
        }
        else {
            hours = i/3600;
            int k = i % 3600;
            if (k<60)
            System.out.println( hours + "час" + k + " секунд");
            else {
                minutes = k/60;
                second = k % 60;
                System.out.println( hours + "час" + minutes + " минут" + second + "секунд");
            }
            }
            }


    }

