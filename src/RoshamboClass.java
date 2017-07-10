import java.util.Random;

/**
 * Created by Matt on 7/10/2017.
 */
public class RoshamboClass {

    public static void main(String[] args) {
        System.out.println("Rock, paper, scissors!");

        DumbPlayer dP = new DumbPlayer("Dumb Player");
        RandomPlayer rP = new RandomPlayer("Random Player");
        HumanPlayer hP = new HumanPlayer("Human Player");

        System.out.println("Dumb Player picks" + dP.generateRoshambo("dumb"));
        System.out.println("Random Player picks" + rP.generateRoshambo("random"));
        System.out.println("Human Player picks" + rP.generateRoshambo("human"));
    }
}
