/**
 * author : Percy Ratheko
 *
 * Rock and paper.
 */


import java.util.Random;
import java.util.Scanner;

class RockPaperScissors
{
    public static void main(String[] args) {
        String[] rps = {"R", "P", "S"};
        String computerMove = rps[new Random().nextInt(rps.length)];

        Scanner scanner = new Scanner(System.in);
        String playerMove;

        while (true) {
            System.out.println("Enter your move (R, P OR S)");
            playerMove = scanner.nextLine();
            if (playerMove.equals("R") || playerMove.equals("P") || playerMove.equals("S")) {
                break;
            }
            System.out.println(playerMove + ": not a valid move");
            }

        System.out.println("computer played: " + computerMove);

        if(playerMove.equals(computerMove)){
            System.out.println("the game is a tie");
        } else if (playerMove.equals("R")) {
            if (computerMove.equals("P")){
                System.out.println("you lose");
            } else if (computerMove.equals("S")) {
                System.out.println("You win!");
            }

        }
        else if (playerMove.equals("P")) {
            if (computerMove.equals("R")){
                System.out.println("you Win! ");

            } else if (computerMove.equals("S")) {
                System.out.println("You lose");
            }

        }
        else if (playerMove.equals("S")) {
            if (computerMove.equals("P")){
                System.out.println("you Win! ");

            } else if (computerMove.equals("R")) {
                System.out.println("You lose");
            }

        }



    }
}
