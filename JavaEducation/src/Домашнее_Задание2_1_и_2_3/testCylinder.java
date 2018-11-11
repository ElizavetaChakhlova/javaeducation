package Домашнее_Задание2_1_и_2_3;

public class testCylinder {
    public static void main(String[] args) {
    Cylinder b1 = new Cylinder();
    Cylinder b2 = new Cylinder(6);
    Cylinder b3 = new Cylinder(7, 3);
    Cylinder b4 = new Cylinder(4,2,"синий");

    b3.setHeight(4);

    System.out.println(b1.getVolume());
    System.out.println(b2.getVolume());
    System.out.println(b3.getVolume());
    System.out.println(b3.getHeight());
    System.out.println(b4.getVolume() + b4.getColor());
    }


}
