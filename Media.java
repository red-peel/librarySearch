abstract class Media{
    protected String title;
    protected String type;
    protected String genre;
    protected String author;

    public Media(String title, String type, String genre, String author){
        this.title = title;
        this.type = type;
        this.genre = genre;
        this.author = author;
        System.out.println("Media: " + title + ". has been created");
    }
    //setters (return nothing, print item)
    void setTitle(String title){
        this.title = title;
        System.out.println("The title is set to " + this.title);
    }
    void setType(String type){
        this.type = type;
        System.out.println("The type is set to " + this.type);
    }
    void setGenre(String genre){
        this.genre = genre;
        System.out.println("The genre is set to " + this.genre);
    }
    void setAuthor(String author){
        this.author = author;
        System.out.println("The author is set to " + this.author);
    }
    
    //getters (return strings)
    protected String getTitle(){
        return title;
    }
    protected String getType(){
        return type;
    }
    protected String getGenre(){
        return genre;
    }
    protected String getAuthor() {
        return author;
    }
    //abstract
    abstract String getInfo();
}