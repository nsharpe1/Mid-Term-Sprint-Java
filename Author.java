import java.util.ArrayList;

public class Author {
    private String name;
    private String dateofbirth;
    private String listofitemswritten;

    private ArrayList<Author> listofAuthorItems = new ArrayList<Author>();

    public Author() {
    }

    public Author(String name, String dateofbirth, String listofitemswritten) {
        this.name = name;
        this.dateofbirth = dateofbirth;
        this.listofitemswritten = listofitemswritten;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateofBirth() {
        return dateofbirth;
    }

    public void setDateofBirth(String dateofbirth) {
        this.dateofbirth = dateofbirth;
    }

    public String getListofItemsWritten() {
        return listofitemswritten;
    }

    public void setListofItemsWritten(String listofitemswritten) {
        this.listofitemswritten = listofitemswritten;
    }

    public Author(ArrayList<Author> listofAuthorItems){
        this.listofAuthorItems = listofAuthorItems;
    }

    public ArrayList<Author> getListofAuthorItems() {
        return listofAuthorItems;
    }

    public void setListofAuthorItems(ArrayList<Author> listofAuthorItems) {
        this.listofAuthorItems = listofAuthorItems;
    }

    public void addnewAuthor(Author author){
        listofAuthorItems.add(author);
    }
    
    public void editexistingAuthor(String itemName) {
        for(Author author: listofAuthorItems){
            if(author.getName().equals(itemName)){
                author.setName("J.K. Rowling");
                author.setDateofBirth("07-31-1965");
                author.setListofItemsWritten("Harry Potter and the Chamber of Secrets");
            }
        }
    }

    public void deletenewAuthor(Author author){
        listofAuthorItems.remove(author);
    }

    public void printlistofAuthorItems(){
        for(Author author: listofAuthorItems){
            System.out.println("Name: " + author.getName());
            System.out.println("Date of Birth: " + author.getDateofBirth());
            System.out.println("List of Items Written: " + author.getListofItemsWritten());
        }
    }
}