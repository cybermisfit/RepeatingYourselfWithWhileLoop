import java.util.Scanner;

//Modify the above program to also exit the while loop if the person guesses "5".

public class KeepGuessing {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int secretNumber, guess = 0;//guess is initialized to 0
        int secondSecretNumber;

        secretNumber = 123;
        secondSecretNumber = 5;



        System.out.println("I'm thinking of a number between 1 and 1000");
        System.out.print("Enter the number:");
        guess = keyboard.nextInt();

        while ( guess != secretNumber && guess != secondSecretNumber)
        {
            System.out.println("\nYou are wrong. Try again.");
            System.out.println("Enter the number: ");git
            guess = keyboard.nextInt();

        }

        System.out.println("You are correct. You win a prize!");
        keyboard.close();
    }


}
