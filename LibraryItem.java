import java.util.ArrayList;

public class LibraryItem {
    private String ID;
    private String title;
    private String author;
    private String ISBN;
    private String publisher;
    private int numberofcopies;
    private String type;

    private ArrayList<LibraryItem> listofItems = new ArrayList<LibraryItem>();

    private ArrayList<Library> library = new ArrayList<Library>();
    
    public LibraryItem() {
    }

    public LibraryItem(String ID, String title, String author, String ISBN, String publisher, int numberofcopies, String type) {
        this.ID = ID;
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.publisher = publisher;
        this.numberofcopies = numberofcopies;
        this.type = type;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getNumberofCopies() {
        return numberofcopies;
    }

    public void setNumberofCopies(int numberofcopies) {
        this.numberofcopies = numberofcopies;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ArrayList<Library> getLibraries() {
        return library;
    }

    public void setLibraries(ArrayList<Library> library) {
        this.library = library;
    }

    public LibraryItem(ArrayList<LibraryItem> listofItems){
        this.listofItems = listofItems;
    }

    public ArrayList<LibraryItem> getListofItems() {
        return listofItems;
    }

    public void setListofItems(ArrayList<LibraryItem> listofItems) {
        this.listofItems = listofItems;
    }

    public void addToLibrary(Library libraries) {
        library.add(libraries);
    }

    public void addnewLibraryItem(LibraryItem libraryitem){
        listofItems.add(libraryitem);
    }
    
    public void editLibraryItem(String itemName) {
        for(LibraryItem libraryitem: listofItems){
            if(libraryitem.getTitle().equals(itemName)){
                libraryitem.setID("4");
                libraryitem.setTitle("Animal Farm");
                libraryitem.setAuthor("George Orwell");
                libraryitem.setISBN("1004");
                libraryitem.setPublisher("Matthew English");
                libraryitem.setNumberofCopies(9);
                libraryitem.setType("audio");
            }
        }
    }

    public void deletenewItem(LibraryItem libraryitem){
        listofItems.remove(libraryitem);
    }

    public void printlistofLibraryItems(){
        for(LibraryItem libraryitem: listofItems){
            System.out.println("ID: " + libraryitem.getID());
            System.out.println("Title: " + libraryitem.getTitle());
            System.out.println("Author: " + libraryitem.getAuthor());
            System.out.println("ISBN: " + libraryitem.getISBN());
            System.out.println("Publisher: " + libraryitem.getPublisher());
            System.out.println("Number Of Copies: " + libraryitem.getNumberofCopies());
            System.out.println("Type: " + libraryitem.getType());
        }
    }

    public void borrowLibraryItem(Library libraries,LibraryItem libraryitem) {
        libraries.addLibraryItemtoList(libraryitem);
        listofItems.remove(libraryitem);
        System.out.println("Libary Item Borrowed!");
    }
}