package Домашнее_Задание1;

/**
 * Напишите метод который бы приветствовал человека по его имени, метод должен принимать один аргутмент String
 * и выводить на консоль приветствие.
 * Пример:
 * 	sayHello("олег"); //вернёт "Привет Олег!"
 * 	sayHello("ДЕНИС"); //вернёт "Привет Денис!"
 * 	sayHello(""); //вернёт "Привет!"
 */
public class task3 {
    public static void main(String[] args) {
        sayHello("ЛИДия");
    }

    private static void sayHello(String name) {
        if (name != "") {
            name = name.toLowerCase();
            String name1 = String.valueOf(name.charAt(0));
            name1 = name1.toUpperCase();
            String name2 = "";

            for (int i = 1; i < name.length(); i++) {
                name2 = name2 + String.valueOf(name.charAt(i));
            }
            System.out.println("Привет " + name1 + name2);
        }
        else {
            System.out.println("Привет ");
        }
    }


}

