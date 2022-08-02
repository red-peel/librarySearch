abstract class media{
    protected String title;
    protected String type;
    protected String genre;
    protected String author;

    void setTitle(String title){
        System.out.println("The title is set to " + this.title);
    }
    void setType(String type){
        System.out.println("The type is set to " + this.type);
    }
    void setGenre(String genre){
        System.out.println("The genre is set to " + this.genre);
    }
    void setAuthor(String author){
        System.out.println("The author is set to " + this.author);
    }
    
}