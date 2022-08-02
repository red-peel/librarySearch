public class Book extends Media{
    public Book(String title, String type, String genre, String author, int pageCount){
        super(title, type, genre, author);
        System.out.println("Media: " + title + ". has been created");
    }
}