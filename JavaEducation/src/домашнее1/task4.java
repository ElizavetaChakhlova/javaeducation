package домашнее1;

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
        int mas2[] = new int[k];


        for (k = 0; k < mas2.length; k++) {

            for (int i = 0; i < mas.length; i++ ) {
                if (mas[i]!=mas2[k])
                    mas2[k] = mas[i];
                k++;
            }
    }



        for (k = 0; k < mas.length; k++) {
            System.out.println(mas2[k]);
        }
    }
}
