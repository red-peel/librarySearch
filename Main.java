
//Take a look at README.md first
import java.text.DecimalFormat;
import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    /*
     * TESTS ********************************
     * // testing book object
     * 
     * Book sheesh2 = new Book("1", "2", "3", "4", true);
     * 
     * System.out.println(sheesh.getInfo());
     * System.out.println(sheesh2.getInfo());
     * 
     * // testing disk object
     * 
     * System.out.println(daft.toString());
     * 
     * // testing document object
     * 
     * System.out.println(DoI.toString());
     * 
     * 
     * libraryList.add(Declaration);
     * libraryList.add(daft);
     * libraryList.add(sheesh2);
     * 
     * for (Media item : libraryList) {
     * System.out.println(item.toString());
     * }
     */

    // Create arrayList to hold Media objects
    Document declaration = new Document("Decleration of Indepenence", "Government", "Historical",
        "Adams, Franklin, Jefferson, et al.", true, false);
    Book things = new Book("Things Fall Apart", "Fiction", "Historical", "Chinua Achebe", false, 224);
    Disk daft = new Disk("Random Access Memories", "Music", "Disco", "Daft Punk", true, 74);
    libraryList.add(declaration);
    libraryList.add(daft);
    libraryList.add(things);
    // main menu
    while (true) {
      System.out.println("Please select an option...");
      System.out.println("1. Print Library");
      System.out.println("2. Add new item to library");
      System.out.println("3. Search Library by Title");
      System.out.println("E. Exit");
      String input = scan.nextLine();
      wait(1500);
      int timeVar2 = 1000;
      switch (input.toLowerCase()) {
        case "1": {
          System.out.println("Printing Library...");
          wait(timeVar2);
          printLibrary();
          break;
        }
        case "2": {
          System.out.println("Add new item");
          wait(timeVar2);
          addNewItem();
          break;
        }
        case "3": {
          System.out.println("Search Library");
          wait(timeVar2);
          searchLibrary();
          break;
        }
        case "e": {
          System.out.println("Closing...");
          scan.close();
          wait(timeVar2);
          System.exit(1);
        }
        default: {
          System.out.println("Error: Unrecognized input");
          break;
        }
      }
    }

  }
  // MAIN METHODS

  // wait method (HANDLES InterruptedException and allows for delays for aesthetic
  // purposes
  public static void wait(int ms) {
    try {
      Thread.sleep(ms);
    } catch (InterruptedException ex) {
      Thread.currentThread().interrupt();
    }
  }

  // printLibrary(), runs when option 1 in main menu is selected
  static int timeVar = 1000;

  public static void printLibrary() {
    System.out.println(libraryList.toString());
    wait(timeVar);
  }

  // addNewItem(), runs when option 2 in main menu is selected
  public static void addNewItem() {
    /*
     * TO DO: Try to fix the innerScan leak. DO NOT CLOSE THE SCANNER 
     * AT THE END OF THIS SUBMENU, this will cause the MAIN MENU
     * scanner to be closed
     */
    Scanner innerScan = new Scanner(System.in);
    wait(timeVar);

    // SUBMENU
    System.out.println("What type of new item would you like to add? (enter number)");
    System.out.println("1. Disk");
    System.out.println("2. Book");
    System.out.println("3. Document");
    System.out.println("0. Cancel");
    boolean quit = false;
    do {
      String newItemOption = innerScan.nextLine();
      switch (newItemOption) {
        // Book Create
        case "1": {
          System.out.println("Please enter the title of the disk");
          String newTitle = innerScan.nextLine();
          System.out.println("Please enter type (Audio, Video, Software)");
          String newType = innerScan.nextLine();
          System.out.println("Please enter the genre (Subtype such as music genre, film genre, game software)");
          String newGenre = innerScan.nextLine();
          System.out.println("Please enter the author");
          String newAuthor = innerScan.nextLine();
          Disk newDisk = new Disk(newTitle, newType, newGenre, newAuthor, true);
          libraryList.add(newDisk);
          quit = true;
          break;
        }

        // Disk create
        case "2": {
          System.out.println("Please enter the title of the book");
          String newTitle = innerScan.nextLine();
          System.out.println("Please enter type (Fiction or Non-Fiction)");
          String newType = innerScan.nextLine();
          System.out.println("Please enter the genre");
          String newGenre = innerScan.nextLine();
          System.out.println("Please enter the author");
          String newAuthor = innerScan.nextLine();
          Book newBook = new Book(newTitle, newType, newGenre, newAuthor, true);
          libraryList.add(newBook);
          quit = true;
          break;
        }

        //Document create
        case "3": {
          System.out.println("Please enter the title of the document");
          String newTitle = innerScan.nextLine();
          System.out.println("Please enter type (Map, Article, Government Document, etc.)");
          String newType = innerScan.nextLine();
          System.out.println("Please enter the subtype (Historical, Art, Records, etc.)");
          String newGenre = innerScan.nextLine();
          System.out.println("Please enter the author");
          String newAuthor = innerScan.nextLine();
          Document newDocument = new Document(newTitle, newType, newGenre, newAuthor, true);
          libraryList.add(newDocument);
          quit = true;
          break;
        }
        case "0":{
          quit = true;
          break;
        }
        default:{
          System.out.println("Impossible input");
          break;
        }
      }
    } while (!quit);
  }

  // searchLibrary(), runs when option 3 in main menu is selected
  public static void searchLibrary() {
    System.out.println("Please enter the name of the title you are looking for.");
    Scanner searchScan = new Scanner(System.in);
    String searchTitle = searchScan.nextLine();
    boolean itemFound = false;
    for (Media item : libraryList) {
      if (item.getTitle().toLowerCase().equals(searchTitle.toLowerCase())) {
        System.out.println(item.getInfo());
        itemFound = true;
        break;
      }
    }
    if(!itemFound){
      System.out.println("Item not found. Please try again.");
    }
    wait(timeVar);
  }

  // create arrayList and add example media library
  static ArrayList<Media> libraryList = new ArrayList<>();

}