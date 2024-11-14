import com.admin.product.Product;
import org.w3c.dom.ls.LSOutput;

import java .util.*;
public class Main {
    public static void main(String[] args) {
        System.out.println("welcome to shopping mart");
        System.out.println("-----------------");

        Scanner scanner=new Scanner(System.in);
        System.out.println("login your credentials:");
        System.out.println("enter username:");
        String ID=scanner.nextLine();
        System.out.println("enter password:");
        String Password=scanner.nextLine();
        login admin=new login();
        if(admin.aunthenticate(ID,Password)){
            System.out.println("welcome to Admin page");
            Product prd=new Product(1,"xyz","electronic product",2000,2,"elctronic");
            System.out.println(prd.toString());

        }
        else{
            System.out.println("welcome to user page");
        }


        }
    }
