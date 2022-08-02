abstract class Media {
    protected String title;
    protected String type;
    protected String genre;
    protected String author;
    protected boolean isAvailable;

    public Media(String title, String type, String genre, String author, boolean isAvailable) {
        this.title = title;
        this.type = type;
        this.genre = genre;
        this.author = author;
        this.isAvailable = isAvailable;
    }

    @Override
    public String toString() {
        return title + " by " + author;
    }

    // setters (return nothing, print item)
    void setTitle(String title) {
        this.title = title;
        System.out.println("The title is set to " + this.title);
    }

    void setType(String type) {
        this.type = type;
        System.out.println("The type is set to " + this.type);
    }

    void setGenre(String genre) {
        this.genre = genre;
        System.out.println("The genre is set to " + this.genre);
    }

    void setAuthor(String author) {
        this.author = author;
        System.out.println("The author is set to " + this.author);
    }

    void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
        if (isAvailable) {
            System.out.println(getTitle() + " is now available");
        } else {
            System.out.println(getTitle() + " is now unavailable");
        }
    }

    // getters (return strings)
    public String getTitle() {
        return title;
    }

    public String getType() {
        return type;
    }

    public String getGenre() {
        return genre;
    }

    public String getAuthor() {
        return author;
    }

    // other methods
    // returns the string "available" or "unavailable" depending on isAvailable value (true or false)
    public String availibilityCheck(){
        if(isAvailable){
            return "available";
        }
        else{
            return "unavailable";
        }
    }

    // abstract
    abstract String getInfo();

}