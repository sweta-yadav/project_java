import java.util.ArrayList;
import java.util.Scanner;
public class userinfo {
    private static ArrayList<user>users=new ArrayList<>();
    private static int nextid=1;//id counter
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while(true){
            System.out.println("user management system");
            System.out.println("1.Add user");
            System.out.println("2.Edit user");
            System.out.println("3.Delete user");
            System.out.println("4.view user");
            System.out.println("5.Exit");
            System.out.println("choose an option:");
            int choice=scanner.nextInt();
            scanner.nextLine();
            switch(choice){
                case 1:
                addUser(scanner);
                break;
                case 2:
                editUser(scanner);
                break;
                case 3:
                DeleteUser(scanner);
                case 4:
                viewUser(scanner);
                break;
                case 5:
                System.out.println("Exiting.....");
                scanner.close();
                return;
                default:
                System.out.println("Invalid option,please try again!");
            }
 private static void addUSer(Scanner scanner){
            System.out.print("enter user name:");
            String name=Scanner.nextLine();
            System.out.println("enter email:");
            String email=Scanner.nextLine();
            users.add(new User(nextId+name,email));
            System.out.println("user added successfully!");
 }
 private static void editUser(Scanner scanner){
    System.out.print("enter user id to edit:");
    int id=Scanner.nextLine();
    User user =findUserByID(id);
    if(user==null){
        System.out.println("user not found");
        return;
    }
    System.out.println("enter new name(leave blank to keep current):");
    String name=scanner.nextLine();
    if(!name.isEmpty()){
        user.setName(name);
    }
    System.out.println("enter new email(leave blank to keep current):");
    String email=scanner.nextLine();
    if(!email.isEmpty()){
        user.setEmail(email);
    }
    System.out.println("user updated successfully!");
 }
 private static void deleteUser(Scanner scanner){
    System.out.println("enter user Id to delete:");
    int id=Scanner.nextInt();
    User user=findUserByID(id);
    if(user==null){
        System.out.println("user not found");
        return;

    }
    user.remove(user);
    System.out.println("user deleted succesfully!");
 }
 private static void viewUser(){
    if(user.isEmpty()){
        System.out.println("No users found");
        else{
            System.out.println("user List");
            for(USer user:users){
                System.out.println(user);
            }
        }
    }
    private static User findUSerById(int id){
        for(User.getid()==id){
            return user;
        }
    }
    return null;
 }      
        }
    }
}

    


    
