import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
      
        int lowerBound = 1;
        int upperBound = 100;
        int maxAttempts = 5; 
        int roundsPlayed = 0;
        int roundsWon = 0;

        boolean playAgain;
        do {
            roundsPlayed++;
            int randomNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
            boolean correctGuess = false;
            int attempts = 0;

            System.out.println("Round " + roundsPlayed + ": I have generated a random number between " + lowerBound + " and " + upperBound + ". Try to guess it!");
            
          
            while (attempts < maxAttempts && !correctGuess) {
                System.out.print("Enter your guess (Attempt " + (attempts + 1) + " of " + maxAttempts + "): ");
                int userGuess = scanner.nextInt();
                attempts++;

                if (userGuess == randomNumber) {
                    System.out.println("Congratulations! You guessed the correct number: " + randomNumber);
                    correctGuess = true;
                    roundsWon++;
                } else if (userGuess < randomNumber) {
                    System.out.println("Your guess is too low.");
                } else {
                    System.out.println("Your guess is too high.");
                }
            }

            if (!correctGuess) {
                System.out.println("Sorry, you've used all your attempts. The correct number was: " + randomNumber);
            }

           
            System.out.print("Do you want to play another round? (yes/no): ");
            playAgain = scanner.next().equalsIgnoreCase("yes");

        } while (playAgain);

        System.out.println("Game Over!");
        System.out.println("Rounds played: " + roundsPlayed);
        System.out.println("Rounds won: " + roundsWon);
        System.out.println("Final score: " + roundsWon + "/" + roundsPlayed);

      
        scanner.close();
    }
}

