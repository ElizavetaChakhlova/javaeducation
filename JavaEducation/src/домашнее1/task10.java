package домашнее1;

/**
 * Напишите метод который бы принимал параметр String - номер телефона 10 символов (от 0 до 9) и возвращал отформатированный номер.
 * Пример:
 * 	format("9136758070"); //вернёт "+7 (913) 675-80-70"
 */
public class task10 {
    public static void main(String[] args) {
        formatNumber("9136758070");
    }

    private static void formatNumber(String s) {
        if (s.length()!=10)
            System.out.println("Введите 10 цифр номера телефона, без 7 и 8");
        else {
            String number = "+7 (" + s.charAt(0) + s.charAt(1) + s.charAt(2) + ") " + s.charAt(3) + s.charAt(4) + s.charAt(5) + "-" + s.charAt(6) + s.charAt(7) + "-" + s.charAt(8) + s.charAt(9);
            System.out.println(number);
        }
    }
}
