package lesson1;
/**
 * Напишите метод который принимает ФИО и выводит на экран "Фамилия Имя"
 * Пример:
 * 	format("Гуляев Гавриил Парфеньевич"); // выведет на экран "Гавриил Гуляев"
 */
public class task13 {
    public static void main(String[] args) {
        format("Иванова Иван Иванович");
    }
    private static void format(String s) {
        String familia = "г";
        String imya = "";
        String otchestvo = "";

        for (int i = 0; i < s.length(); i++ ) {
            familia = familia + String.valueOf(s.charAt(i));
                if (String.valueOf(s.charAt(i)) == "")
                    System.out.println(familia);
        }
}

}
