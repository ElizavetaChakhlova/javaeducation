package Домашнее_Задание1;
/**
 * Напишите метод который принимает математическое выражение в формате String и возвращает результат.
 * В выражении используются только целые числа, поддерживаемые операции:+,-.
 * Пример:
 * 	math("2-1"); // вернёт [1]
 * 	math("2- +1"); // вернёт [1]
 * 	math(" 2-  -1"); // вернёт [3]
 */

public class task12 {
    public static void main(String[] args) {
        math("2 - + 1");
    }

    private static void math(String s) {
        int a = 0;
        int b = 0;
        char c = 43;
        char d = 43;
        int result = 0;
        boolean aa = false;
        boolean cc = false;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != 32 && s.charAt(i) != 43 && s.charAt(i) != 45 && aa == false) {
            a = Integer.valueOf(String.valueOf(s.charAt(i)));
            aa = true;
            }
            if (s.charAt(i) != 32 && s.charAt(i) != 43 && s.charAt(i) != 45 && aa == true) {
                b = Integer.valueOf(String.valueOf(s.charAt(i)));
            }

    }

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 45 || s.charAt(i) == 43 && cc == false) {
                c = s.charAt(i);
                cc = true;
            }
            if (s.charAt(i) == 45 || s.charAt(i) == 43 && cc == true) {
                d = s.charAt(i);
            }
        }

        if (c == 45 && d == 45){
            result = a - - b;
        }
        else {
            if (c == 45 || d == 45) {
                result = a - b;
            } else {
                result = a + b;

            }
        }
        System.out.println(result);
    }

}
