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

        sayHello("Елизавета");
    }

    private static void sayHello(String name) {
        System.out.println("Привет " + name + "!");
    }


}

