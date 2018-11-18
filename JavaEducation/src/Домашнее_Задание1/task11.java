package Домашнее_Задание1;

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
        //int[][] arr = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16}};
        int i = 0;
        int j = 0;
        int step = 0;
        int n = arr.length;
        int k = n;

        //Цикл равный длине пути змейки
        for (int elems = 0; elems < n*n; elems++)  {

            System.out.println(arr[i][j]);
            //Выбор направления движения, в зависимости от остатка от деления
            switch (step % 4)
            {
                //i - неизменно, j - растет
                case 0:
                    if (j < k - 1)
                        j++;
                    else {
                        i++;
                        step++;
                    }
                    break;
                //i - растет, j - неизменно
                case 1:
                    if (i < k - 1)
                        i++;
                    else {
                        j--;
                        step++;
                    }
                    break;
                //i - неизменно, j - уменьшается
                case 2:
                    if (j > n - k)
                        j--;
                    else {
                        i--;
                        step++;
                        k--;
                    }
                    break;
                //i - уменьшается, j - неизменно
                case 3:
                    if (i > n - k)
                        i--;
                    else {
                        j++;
                        step++;
                    }
                    break;
            }

        }


        }


    }

