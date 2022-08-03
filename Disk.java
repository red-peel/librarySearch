public class Disk extends Media {
    private int lengthMinutes;
    private boolean isMinutesAvailable;

    public Disk(String title, String type, String genre, String author,boolean isAvailable) {
        super(title, type, genre, author,isAvailable);
        isMinutesAvailable = false;
        // UNCOMMENT BELOW TO SEE WHEN OBJECT HAS BEEN CREATED
        System.out.println("Disk: " + title + ". has been created");
    }

    // CONSTRUCTOR WITH MINUTES
    public Disk(String title, String type, String genre, String author,boolean isAvailable, int lengthMinutes) {
        super(title, type, genre, author,isAvailable);
        this.lengthMinutes = lengthMinutes;
        isMinutesAvailable = false;
        // UNCOMMENT BELOW TO SEE WHEN OBJECT HAS BEEN CREATED
        System.out.println("Disk: " + title + ". has been created");
    }
    // other methods
    // returns information about the disk
    @Override
    public String getInfo() {
        if (isMinutesAvailable){
            return this.toString() + " is a " + this.genre +" "+ this.type + " disk. This disk is"+ this.lengthMinutes+ "long and is" + this.availibilityCheck() +" for checkout.";
        }
        else{
            return this.toString() + " is a " + this.genre +" "+ this.type + " disk. This disk is" + this.availibilityCheck() +" for checkout.";
        }
 
    }
}