package Домашнее_Задание1;
/**
 * Напишите метод который бы принимал аргумент типа int и возвращал его факториал.
 * Пример:
 * 	factorial(3); //вернёт 6
 * 	factorial(-3); //вернёт 0
 * 	factorial(0); //вернёт 0
 */
public class task8 {
    public static void main(String[] args) {
        factorial(9);
    }

    private static void factorial(int i) {
        int fact = 1;
        if (i > 0) {
            for (int j = 1; j <= i; j++) {
                fact = fact * j;
            }
            System.out.println(fact);
        }
        else
            System.out.println("0");
    }

}
