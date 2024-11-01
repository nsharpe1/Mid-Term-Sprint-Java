import java.util.ArrayList;

public class Library {
    private String title;
    private String author;
    private String ISBN;
    private int numberofcopies;
    
    private ArrayList<LibraryItem> libraryitemborrrowed = new ArrayList<LibraryItem>();

    public Library(String title, String author, String ISBN, int numberofcopies) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.numberofcopies = numberofcopies;
    }

    public Library() {
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

    public int getNumberofCopies() {
        return numberofcopies;
    }

    public void setNumberofCopies(int numberofcopies) {
        this.numberofcopies = numberofcopies;
    }

    public ArrayList<LibraryItem> getLibraryItemBorrrowed() {
        return libraryitemborrrowed;
    }

    public void setLibraryItemBorrowed(ArrayList<LibraryItem> libraryitemborrowed) {
        this.libraryitemborrrowed = libraryitemborrowed;
    }

    public void addLibraryItemtoList(LibraryItem libraryitem) {
        libraryitemborrrowed.add(libraryitem);
    }

    public void deleteLibraryItemtoList(LibraryItem libraryitem) {
        libraryitemborrrowed.remove(libraryitem);
    }

    public void printLibraryItem() {
         System.out.println("Library Items Borrowed By Sarah:");
        for (LibraryItem libraryitem : libraryitemborrrowed) {
            if(libraryitem instanceof LibraryItem){
                LibraryItem i = (LibraryItem) libraryitem;
                System.out.println(i.getTitle() + ", " + i.getAuthor() + ", " + i.getISBN() + ", " + i.getNumberofCopies());
            }
        }
    }
}