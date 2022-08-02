abstract class media{
    protected String title;
    protected String type;
    protected String genre;
    protected String author;
    
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

    abstract String getInfo();
}