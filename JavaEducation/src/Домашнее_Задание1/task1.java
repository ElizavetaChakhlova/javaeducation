package Домашнее_Задание1;
/**
 * Напишите следующий java класс:
 * public class Main {
 *     public static void main(String[] args) {
 *         // объявляю переменную
 *         String msg = "Hello" + " " + "Bob!";
 *         // вывожу строку в консоль
 *         System.out.println(msg);
 *     }
 * }
 * Скомпилируйте данный класс и далее выполните декомпиляцию для созданного во время компиляции "Main.class" файла.
 * Попробуйте объяснить, почему содержимое java и class файла разное ?
 */
public class task1 {
    public static void main(String[] args) {
        String msg = "Hello" + " " + "Bob!";
        System.out.println(msg);
    }

}
//файл class появляется во время компиляции файла java. Class содержит байтовый код, который выполняется виртуальной машиной