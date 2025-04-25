public class Main {
    public static void main(String[] args) {

        Author author1 = new Author("Александр", "Пушкин");
        Author author2 = new Author("Лев", "Толстой");

        Book book1 = new Book("Евегений Онегин", author1, 1820);
        Book book2 = new Book("Война и мир", author2, 1868);

        System.out.println("book1.getYear() = " + book1.getYear());
        book1.setYear(1984);
        System.out.println("book1.getYear() = " + book1.getYear());
        System.out.println("book1.getTitle() = " + book1.getTitle());
        System.out.println("book1.getAuthor() = " + book1.getAuthor().getName() + " " + book1.getAuthor().getSurname());
        System.out.println("book2.getTitle() = " + book2.getTitle());
        System.out.println("book2.getAuthor() = " + book2.getAuthor().getName() + " " + book2.getAuthor().getSurname());
        System.out.println("book2.getYear() = " + book2.getYear());
        System.out.println(author1.toString());
        System.out.println(book1.toString());
        System.out.println(book1.equals(book2));
        System.out.println(author1.equals(author2));
        System.out.println(book1.hashCode());
        System.out.println(book2.hashCode());
        System.out.println(author1.hashCode());
        System.out.println(author2.hashCode());
    }
}