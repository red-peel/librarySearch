//Take a look at README.md first
import java.util.*;
class Main {
  public static void main(String[] args) {
    //testing book object
    
    Book sheesh = new Book("Things Fall Apart", "Fiction", "Historical","Chinua Achebe",false, 298);
    Book sheesh2 = new Book("1", "2", "3", "4", true);
    
    System.out.println(sheesh.getInfo());
    System.out.println(sheesh2.getInfo());
    

    sheesh.setIsAvailable(true);

  }  
}