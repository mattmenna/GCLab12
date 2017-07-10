import java.util.Random;

/**
 * Created by Matt on 7/10/2017.
 */
public abstract class Player{
    public enum Roshambo {
        PAPER, ROCK, SCISSORS;
    }

    public String playerName;


    @Override
    public String toString() {
        return playerName;
    }

    public String generateRoshambo(String input){
        switch (input){
            case "dumb":
                return Roshambo.ROCK.toString();
            case "random":
                return Roshambo.PAPER.toString();
            case "human":
                return Roshambo.SCISSORS.toString();
            default:
                return "Error in switch";
        }

    } // end generateRoshambo
}
