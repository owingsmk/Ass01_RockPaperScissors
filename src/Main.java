import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); //Bring scanner info into the program

        while (true) {
            String playerA;
            String playerB;

            while(true) { //first while loop setting player request
                System.out.println("Player 1 please enter your move (r, p, or s)");
                playerA = scanner.nextLine();
                if (playerA.equals("r") || playerA.equals("p") || playerA.equals("s")) { //This is to make it so only these letters are aloud
                    break;
                }
                System.out.println(playerA + " is not a valid move.");
            }
            while(true) {
                System.out.println("Player 2 please enter your move (r, p, or s)"); //asking second player to enter move
                playerB = scanner.nextLine();
                if (playerB.equals("r") || playerB.equals("p") || playerB.equals("s")) {
                    break;
                }
                System.out.println(playerB + " is not a valid move."); //If in proper letter is entered this is what is seen
            }
            if (playerA.equals(playerB)) {
                System.out.println("The game was a tie!"); //if both players play the same thing
            }
            else if (playerA.equals("r")) { //this is taking what each player plays
                if (playerB.equals("p")) {
                    System.out.println("Paper covers Rock Player 2 wins!");

                } else if (playerB.equals("s")) {
                    System.out.println("Rock smashes Scissors Player 1 wins!");
                }
            }

            else if (playerA.equals("p")) {
                if (playerB.equals("r")) {
                    System.out.println("Paper covers Rock Player 1 wins!");

                } else if (playerB.equals("s")) {
                    System.out.println("Scissors cuts paper Player 2 wins!");
                }
            }

            else if (playerA.equals("s")) {
                if (playerB.equals("p")) {
                    System.out.println("Scissors cuts paper Player 1 wins!");

                } else if (playerB.equals("r")) {
                    System.out.println("Rock smashes scissors Player 2 wins!");
                }
            }

            System.out.println("Play again? (y/n)"); //this is question if they want to play again
            String playAgain = scanner.nextLine();

            if (!playAgain.equals("y")) { //if yes it repeats back to start again
                break;
            }
        }
        scanner.close();
        }
    }