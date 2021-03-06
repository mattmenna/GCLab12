import java.util.Random;

/**
 * Created by Matt on 7/10/2017.
 */
public abstract class Player {
    public enum Roshambo {
        PAPER, ROCK, SCISSORS
    }

    /*
   PAPER ordinal 0
   ROCK ordinal 1
   SCISSORS ordinal 2

   Paper beats Rock------------------ 0 beats 1
   Rock beats Scissors --------------1 beats 2
   Scissors beats paper -------------2 beats 0

     */

    public String playerName;


    @Override
    public String toString() {
        return playerName;
    }

    public String generateRoshambo(String input) {
        return Roshambo.valueOf(input.toUpperCase()).toString();

    } // end generateRoshambo
}
