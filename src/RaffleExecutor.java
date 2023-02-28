import Toys.Toy;
import java.util.ArrayList;
import java.util.Random;

public class RaffleExecutor {
    ArrayList<String> raffleResults;

    public RaffleExecutor(ArrayList<Toy> toys) {

        while (toys.size() != 0) {
            int currentRoundFlip = 1 + (int) (Math.random()*101);

        }
    }
}
