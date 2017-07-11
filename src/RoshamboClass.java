import java.util.Random;
import java.util.Scanner;

/**
 * Created by Matt on 7/10/2017.
 */
public class RoshamboClass {

    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);

        System.out.println("Rock, paper, scissors!");
        boolean cont = true;

        MyValidator validator = new MyValidator();

        String playerName = validator.getRequiredString("What is your Name?");

        DumbPlayer dP = new DumbPlayer("Dumb Player");
        RandomPlayer rP = new RandomPlayer("Random Player");
        HumanPlayer hP = new HumanPlayer(playerName);


        System.out.println("Hi " + playerName + ". Who do you want to play against? Enter 1 or 2");
        int caseNumber = scnr.nextInt();

        //System.out.println("What do you want to throw?");
//


        String humanPlayer = hP.generateRoshambo(validator.getRequiredString("What do you want to throw?"));

        String opponentPlayer = opponent(dP, rP, caseNumber);

//            System.out.println("Dumb Player picks" + dP.generateRoshambo("dumb"));
//            System.out.println("Random Player picks" + rP.generateRoshambo("random"));
//            System.out.println("Human Player picks" + hP.generateRoshambo("human"));

        System.out.println(winCondition(humanPlayer, opponentPlayer));

    /*
   PAPER ordinal 0
   ROCK ordinal 1
   SCISSORS ordinal 2

   Paper beats Rock------------------ 0 beats 1
   Rock beats Scissors --------------1 beats 2
   Scissors beats paper -------------2 beats 0

     */

    }

    private static String opponent(DumbPlayer dP, RandomPlayer rP, int caseNumber) {
        switch (caseNumber) {
            case 1:
                return dP.generateRoshambo("dumb");
            case 2:
                return rP.generateRoshambo("random");
            default:
                return "Error in Opponent";
        }
    }

    private static String winCondition(String humanPlayer, String opponentPlayer) {
        if(humanPlayer.equalsIgnoreCase(opponentPlayer)){
            return "Tie";
        }
        return "loss";
    }
}
