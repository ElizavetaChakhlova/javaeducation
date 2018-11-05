package Домашнее_Задание1;
/**
 * Напишите метод который бы проверял повторяются ли в переданном слове символы.
 * Пример:
 * 	containsRepeat("Актива"); // вернёт true
 * 	containsRepeat("Мышь"); // вернёт false
 */

public class task7 {
    public static void main(String[] args) {
        containsRepeat("пп");
    }

    private static void containsRepeat(String slovo) {
    String slovo2 = slovo.toLowerCase();
    boolean iscontains = false;
        for (int i=0; i < slovo2.length()-1; i++) {
            for (int j=i+1; j < slovo2.length(); j++) {
                if (slovo2.charAt(i) == slovo2.charAt(j)) iscontains = true;
            }
        }
        System.out.println(iscontains);
    }
}
