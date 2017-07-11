/**
 * Created by Matt on 7/10/2017.
 */
public class RandomPlayer extends Player {

    public RandomPlayer(String name) {
        playerName = name;
    }

    @Override
    public String generateRoshambo(String input) {
        int range = (3 - 1) + 1;
        int randomInt = (int)(Math.random() * range) + 1;
        switch (randomInt){
            case 1:
                return Roshambo.ROCK.toString();
            case 2:
                return Roshambo.PAPER.toString();
            case 3:
                return Roshambo.SCISSORS.toString();
            default:
                return "Error";
        }
    }
}
