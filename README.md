
# Bookstore Search!

Good day! The project you are about to see is something that I would like to further develop in the future for my mother who aspires to own a bookstore one day. 

This program allows you to construct your own Library (with books and stuff not in Java) simply by using the console. All of the data will be loaded to an ArrayList collection structure in Java. You are able to print out the entire library through the console as well as search through the collection with the title. There is a book, a disk, and a document already included in the library. 

I have made this project adaptable to future implementations and expansions:
1. Added support for confidential documents, length of disks in minutes and book page count. These are accessible through hard writing code. I will still need to implement the Console compatibility for these extra features.
2. Media Class is very flexible and I plan on adding more individual subclasses such as art, magazines, and music as well as other properties such as country of origin and language.
3. The search method is modular. I would like to implement a search for items by other fields (i.e. author or genre) function, as well as subclass specific items such as page count. 
4. I want to create a json object in order to save the library ArrayList and be able to import previously saved libraries. That is why there is a json file included.


Thank you for your time.

You can view the link to the repository where this code is stored here at [GitHub](https://github.com/red-peel/librarySearch)

**NOTE:**

**The information in the JSON file has some bugs. Parsing characters from different languages did not play well with something. This is not a bug in the program, just some weird characters in the JSON file. This can be fixed through editing the JSON but I felt unescessary doing so as it does not change the fact that the program works.**

<sup><sub>I also did not feel like going through the 100 books and editing out errors. </sup></sub>




## 🚀 About Me

Hello I am Elias Gonzalez, but you can call me Eli!

I'm a an aspiring developer currently in the MITxPro Certification Program for Full Stack Web Development in the MERN (MongoDB, Express, React, Node) Stack. I love to build computers, take photographs, and play video games.

If you'd like to learn more about what I am working on at github [click here.](https://github.com/red-peel)

If you'd like to take a break and look at my art and photography [click here.](https://www.instagram.com/slurpe_ee/)
 
  
 
 
## TODO:


REVATURE REQUIREMENTS

- [X] Inheritance, Polymorphism (overloading or overriding), Encapsulation, Abstraction (Abstract class or Interface)(Media is Parent, Each class has at least one overload/override, )

- [X] Must create and use at least 3 Constructors(POSSIBLY TWO PER CLASS)

- [X] Must have at least 4 methods (quite a bit i think)

- [X] Use a Scanner to get responses from the user (MAIN MENU INPUT)

- [X] Must contain a switch statement (MAIN MENU INPUT, DISK TYPE, DOCUMENT TYPE)

- [X] Must handle at least 1 exception (USER INPUT OUT OF BOUNDS IN MAIN MENU, TIME INTERRUPTS)

- [X] The project must include at least 3 Classes (MEDIA, DOCUMENT, DISK, BOOK)

- [X] Use one of the Collections structures. (ArrayList OF THE OBJECT MEDIA)

- [ ] Use a loop to traverse through the Collection structure that you chose and modify, organize or return values from the iteration. (USE TO SEARCH THROUGH ArrayList)


FOR SELF

- [ ] Import a library for json reading and create a method to add books to the ArrayList

- [ ] Add a feature to save the arraylist TO a json file to enable database retention

