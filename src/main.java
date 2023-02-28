import Toys.Toy;
import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        RaffleConstructor raffle = new RaffleConstructor(
                100,
                10,
                10,
                10,
                1,
                33,
                33,
                33);
        ArrayList<Toy> toys = raffle.getAllToys();
        RaffleExecutor executor = new RaffleExecutor(toys);
        System.out.println(executor.getRaffleResults());
    }
}