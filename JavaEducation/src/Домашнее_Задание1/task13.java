package Домашнее_Задание1;
/**
 * Напишите метод который принимает ФИО и выводит на экран "Фамилия Имя"
 * Пример:
 * 	format("Гуляев Гавриил Парфеньевич"); // выведет на экран "Гуляев Гавриил"
 */
public class task13 {
    public static void main(String[] args) {
        format("Чахлова Елизавета Сергеевна");
    }

    private static void format(String fio) {
        String Familia = "";
        String Familia1 = "";
        boolean familia = false;
        String Imya = "";
        String Imya1 = "";

        for (int i = 0; i < fio.length(); i++) {

            if (fio.charAt(i) == 32 && familia == false) {
                familia = true;
                Familia1 = Familia;
            }
            else {
                Familia = Familia + String.valueOf(fio.charAt(i));
            }
            if (familia) {
                Imya = Imya + String.valueOf(fio.charAt(i));
                if (fio.charAt(i) == 32) {
                    Imya1 = Imya;
                }
            }
        }
        System.out.println(Familia1 + Imya1);
    }
}
