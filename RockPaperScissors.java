package cloudberryday2project;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"Rock", "Paper", "Scissors"};
        String playAgain;

        do {
            // Step 1: User selects a choice
            System.out.println("Enter your choice (Rock, Paper, or Scissors): ");
            String userChoice = scanner.nextLine();

            // Step 2: Computer randomly selects a choice
            int randomIndex = random.nextInt(3);
            String computerChoice = choices[randomIndex];

            System.out.println("Computer chose: " + computerChoice);

            // Step 3: Determine the winner
            if (userChoice.equalsIgnoreCase(computerChoice)) {
                System.out.println("It's a Tie!");
            }
            else if (
                userChoice.equalsIgnoreCase("Rock") && computerChoice.equals("Scissors") ||
                userChoice.equalsIgnoreCase("Paper") && computerChoice.equals("Rock") ||
                userChoice.equalsIgnoreCase("Scissors") && computerChoice.equals("Paper")
            ) {
                System.out.println("🎉 You Win!");
            }
            else if (
                userChoice.equalsIgnoreCase("Rock") ||
                userChoice.equalsIgnoreCase("Paper") ||
                userChoice.equalsIgnoreCase("Scissors")
            ) {
                System.out.println("💻 Computer Wins!");
            }
            else {
                System.out.println("❌ Invalid Input!");
            }

            // Step 4: Play again?
            System.out.print("Do you want to play again? (yes/no): ");
            playAgain = scanner.nextLine();

        } while (playAgain.equalsIgnoreCase("yes"));

        System.out.println("Thanks for playing!");
        scanner.close();
    }


	}


