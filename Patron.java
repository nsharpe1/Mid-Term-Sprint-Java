import java.util.ArrayList;

public class Patron {
    private String name;
    private String address;
    private String phonenumber;
    private String listoflibraryitemsborrowed;

    private ArrayList<Patron> listofPatronItems = new ArrayList<Patron>();
    
    public Patron() {
    }

    public Patron(String name, String address, String phonenumber, String listoflibraryitemsborrowed) {
        this.name = name;
        this.address = address;
        this.phonenumber = phonenumber;
        this.listoflibraryitemsborrowed = listoflibraryitemsborrowed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phonenumber;
    }

    public void setPhoneNumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getListofLibraryItemsBorrowed() {
        return listoflibraryitemsborrowed;
    }

    public void setListofLibraryItemsBorrowed (String listoflibraryitemsborrowed) {
        this.listoflibraryitemsborrowed = listoflibraryitemsborrowed;
    }

    public Patron(ArrayList<Patron> listofPatronItems){
        this.listofPatronItems = listofPatronItems;
    }

    public ArrayList<Patron> getListofPatronItems() {
        return listofPatronItems;
    }

    public void setListofPatronItems(ArrayList<Patron> listofPatronItems) {
        this.listofPatronItems = listofPatronItems;
    }

    public void addnewPatron(Patron patron){
        listofPatronItems.add(patron);
    }
    
    public void editexistingPatron(String itemName) {
        for(Patron patron: listofPatronItems){
            if(patron.getName().equals(itemName)){
                patron.setName("John Doe");
                patron.setAddress("12 Street Ave, Ottwawa, ON, 000 000");
                patron.setPhoneNumber("(000) 000-0000");
                patron.setListofLibraryItemsBorrowed("Harry Potter and the Chamber of Secrets");
            }
        }
    }

    public void deletenewPatron(Patron patron){
        listofPatronItems.remove(patron);
    }

    public void printlistofPatronItems(){
        for(Patron patron: listofPatronItems){
            System.out.println("Name: " + patron.getName());
            System.out.println("Address: " + patron.getAddress());
            System.out.println("Phone Number: " + patron.getPhoneNumber());
            System.out.println("List of Library Items Borrowed: " + patron.getListofLibraryItemsBorrowed());
        }
    }
}
