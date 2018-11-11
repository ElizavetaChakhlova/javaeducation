package Домашнее_Задание2_1_и_2_3;

class Cylinder extends Circle {
    private double height;

    // геттер и сеттер для высоты
    public double getHeight() {
        return height;
    }
    void setHeight(double height) {
        this.height = height;
    }

    // 4 конструктора
    public Cylinder() {
        super();
        height = 2.0;
    }
    public Cylinder(double radius) {
        super(radius);
        height = 1.0;
    }
    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }
    public Cylinder(double radius, double height, String color) {
        super (radius, color);
        this.height = height;
    }
    // вычисляеи и возвращаем объем цилиндра
    public double getVolume() {
        return getArea()*height;
    }
}