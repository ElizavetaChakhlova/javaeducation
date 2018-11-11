package Домашнее_Задание1;

/**
 * Напишите метод который принимает массив int и возвращает этот массив без дубликатов.
 * Пример:
 * 	delDuplicates([1,2,3,4,3,2,5]); // вернёт [1,2,3,4,5]
 * 	delDuplicates([]); // вернёт []
 */

public class task4 {
    public static void main(String[] args) {
        int k = 0;
        int mas[] = {1, 3, 3};
        int mas2[] = new int[mas.length];


        for (int j = 0; j < mas.length; j++) {
            boolean isDuplicate = false;
            for (int i = 0; i < mas2.length; i++ ) {
                if (mas[j] == mas2[i]) isDuplicate = true;
            }
            if (!isDuplicate) {mas2[k] = mas[j];k++;}
        }

        for (int m = 0; m < mas2.length; m++) {
            System.out.println(mas2[m]);
        }
    }
}
