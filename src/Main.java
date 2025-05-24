import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Welcome to Our Program");

        System.out.print("Enter Your Email Address: ");
        Scanner input = new Scanner(System.in);
        String email = input.nextLine();
        boolean done = false;

        while (!done)
        {
            if(email.contains("@"))
            {
                String username = email.substring(0, email.indexOf("@"));
                String domain = email.substring(email.indexOf("@") + 1);
                System.out.println("Your Username is: " + username);
                System.out.println("Your Domain is: " + domain);
                done = true;
            }
            else
            {
                System.out.println("Your Email Address is incorrect");
                System.out.print("Enter Your Email Address: ");
                email = input.nextLine();
            }
        }





    }
}