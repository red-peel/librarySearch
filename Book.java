public class Book extends Media {
    private int pageCount;
    private boolean isPageCountEnabled;

    // CONSTRUCTOR WITH NO PAGE NUMBER
    public Book(String title, String type, String genre, String author,boolean isAvailable) {
        super(title, type, genre, author,isAvailable);
        isPageCountEnabled = false;
        // UNCOMMENT BELOW TO SEE WHEN OBJECT HAS BEEN CREATED
        System.out.println("Book: " + title + ". has been created");
    }

    // CONSTRUCTOR WITH PAGE NUMBER
    public Book(String title, String type, String genre, String author, boolean isAvailable, int pageCount) {
        super(title, type, genre, author, isAvailable);
        this.pageCount = pageCount;
        isPageCountEnabled = true;
        // UNCOMMENT BELOW TO SEE WHEN OBJECT HAS BEEN CREATED
        System.out.println("Book: " + title + ". has been created with: " + this.pageCount + " pages");
    }
    
    // other methods
    // returns information about the book depending on the existence of the pageCount
    @Override
    public String getInfo() {
        if (isPageCountEnabled) {
            return this.toString() + " is a " + this.type + " book with: " + this.pageCount + " pages. Its genre: " + this.genre + "and it is "+ this.availibilityCheck();
        } else {
            return this.toString() + " is a " + this.type + ". Its genre is " + this.genre + " and it is "+ this.availibilityCheck();
        }
    }
}