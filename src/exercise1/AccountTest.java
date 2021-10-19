package exercise1;

//creating and manupulating the account object
import java.util.Scanner;

public class AccountTest {

    public static void main(String[] args) {
        // write your code here
// Create a scanner object to obtain input from the command window
        Scanner input= new Scanner (System.in);
//Create an account objet and assign it to myAccount
        Account myAccount =new Account();
        //Display initial value of name (null)
        System.out.printf("Initial name is : %s%n%n", myAccount.getName());
        // Prompt for the name
        System.out.println("Please enter the name: ");
        String theName=input.nextLine(); //read a line of the text
        myAccount.setName(theName); //put the name in my account
        System.out.println();// output a black line
        // Display the name stored in object account
        System.out.printf("Name in the object in my Account is : %n%s%n", myAccount.getName());



    }
}

