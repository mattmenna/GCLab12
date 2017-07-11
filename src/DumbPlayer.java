/**
 * Created by Matt on 7/10/2017.
 */
public class DumbPlayer extends Player {

    public DumbPlayer(String name) {
        playerName = name;
    }

    @Override
    public String generateRoshambo(String input) {
        return Roshambo.ROCK.toString();
    }


}
