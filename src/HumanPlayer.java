/**
 * Created by Matt on 7/10/2017.
 */
public class HumanPlayer extends Player {

    public HumanPlayer(String name) {
        playerName = name;
    }

    @Override
    public String generateRoshambo(String input) {
        return Roshambo.valueOf(input.toUpperCase()).toString();
    }
}
