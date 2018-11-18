package Домашнее_Задание3.out;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

/**
 * Напишите программу которая бы считывала Имена которые пользователь забивал в консоль,
 * принимать данные до тех пор пока пользователь не напишет слова exit, quit или close
 * Все данные которые ввёл пользователь необходимо записать в файл в алфавитном порядке
 */
public class Main {
    public static void main(String[] args) throws IOException {
        Path names = Paths.get("JavaEducation/src/Домашнее_Задание3/out/names.txt");
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> data = new ArrayList<>();
        String name = "Имя";

        while (!(name.equalsIgnoreCase("exit") || name.equalsIgnoreCase("quit")  || name.equalsIgnoreCase("close"))) {
            name = scanner.nextLine();
            data.add(name);
        }
        Collections.sort(data, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareToIgnoreCase(o2);
            }
        });

        Files.write(names, data);
        scanner.close();

        System.out.println(Files.readAllLines(names));
    }
}
