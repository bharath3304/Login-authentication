import java.util.Scanner;
class LoginSystem{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String correctname = "Bharath";
        String correctpass = "sai@123";

        System.out.println("Enter username: ");
        String username = sc.nextLine();

        System.out.println("Enter password: ");
        String password = sc.nextLine();

        if(correctname.equals(username) && correctpass.equals(password)){
            System.out.println("Login successfully completed");
        }else{
            System.out.println("Invalid Password or Username");
        }
    }
}