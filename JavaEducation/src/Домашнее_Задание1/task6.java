package Домашнее_Задание1;
/**
 * Напишите метод который бы принимал int и возвращал его отрицательно значение.
 * Пример:
 * 	negative(3); //вернёт -3
 * 	negative(0); //вернёт 0
 * 	negative(-12); //вернёт -12
 */
public class task6 {
    public static void main(String[] args) {
        negative(0);
    }

    private static void negative(int i) {
        if (i>0) {
            i = -1 * i;
            System.out.println(i);
        }
     else
        System.out.println(i);
    }
}
