import java.util.ArrayList;
import java.util.Scanner;

class Library {
    private ArrayList<Item> items;
    private ArrayList<Customer> customers;

    public Library() {
        items = new ArrayList<Item>();
        customers = new ArrayList<Customer>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public ArrayList<Item> searchItems(String title) {
        ArrayList<Item> searchResults = new ArrayList<Item>();
        for (Item item : items) {
            if (item.getTitle().contains(title)) {
                searchResults.add(item);
            }
        }
        return searchResults;
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void removeCustomer(Customer customer) {
        customers.remove(customer);
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public ArrayList<Customer> searchCustomers(String name) {
        ArrayList<Customer> searchResults = new ArrayList<Customer>();
        for (Customer customer : customers) {
            if (customer.getName().contains(name)) {
                searchResults.add(customer);
            }
        }
        return searchResults;
    }

}

public class LibraryManagement {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("1. Add customer");
            System.out.println("2. Remove customer");
            System.out.println("3. Add Book/Magazine");
            System.out.println("4. Remove Book/Magazine");
            System.out.println("5. Search customer");
            System.out.println("6. Search Book/Magazine");
            System.out.println("7. Exit");
            int choice = scan.nextInt();
            scan.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Enter customer id: ");
                    int id = scan.nextInt();
                    scan.nextLine();
                    System.out.println("Enter customer name: ");
                    String name = scan.nextLine();
                    System.out.println("Enter customer type (1 for student, 2 for faculty): ");
                    int type = scan.nextInt();
                    scan.nextLine();
                    if (type == 1) {
                        System.out.println("Enter student's course: ");
                        String course = scan.nextLine();
                        Student s = new Student(id, name, 5, course);
                        library.addCustomer(s);
                    } else if (type == 2) {
                        System.out.println("Enter faculty's department: ");
                        String department = scan.nextLine();
                        Faculty f = new Faculty(id, name, 19, department);
                        library.addCustomer(f);
                    }
                    break;
                case 2:
                    System.out.println("Enter customer id: ");
                    int id1 = scan.nextInt();
                    scan.nextLine(); 
                    System.out.println("Enter customer name: ");
                    String name1 = scan.nextLine();
                    System.out.println("Enter customer type (1 for student, 2 for faculty): ");
                    int type1 = scan.nextInt();
                    scan.nextLine();
                    if (type1 == 1) {
                        Student s = new Student(id1, name1, 5, "");
                        library.removeCustomer(s);
                    } else if (type1 == 2) {
                        Faculty f = new Faculty(id1, name1, 19, "");
                        library.removeCustomer(f);
                    }
                    break;
                case 3:
                    System.out.println("Enter Id: ");
                    int id2 = scan.nextInt();
                    System.out.println("Enter item type (1 for book, 2 for magazine): ");
                    int itemType = scan.nextInt();
                    scan.nextLine(); 
                    if (itemType == 1) {
                        System.out.println("Enter book title: ");
                        String title = scan.nextLine();
                        System.out.println("Enter book author: ");
                        String author = scan.nextLine();
                        System.out.println("Enter book quantity: ");
                        int qty = scan.nextInt();
                        qty = scan.nextInt();
                        scan.nextLine(); 
                        Book b = new Book(title,id2, author, qty);
                        library.addItem(b);
                    } else if (itemType == 2) {
                        System.out.println("Enter magazine title: ");
                        String title = scan.nextLine();
                        System.out.println("Enter magazine volume: ");
                        int vol = scan.nextInt();
                        scan.nextLine(); 
                        System.out.println("Enter magazine issue number: ");
                        int issueNo = scan.nextInt();
                        scan.nextLine();
                        Magazine m = new Magazine(title,id2, vol, issueNo);
                        library.addItem(m);
                    }
                    break;
                case 4:
                    System.out.println("Enter item title: ");
                    String title = scan.nextLine();
                    Item i = new Item(title);
                    library.removeItem(i);
                    break;
                case 5:
                    System.out.println("Enter customer name: ");
                    String customerName = scan.nextLine();
                    ArrayList<Customer> customers = library.searchCustomers(customerName);
                    if (customers != null) {
                        for (Customer c : customers) {
                            System.out.println("Id: "+c.getId());
                            System.out.println("Name: "+c.getName());
                            System.out.println("Books borrowed: "+c.getTotalBooksBorrowed());
                        }
                    } else {
                        System.out.println("Customer not found.");
                    }
                    break;
                case 6:
                    System.out.println("Enter item title: ");
                    String itemTitle = scan.nextLine();
                    ArrayList<Item> items = library.searchItems(itemTitle);
                    if (items != null) {
                        for (Item j : items) {
                            System.out.println(j.getTitle());
                        }
                    } else {
                        System.out.println("Item not found.");
                    }
                    break;
                
                case 7:
                    System.out.println("Exiting program...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}
