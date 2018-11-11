package Домашнее_Задание2_1_и_2_3;

public class TestCircle {

    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2;
        c2 =  new Circle(7, "Black" );

        System.out.println("Цвет c1 - " + c1.getColor() + "; Площадь c1 - " + c1.getArea());

        //меняем цвет и радиус у c1
        c1.setColor("голубой");
        c1.setRadius(10);

        System.out.println("Цвет c1 - " + c1.getColor() + "; Площадь c1 - " + c1.getArea());
        System.out.println("Цвет c2 - " + c2.getColor() + "; Площадь c2 - " + c2.getArea());

        //Здесь мы указываем, что вызываем метод toString() объекта c1
        System.out.println(c1.toString());

        //По умолчанию метод println() вызывает метод toString() объекта, переданного ему
        // Поэтому результат вывода такой же как в строке выше
        System.out.println(c1);
    }

}
