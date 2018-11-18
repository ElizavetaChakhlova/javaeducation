package Домашнее_Задание3.welcome;

import java.util.Scanner;

/**
 * Ваш сайт имеет большую аудиторию в Скандинавии и соседних странах.
 * Маркетинг считает, что было бы здорово приветствовать посетителей сайта на их родном языке.
 * К счастью, вы уже используете API, который определяет местоположение пользователя..
 *
 * Задание:
 * Подумайте о способе хранения языков как enum. Языки перечислены ниже.
 * Напишите функцию «добро пожаловать», которая принимает параметр «язык» (всегда строка)
 * и возвращает приветствие - если оно есть в вашей базе.
 * Он должен иметь значение по умолчанию - английский язык, если язык отсутствует в базе или в случае недопустимого ввода.
 *
 * База:
 * english: 'Welcome',
 * czech: 'Vitejte',
 * danish: 'Velkomst',
 * dutch: 'Welkom',
 * estonian: 'Tere tulemast',
 * finnish: 'Tervetuloa',
 * flemish: 'Welgekomen',
 * french: 'Bienvenue',
 * german: 'Willkommen',
 * irish: 'Failte',
 * italian: 'Benvenuto',
 * latvian: 'Gaidits',
 * lithuanian: 'Laukiamas',
 * polish: 'Witamy',
 * spanish: 'Bienvenido',
 * swedish: 'Valkommen',
 * welsh: 'Croeso'
 */
public class Main {

    public enum countries {english, czech, danish, dutch, estonian, finnish, flemish, french, german,
        irish, italian, latvian, lithuanian, polish, spanish, swedish, welsh }

    public static void main(String[] args) {

//вводим в консоль страну, если страна не совпадает со списком countries, то выводим стандартное приветствие Welcome
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        try {
            countries country = countries.valueOf(str);

            switch (country) {
                case english:
                    System.out.println("Welcome");
                    break;
                case czech:
                    System.out.println("Vitejte");
                    break;
                case danish:
                    System.out.println("Velkomst");
                    break;
                case dutch:
                    System.out.println("Welkom");
                    break;
                case estonian:
                    System.out.println("Tere tulemast");
                    break;
                case finnish:
                    System.out.println("Tere tulemast");
                    break;
                case flemish:
                    System.out.println("Welgekomen");
                    break;
                case french:
                    System.out.println("Bienvenue");
                    break;
                case german:
                    System.out.println("Willkommen");
                    break;
                case irish:
                    System.out.println("Failte");
                    break;
                case italian:
                    System.out.println("Benvenuto");
                    break;
                case latvian:
                    System.out.println("Gaidits");
                    break;
                case lithuanian:
                    System.out.println("Laukiamas");
                    break;
                case polish:
                    System.out.println("Witamy");
                    break;
                case spanish:
                    System.out.println("Bienvenido");
                    break;
                case swedish:
                    System.out.println("Valkommen");
                    break;
                case welsh:
                    System.out.println("Croeso");
                    break;
            }


        } catch (IllegalArgumentException e) {System.out.println("Welcome");}

        scanner.close();

    }

}




