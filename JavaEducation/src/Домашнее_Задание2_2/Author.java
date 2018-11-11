package Домашнее_Задание2_2;

/**
 * -- задание на композицию --
 * Класс Author, предназначен для моделирования автора книги.
 * Этот класс должен содержать:
 * - Три приватных переменных: name(String), email(String) и gender(char ('m' или 'f'));
 * и соответвтсвущие для них геттеры/сеттеры.
 * - Один конструктор для инициализации name, email и gender переданными значениями.
 * - Метод toString() который возвращает краткую инфомацию об экземпляре класса, к примеру:
 * Author[name=Mayakovskiy,email=mayakovskiy@mail.ru,gender=m]
 * Напишите этот класс а также напишите второй класс который бы выводил значения всех публичных методов у класса Author.
 */
public class Author {
    private String name;
    private String email;
    private char gender;

    public Author(String name1, String email1, char gender1) {
        if (gender1 == 'm' || gender1 == 'f') {
            name = name1;
            email = email1;
            gender = gender1;
        }
        else {
            System.out.println("gender должен быть мужской - 'm' или женский - 'f'");
        }
    }

    public String getName (){
        return name;
    }
    public String getEmail (){
        return email;
    }
    public char getGender (){
        return gender;
    }

    void setName(String name) {
        this.name = name;
    }
    void setEmail(String email) {
        this.email = email;
    }
    void setGender(char gender) {
        if (gender == 'm' || gender == 'f') {
            this.gender = gender;
        }
        else {
            System.out.println("gender должен быть мужской - 'm' или женский - 'f'");
        }
    }

    public String toString() {
        return "name = " + getName() + ", email = " + getEmail() + ", gender = " + getGender();
    }
}