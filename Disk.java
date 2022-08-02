public class Disk {
    public class Disk extends Media {

        // CONSTRUCTOR WITH NO PAGE NUMBER
        public Disk(String title, String type, String genre, String author) {
            super(title, type, genre, author);
            isPageCountEnabled = false;
            // UNCOMMENT BELOW TO SEE WHEN OBJECT HAS BEEN CREATED
            // System.out.println("Disk: " + title + ". has been created");
        }

        // CONSTRUCTOR WITH PAGE NUMBER
        public Disk(String title, String type, String genre, String author, int pageCount) {
            super(title, type, genre, author);
            this.pageCount = pageCount;
            isPageCountEnabled = true;
            // UNCOMMENT BELOW TO SEE WHEN OBJECT HAS BEEN CREATED
            // System.out.println("Disk: " + title + ". has been created with: " +
            // this.pageCount + " pages");
        }

        @Override
        public String getInfo() {
            if (isPageCountEnabled) {
                return this.toString() + " is a " + type + " Disk with: " + this.pageCount + " pages. Its genre: "
                        + this.genre;
            } else {
                return this.toString() + " is a " + type + ". Its genre is " + this.genre;
            }
        }
    }
}
