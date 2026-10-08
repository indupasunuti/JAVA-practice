import java.util.Scanner; 
import java.util.Random; 

public class NumberGuessingGame { 
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
        Random random = new Random(); 
        boolean playAgain;

        do {
            int secretNumber = random.nextInt(100) + 1; // Generate random number between 1 and 100 
            int tries = 0; 
            boolean found = false; 

            System.out.println("Welcome to the Number Guessing Game!"); 
            System.out.println("I have picked a number between 1 and 100. Try to guess it."); 

            while (!found) { 
                System.out.print("Enter your guess (1-100): "); 
                
                // Input validation
                while (!scanner.hasNextInt()) {
                    System.out.println("That's not a valid number. Please enter a number between 1 and 100.");
                    scanner.next(); // Clear the invalid input
                }
                
                int guess = scanner.nextInt(); 

                // Check if the guess is within the valid range
                if (guess < 1 || guess > 100) {
                    System.out.println("Please enter a number between 1 and 100.");
                    continue; // Skip the rest of the loop and ask for input again
                }

                tries++;
                if (guess < secretNumber) { 
                    System.out.println("Too low. Try again."); 
                } else if (guess > secretNumber) { 
                    System.out.println("Too high. Try again."); 
                } else { 
                    found = true; 
                } 
            } 

            System.out.println("Congratulations! You guessed the number " + secretNumber + " correctly in " + tries + " tries."); 

            // Ask if the user wants to play again
            System.out.print("Do you want to play again? (yes/no): ");
            String response = scanner.next();
            playAgain = response.equalsIgnoreCase("yes");

        } while (playAgain);

        System.out.println("Thank you for playing!"); 
        scanner.close(); 
    } 
}