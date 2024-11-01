public class Demo{
    public static void main(String[] args) {
        LibraryItem libraryitem = new LibraryItem();
        LibraryItem i1 = new LibraryItem("1", "Catcher in the Rye", "J.D. Salinger", "1001", "John Doe", 4, "book");
        LibraryItem i2 = new LibraryItem("2", "The Outsiders", "S.E. Hinton", "1002", "Susan Power", 6, "electronic");
        LibraryItem i3 = new LibraryItem("3", "Diary of A Wimpy Kid", "Jeff Kinney", "1003", "Charlie Williams", 2, "audio");
        Author author = new Author();
        Author a1 = new Author("J.D. Salinger", "01-01-1919", "Catcher in the Rye");
        Author a2 = new Author("S.E. Hinton", "07-22-1948", "The Outsiders");
        Author a3 = new Author("Jeff Kinney", "02-19-1971", "Diary of A Wimpy Kid");
        Patron patron = new Patron();
        Patron p1 = new Patron("Emily Brown", "45 Avenue Ave, Edmonton, AB, 222 222", "(222) 222-2222", "Catcher in the Rye");
        Patron p2 = new Patron("Micheal Brown", "69 Drive Drive, Halifax, NS, 333 333", "(333) 333-3333", "The Outsiders");
        Patron p3 = new Patron("Sarah White", "98 Street St, St John's, NL, 444 444", "(444) 444-4444", "Diary of A Wimpy Kid");
        Library sarah = new Library("Diary of a Wimpy Kid", "Jeff Kinney", "1003", 1);

        System.out.println("Library Item Management");
        System.out.println();
        libraryitem.addnewLibraryItem(i1);
        libraryitem.addnewLibraryItem(i2);
        libraryitem.editLibraryItem("The Outsiders");
        libraryitem.addnewLibraryItem(i3);
        libraryitem.deletenewItem(i3);
        libraryitem.printlistofLibraryItems();
        System.out.println();
        
        System.out.println("Author Management");
        System.out.println();
        author.addnewAuthor(a1);
        author.addnewAuthor(a2);
        author.editexistingAuthor("S.E. Hinton");
        author.addnewAuthor(a3);
        author.deletenewAuthor(a3);
        author.printlistofAuthorItems();
        System.out.println();

        System.out.println("Patron Management");
        System.out.println();
        patron.addnewPatron(p1);
        patron.addnewPatron(p2);
        patron.editexistingPatron("Micheal Brown");
        patron.addnewPatron(p3);
        patron.deletenewPatron(p3);
        patron.printlistofPatronItems();
        System.out.println();

        System.out.println("Library Item Borrowing");
        System.out.println();
        libraryitem.borrowLibraryItem(sarah, i3);
        sarah.printLibraryItem();
    }
}