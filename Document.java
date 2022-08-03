public class Document extends Media{
    
    private boolean isConfidential;
    private boolean isConfidentialAvailable;

    // CONSTRUCTOR with confidential
    public Document(String title, String type, String genre, String author,boolean isAvailable, boolean isConfidential) {
        super(title, type, genre, author,isAvailable);
        this.isConfidential = isConfidential;
        isConfidentialAvailable = true;
        // UNCOMMENT BELOW TO SEE WHEN OBJECT HAS BEEN CREATED
        System.out.println("Document: " + this.title + ". has been created");
    }

    public Document(String title, String type, String genre, String author,boolean isAvailable){
        super(title, type, genre, author, isAvailable);
        isConfidentialAvailable = false;
        System.out.println("Document: " + this.title + ". has been created");
    }


    
    
    
    
    //other methods
    // returns the information of the document
    @Override
    public String getInfo() {
        if(isConfidentialAvailable){
            return this.toString() + " is a " + this.type + " Document. This Document is" +confidentialCheck() + " and is" + this.availibilityCheck() +" for checkout.";
        }
        else{
            return this.toString() + " is a " + this.type + " Document. This Document is" + this.availibilityCheck() +" for checkout.";
        }   
    }

    // returns the confidentialCheck strings
    public String confidentialCheck(){
        if(isConfidential){
            return "Confidential";
        }
        else{
            return "Not Confidential";
        }
    }


}