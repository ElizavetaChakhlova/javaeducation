package Домашнее_Задание4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class task2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(4);
        list.add(2);
        list.add(5);

        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);
    }
}
