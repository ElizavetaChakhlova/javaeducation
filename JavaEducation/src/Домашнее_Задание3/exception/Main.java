package Домашнее_Задание3.exception;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws MyExeption {
        Character[] strings = new Character[20];
        fillArray(strings);
        System.out.println(Arrays.toString(strings));

        // необходимо написать метод checkArray() который бы проверил, что в данном массиве содержатся только цифры
        // если оказалось что в массиве оказался другой символ - выбросить исключение
        //      и обработать его в методе main() - вывести в консоль какой элемент не подошёл под условие "только цифры".
        // если проверка прошла то необходимо вывести в консоль что проверка прошла
        checkArray(strings);

    }
    // идем по циклу, если noDigit, не равно true, то выводим совое исклчение, с переданным текстом ошибки
    private static void checkArray(Character[] strings) throws MyExeption {
        boolean noDigit;
            for (int i = 0; i < strings.length; i++) {
                noDigit = Character.isDigit(strings[i]);
                if (!noDigit) {
                    throw new MyExeption( "Элемент - " + strings[i] + ", под номером " + i + " не является цифрой. Программа дальше не пойдет:)");
                }
            }
            System.out.println("Проверка прошла, в масиве только цифры!");

    }
    // создали свое исключение
    public static class MyExeption extends Exception {
        public MyExeption (String message) {
            super(message);
        }
    }

    private static void fillArray(Character[] strings) {
        Random r = new Random();
        String alphabet = "1234567890b";
        for (int i = 0; i < strings.length; i++) {
            strings[i] = Character.valueOf(alphabet.charAt(r.nextInt(alphabet.length())));
        }
    }
}
