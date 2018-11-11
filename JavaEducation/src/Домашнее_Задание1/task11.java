package Домашнее_Задание1;

// НЕ РАБОТАЕТ!

/**
 * Дан n x n массив, верните массив элементов в порядке их расположения начиная от внешних элементов двигаясь к среднему перемещаясь по часовой стрелке.
 * Пример:
 * 	arr = [[1,2,3],
 * 		   [4,5,6],
 * 		   [7,8,9]] // вернёт [1,2,3,6,9,8,7,4,5]
 * 	arr = [] // вернёт []
 */

public class task11 {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3}, {4,5,6}, {7,8,9}};

        int n =3;
        for (int k = n; k > 2; k-- ) {
            for (int i = 0; i < k; i++) {
                if (i == 0) {
                    for (int j = 0; j < k; j++) {

                        if (j == k-1) {
                            int per = arr[i][k-1];
                            System.out.println(per);
                        }
                        else {
                            int per = arr[0][j];
                            System.out.println(per);
                        }


                        }
                }
                else {

                }
            }

        }

    }
}
