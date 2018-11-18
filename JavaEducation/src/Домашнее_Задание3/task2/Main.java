package Домашнее_Задание3.task2;


/**
 * Ваша задача - отсортировать заданную строку. Каждое слово в строке будет содержать одно число. Это число - это позиция, которую должно иметь слово в результате.
 * Примечание. Числа могут быть от 1 до 9.
 * Если входная строка пуста, верните пустую строку. Слова во входной строке будут содержать только допустимые последовательные числа.
 *
 * Примеры:
 *      "is2 Thi1s T4est 3a"  -->  "Thi1s is2 3a T4est"
 *      "4of Fo1r pe6ople g3ood th5e the2"  -->  "Fo1r the2 g3ood 4of th5e pe6ople"
 *      ""  -->  ""
 */
public class Main {
    public static void main(String[] args) {
        String Stroka = "4of Fo1r pe6ople g3ood th5e the2";
        //Делаем из строки массив, разделитель - пробел
        String[] isbnStroka = Stroka.split(" ");

        //логическая переменная, показывает, нужно ли менять местали слова
        boolean replace = true;

        //выполняем цикл до тех пор, пока слова нужно менять местами
        while (replace) {

            replace = false;
            //сравниваем элемент со следующим
            for (int i = 0; i < isbnStroka.length - 1; i++) {

                //получаем цифры из слов
                int digit1 = Integer.parseInt(isbnStroka[i].replaceAll("[^1-9]+", ""));
                int digit2 = Integer.parseInt(isbnStroka[i+1].replaceAll("[^1-9]+", ""));
                String word3;
                //если цифра в слове, больше, чем в следующем слове, то меняем местами слова
                if (digit1 > digit2) {
                    word3 = isbnStroka[i]; isbnStroka[i] = isbnStroka[i + 1]; isbnStroka[i + 1] = word3;
                    //снова устанавливаем, что нужно менять слова (продолжать цикл while)
                    replace = true;
                }
            }
        }


        for (int i = 0; i < isbnStroka.length ; i++) {
            System.out.println(isbnStroka[i]);
        }

    }

}