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


        String humanPlayer = hP.generateRoshambo(validator.getRequiredString("What do you want to throw?"));
        System.out.println("Your chose " + humanPlayer);

        String opponentPlayer = opponent(dP, rP, caseNumber);
        System.out.println("Your Opponent chose " + opponentPlayer);

        winCondition(humanPlayer, opponentPlayer);

    }

    private static void winCondition(String humanPlayer, String opponentPlayer) {
        if (humanPlayer.equalsIgnoreCase("Paper") && opponentPlayer.equalsIgnoreCase("Rock")) {
            System.out.println("Win");
        } else if (humanPlayer.equalsIgnoreCase("Rock") && opponentPlayer.equalsIgnoreCase("Scissors")) {
            System.out.println("Win");
        } else if (humanPlayer.equalsIgnoreCase("Scissors") && opponentPlayer.equalsIgnoreCase("Paper")) {
            System.out.println("Win");
        } else if (humanPlayer.equalsIgnoreCase(opponentPlayer.toLowerCase())) {
            System.out.println("TIE");
        } else
            System.out.println("Lose");
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

}