import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            String[] rps = {"r", "p", "s"};
            String playerA;
            String playerB;

            while(true) {
                System.out.println("Please enter your move (r, p, or s)");
                playerA = scanner.nextLine();
                if (playerA.equals("r") || playerA.equals("p") || playerA.equals("s")) {
                    break;
                }
                System.out.println(playerA + " is not a valid move.");
                playerB = scanner.nextLine();
                if (playerB.equals("r") || playerB.equals("p") || playerB.equals("s")) {
                    break;
                }
                System.out.println(playerB + " is not a valid move.");
            }

            System.out.println("Please enter your move (r, p, or S)");

            if (playerA.equals(playerB)) {
                System.out.println("The game was a tie!");
            }
            else if (playerA.equals("r")) {
                if (playerB.equals("p")) {
                    System.out.println("You lose!");

                } else if (playerB.equals("s")) {
                    System.out.println("You win!");
                }
            }

            else if (playerA.equals("p")) {
                if (playerB.equals("r")) {
                    System.out.println("You win!");

                } else if (playerB.equals("s")) {
                    System.out.println("You lose!");
                }
            }

            else if (playerA.equals("s")) {
                if (playerB.equals("p")) {
                    System.out.println("You win!");

                } else if (playerB.equals("r")) {
                    System.out.println("You lose!");
                }
            }

            System.out.println("Play again? (y/n)");
            String playAgain = scanner.nextLine();

            if (!playAgain.equals("y")) {
                break;
            }
        }
        scanner.close();
    }
}