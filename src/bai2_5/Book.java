package bai2_5;

public class Book {
    private String title;
    private  String author;
    private double price;

    public Book(String title, String author, double price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Book)) {
            return false;
        }
        Book other = (Book) obj;
        return title.equals(other.title) && author.equals(other.author) && price == other.price;
    }

    public static void main(String[] args) {
        Book b1 = new Book("Dao Duc Kinh", "Lao Tu", 100);
        Book b2 = new Book("Dao Duc Kinh", "Lao Tu", 100);
        Book b3 = b1;

        System.out.println("b1 == b2: " + (b1 == b2));
        System.out.println("b1.equals(b2) : " + (b1.equals(b2)));
        System.out.println("b1 == b3: " + (b1 == b3));
    }
}
