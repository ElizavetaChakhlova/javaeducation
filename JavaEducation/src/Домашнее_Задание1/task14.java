package Домашнее_Задание1;


/**
 * Напишите метод "invoke" который бы  изменял местами значения переменных без использования третьей.
 * Пример:
 * 	public static void main(String[] args) {
 *         Integer a = 1;
 *         Integer b = 2;
 *         invoke(a, b);
 *         System.out.println("a = " + a); // вернёт 2
 *         System.out.println("b = " + b); // вернёт 1
 */
public class task14 {

    public static void main(String[] args) {
        Integer a = 1;
        Integer b = 2;
        invoke(a,b);

    }

    private static void invoke(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
       System.out.println("a = " + a); // вернёт 2
       System.out.println("b = " + b); // вернёт 1
    }
}
