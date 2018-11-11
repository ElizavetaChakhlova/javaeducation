package Домашнее_Задание2_2;

public class Book {
    private String name;
    private Author author;
    private double price;
    private Author authorSecond;

    //getter
    public String getName (){
        return name;
    }
    public Author getAuthor (){
        return author;
    }
    public Author getAuthor2 (){
        return authorSecond;
    }
    public double getPrice(){
        return price;
    }

    //setter
    void setName(String name) {
        this.name = name;
    }
    void setAuthor(Author author) {
        this.author = author;
    }
    void setPrice(double price) {
        this.price = price;
    }

    //публичный конструктор
    public Book (String name1, Author author1, double price1) {
        name = name1;
        author = author1;
        price = price1;
    }

    //публичный конструктор, который позволяет задать несколько авторов
    public Book (String name1, Author author1, Author author2, double price1) {
        name = name1;
        author = author1;
        price = price1;
        authorSecond = author2;
    }

    //Написать новые методы для класса Book называемые getAuthorName() и getAuthorEmail() и getAuthorGender()
    public String getAuthorName (){
        if (authorSecond == null) {
            return getAuthor().getName();
        }
        else {
            return getAuthor().getName() + getAuthor2().getName();
        }
    }

    public String getAuthorEmail (){
        return getAuthor().getEmail();
    }

    public char getAuthorGender (){
        return getAuthor().getGender();
    }

    public String toString() {
        return "name = " + getName() + " Author[" + getAuthor().toString() +"], " + getPrice() ;
    }

}
