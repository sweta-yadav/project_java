import com.admin.product.Product;
import org.w3c.dom.ls.LSOutput;

import java .util.*;
public class Main {
    public static void main(String[] args) {
        System.out.println("shopping mart");
        System.out.println("-----------------");
        System.out.println("1. Admin");
        System.out.println("2. Customer");
        System.out.println("3. Exit");
        System.out.println("-----------------");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the choice between 1,2,3 ");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1: {
                System.out.println("Welcome to Admin page");

                Product prd=new Product(1,"xyz","electronic product",2000,2,"elctronic");
                System.out.println(prd.toString());

                break;
            }
            case 2: {
                System.out.println("Welcome to Customer page");
                break;
            }
            case 3: {
                System.out.println("Thank you! and Exiting from the Application");
                break;
            }
            default: {
                System.out.println("Invalid choice! Enter the choice between 1,2 and 3");
            }

        }
    }
}