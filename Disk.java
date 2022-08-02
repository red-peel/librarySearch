public class Book extends Media {
    private int pageCount;
    private boolean isPageCountEnabled;

    // CONSTRUCTOR WITH NO PAGE NUMBER
    public Book(String title, String type, String genre, String author,boolean isAvailable) {
        super(title, type, genre, author,isAvailable);
        isPageCountEnabled = false;
        // UNCOMMENT BELOW TO SEE WHEN OBJECT HAS BEEN CREATED
        // System.out.println("Book: " + title + ". has been created");
    }
    @Override
    public String getInfo() {
        return this.toString() + " is a " + this.type + " book with: " + this.pageCount + " pages. Its genre: " + this.genre + "and it is "+ this.availibilityCheck();
    }
}