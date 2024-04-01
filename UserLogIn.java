import java.util.*;
class UserLogIn{
    public static void main(String[] args) {
        Scanner access = new Scanner(System.in);
        LogIn login = new LogIn();

        while (true) {
        try{
            System.out.print("Welcome user! \nEnter your password: ");
            String password = access.nextLine();
            login.logAccess(password);
            break;
         } 
         catch (InvalidPasswordException e) {
            System.out.println(e.getMessage() + "\nPlease Try Again!\n");
            }
         catch (MaxLogAttemptsException e) {
            System.out.println(e.getMessage());
            break;
            } 
        }
    }   
}