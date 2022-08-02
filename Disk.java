public class Disk extends Media {
    private int lengthMinutes;

    // CONSTRUCTOR WITH NO PAGE NUMBER
    public Disk(String title, String type, String genre, String author,boolean isAvailable, int lengthMinutes) {
        super(title, type, genre, author,isAvailable);
        this.lengthMinutes = lengthMinutes;
        // UNCOMMENT BELOW TO SEE WHEN OBJECT HAS BEEN CREATED
        // System.out.println("Disk: " + title + ". has been created");
    }
    @Override
    public String getInfo() {
        return this.toString() + " is a " + this.genre + this.type + " disk. This disk is"+ this.lengthMinutes+ "long and is" + this.availibilityCheck() +" for checkout.";
    }
}