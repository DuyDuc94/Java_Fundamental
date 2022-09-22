import java.util.Scanner;

/*Given a class Book defined as having the following attributes:
Author author;
String title;
int noOfPages;
boolean fiction;
Actually code and compile the Book class based on the attributes and get/set methods. Write a main program to test all the above operations */

class Book {
    private Author author;
    private String title;
    private int noOfPages;
    private boolean fiction;

    public Book() {}
    public Book(Author author, String title, int noOfPages, boolean fiction) {
        this.author = author;
        this.title = title;
        this.noOfPages = noOfPages;
        this.fiction = fiction;
    }
    public void setAuthor(Author author){
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setNoOfPages(int noOfPages) {
        this.noOfPages = noOfPages;
    }

    public void setFiction(boolean fiction) {
        this.fiction = fiction;
    }

    @Override
    public String toString(){
        return "Book{" + "author=" + author + ", title=" + title + ", noOfPages=" + noOfPages + ", fiction=" + fiction + '}';
    }
}
class Author{
    private String name;

    public Author(String name){
        this.name = name;
    }
    
    @Override
    public String toString() {
        return "author{name=" + name + "}";
    }
}

public class Ws3o1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book book = new Book();
        
        System.out.println("Input author: ");
        Author author = new Author(sc.nextLine());

        
        book.setAuthor(author);
        // System.out.println("Input title: ");
        book.setTitle(sc.nextLine());
        // System.out.println("Input noOfPages: ");
        book.setNoOfPages(sc.nextInt());
        // System.out.println("Input fiction: ");
        book.setFiction(sc.nextBoolean());

        System.out.println(book);
     }
}
