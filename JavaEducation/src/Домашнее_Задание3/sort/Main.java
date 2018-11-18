package Домашнее_Задание3.sort;

import java.util.ArrayList;

/**
 * Напишите метод sortCards() который сортирует перетасованный список карт, так что любой список карт сортируется по рангу, независимо от начальной коллекции.
 * Все карты в списке представлены в виде строк, так что отсортированный список карт выглядит следующим образом:
 * ['A', '2', '3', '4', '5', '6', '7', '8', '9', 'T', 'J', 'Q', 'K']
 * <p>
 * Пример:
 * sortCards(new String[]['3', '9', 'A', '5', 'T', '8', '2', '4', 'Q', '7', 'J', '6', 'K'])
 * ['A', '2', '3', '4', '5', '6', '7', '8', '9', 'T', 'J', 'Q', 'K']
 */
public class Main {
    public static void main(String[] args) {

        sortCards(new String[]{"3", "9", "A", "5", "T", "8", "2", "4", "Q", "7", "J", "6", "K"});
    }

    private static void sortCards(String[] strings) {

        String[] sort = new String[13];

        for (int i = 0; i < strings.length; i++) {

            switch (strings[i]) {
                case "A":
                    sort[0] = strings[i];
                    break;
                case "2":
                    sort[1] = strings[i];
                    break;
                case "3":
                    sort[2] = strings[i];
                    break;
                case "4":
                    sort[3] = strings[i];
                    break;
                case "5":
                    sort[4] = strings[i];
                    break;
                case "6":
                    sort[5] = strings[i];
                    break;
                case "7":
                    sort[6] = strings[i];
                    break;
                case "8":
                    sort[7] = strings[i];
                    break;
                case "9":
                    sort[8] = strings[i];
                    break;
                case "T":
                    sort[9] = strings[i];
                    break;
                case "J":
                    sort[10] = strings[i];
                    break;
                case "Q":
                    sort[11] = strings[i];
                    break;
                case "K":
                    sort[12] = strings[i];
            }
        }
        for (int i = 0; i < sort.length; i++) {
            if (sort[i] != null)
            System.out.println(sort[i]);
        }
    }
}