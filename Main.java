import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main (String[] args)
    {
        Scanner reader = new Scanner(System.in);
        Bank onlineBank = new Bank();
        List<String> menu = List.of(
            "1. Create an account",
            "2. Delete an account",
            "3. Deposit",
            "4. Withdraw",
            "5. Quit"
        );
    
        System.out.println("Welcome to online banking");
        int input = -1;
        while (input != 0) {
            System.out.println("Enter the corresponding number of the action to start");
            for (String action : menu) {
                System.out.println(action);
            }
            input = reader.nextInt();

            if (input == 1)
            {
                System.out.println("Which accout do you want to create?");
                System.out.println("1. Checking acoount");
                System.out.println("2. Saving account");
                int input2 = reader.nextInt();
                
                System.out.println("What is your name?");
                String userName = reader.nextLine();

                System.out.println("Enter the initial amount you would want to put in:");
                double userAmount = reader.nextDouble();
                if (input2 == 1)
                {

                }
            }
            
        }
        System.out.println("");
    }
}
