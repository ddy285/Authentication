import java.util.Scanner;
public class Authentication{ public static void main(String [] args){ 
Scanner input = new Scanner (System.in); 
String username= "ddy285";
String password= "123";
System.out.println("Username: ");
String consoleUsername = input.nextLine();
System.out.println("Password: ");
String consolePassword = input.nextLine();
if(consoleUsername.equals(username) && consolePassword.equals(password)){
System.out.println("Welcome " +username);
}else{
System.out.println("Invalid username or password");
}
}
}

