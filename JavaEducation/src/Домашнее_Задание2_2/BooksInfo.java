package Домашнее_Задание2_2;

public class BooksInfo {
    public static void main(String[] args) {
        Book book;
        Book book2;
        book = new Book("Евгений Онегин", new Author("Пушкин", "pushkin@yandex.ru", 'm') , 15000 );
        book2 = new Book ("Садоводство", new Author("Поливаева Е.И.", "polivoda@ya.ru", 'f'), new Author("Попова Н.И.", "popova@ya.ru", 'f'), 1670);
    // вывели в консоль name и email автора книги
    System.out.println("Имя автора книги " + book.getAuthor().getName() + " Эмейл автора книги " + book.getAuthor().getEmail() );
    System.out.println(book2.getAuthorName());
    System.out.println(book.getAuthorName());

    }
}
