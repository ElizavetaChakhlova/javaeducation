package домашнее1;

/**
 * Напишите метод который бы маскировал все символы кроме 2-ух последних.
 * Пример:
 * 	mask("85632983256"); // вернёт "#########56"
 * 	mask("56"); // вернёт "##"
 * 	mask("3"); // вернёт "3"
 * 	mask(""); // вернёт ""
 * 	mask("ierfu"); // вернёт "###fu"
 */

public class task5 {
    public static void main(String[] args) {

        mask("ierfu");
    }
        private static void mask (String message){

            String message1 = "";
            if (message.length() > 2) {
                for (int i = 0; i < message.length() - 2; i++) {
                    String m = "#";
                    message1 = message1 + m;
                }
                String message2 = String.valueOf(message.charAt(message.length() - 2)) + String.valueOf(message.charAt(message.length() - 1));
                System.out.println(message1 + message2);
            } else {
                if (message.length() == 2) {
                    System.out.println("##");
                }
                if (message.length() == 1) {
                    System.out.println(message);
                }
            }
        }

    }


