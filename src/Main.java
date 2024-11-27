import com.admin.product.Customer;
import com.admin.product.Product;
import com.admin.auth.Login;
import java .util.*;
import java.util.ArrayList;
public class Main {
    private static ArrayList<Customer>customers=new ArrayList<>();
    public static void main(String[] args) {
        System.out.println("welcome to shopping mart");
        System.out.println("-----------------");

        Scanner scanner=new Scanner(System.in);
        System.out.println("login your credentials:");
        System.out.println("enter username:");
        String ID=scanner.nextLine();
        System.out.println("enter password:");
        String Password=scanner.nextLine();
        Login admin=new Login();

        if(admin.authenticate(ID,Password)){
            boolean adminexit=true;
            while(adminexit) {
                System.out.println("welcome to Admin page");
                System.out.println("user management system");
                System.out.println("1.Add user");
                System.out.println("2.Edit user");
                System.out.println("3.Delete user");
                System.out.println("4.View all the product");
                System.out.println("5.view all the consumer");
                System.out.println("6.Exit");
                System.out.println("Enter the choice between 1 to 6");
                int choice = scanner.nextInt();
                switch (choice) {
                    case 1: 
                        //Add consumer
                        addCustomer(scanner);
                        break;
                    
                    case 2: 
                        //Edit customer
                        editCustomer(scanner);
                        break;
                    
                    case 3: 
                        //Delete customer
                        deleteCustomer(scanner);
                        break;
                    
                    case 4: 
                        //add product and update the product

                        Product product1 = new Product(1,"redme Note10",23000,5,"Electronics","redMe","Courier/Flight","Available");
                        System.out.println(product1);
                        Product product2=new Product(2,"tv",200.00,3,"abc","brandname","shipping info","stock status");
                        System.out.println(product2);
                        Product product3=new Product(3,"product name",200.00,3,"category","brand name","shiip","status");
                        System.out.println(product3);
                        Product product4=new Product(4,"ppp",400.00,4,"cate","brand","shipping","status");
                        System.out.println(product4);
                        Product product5=new Product(5,"name",300.00,4,"category","brandname","shipping info","status");
                        System.out.println(product5);
                        break;
                    
                    case 5: 
                        //add and view all the customer
                        System.out.println("customer List:");
                        Customer customer1=new Customer(1,"Trisha","trisharoy2060@gmail.com",98000000);
                        System.out.println(customer1);
                        Customer customer2=new Customer(2,"sandhya","sondhee@gmail.com",98000000);
                        System.out.println(customer2);
                        Customer customer3=new Customer(3,"abc","abc@gmail.com",980000);
                        break;
                    
                    case 6: 
                        //Exit
                        System.out.println("Exiting from Admin Module... Thank you!!!");
                        adminexit=false;
                        break;
                    default:
                    System.out.println("Invalid choice. Please try again.");

                }//switch

            }//while
        }
        else{
            System.out.println("welcome to user page");
        }
        }
    
        private static void addCustomer(Scanner scanner) {
            System.out.println("Enter customer name: ");
            String name = scanner.next();
            System.out.println("Enter customer email: ");
            String email = scanner.next();
            System.out.println("Enter customer phone: ");
            long phone = scanner.nextLong();
            int id=customers.size()+1;
            Customer newCustomer=new Customer(id,name,email,phone);
            customers.add(newCustomer);

            System.out.println("User added successfully!"+newCustomer);
        }
        private static void editCustomer(Scanner scanner) {
            System.out.println("Enter customer ID to edit: ");
            int id = scanner.nextInt();
        
            Customer customer = findCustomerById(id);
            if (customer == null) {
                System.out.println("Customer not found.");
                return;
            }
        
            System.out.println("Enter new name (leave blank to keep current): ");
            scanner.nextLine(); // Consume newline
            String name = scanner.nextLine();
            if (!name.isEmpty()) customer.setName(name);
        
            System.out.println("Enter new email (leave blank to keep current): ");
            String email = scanner.nextLine();
            if (!email.isEmpty()) customer.setEmail(email);
        
            System.out.println("Enter new phone (or 0 to keep current): ");
            long phone = scanner.nextLong();
            if (phone != 0) customer.setPhone(phone);
        
            System.out.println("Customer updated successfully: " + customer);
        }
        
        private static void deleteCustomer(Scanner scanner) {
            System.out.println("Enter customer ID to delete: ");
            int id = scanner.nextInt();
        
            Customer customer = findCustomerById(id);
            if (customer == null) {
                System.out.println("Customer not found.");
                return;
            }
        
            customers.remove(customer);
            System.out.println("Customer deleted successfully: " + customer);
        }
        
        private static void viewAllCustomers() {
            if (customers.isEmpty()) {
                System.out.println("No customers found.");
            } else {
                System.out.println("Customer List:");
                for (Customer customer : customers) {
                    System.out.println(customer);
                }
            }
        }
        
        private static Customer findCustomerById(int id) {
            for (Customer customer : customers) {
                if (customer.getId() == id) return customer;
            }
            return null;
        }
    
        
    }
