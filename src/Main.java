import com.admin.product.Customer;
import com.admin.product.Product;
import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
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
            boolean adminexit=true;
            while(adminexit) {
                System.out.println("welcome to Admin page");
                System.out.println("1.view items");
                System.out.println("2.manage product info and status");
                System.out.println("3.manage order and deliveries");
                System.out.println("4.Add product and update the product");
                System.out.println("5.view all the customer");
                System.out.println("6.Exit");
                System.out.println("Enter the choice between 1 to 6");
                int choice = scanner.nextInt();
                switch (choice) {
                    case 1: {
                        //view items
                        break;
                    }
                    case 2: {
                        //manage product info and status
                        break;
                    }
                    case 3: {
                        //manage order and deliveries
                        break;
                    }
                    case 4: {
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
                    }
                    case 5: {
                        //add and view all the customer
                        System.out.println("customer List:");
                        Customer customer1=new Customer(1,"Trisha","trisharoy2060@gmail.com",98000000);
                        System.out.println(customer1);
                        Customer customer2=new Customer(2,"sandhya","sondhee@gmail.com",98000000);
                        System.out.println(customer2);
                        Customer customer3=new Customer(3,"abc","abc@gmail.com",980000);


                        break;
                    }



                    case 6: {
                        //Exit
                        System.out.println("Exiting from Admin Module... Thank you!!!");
                        adminexit=false;
                        break;
                    }

                }//switch

            }//while
        }
        else{
            System.out.println("welcome to user page");
        }
        }
    }
