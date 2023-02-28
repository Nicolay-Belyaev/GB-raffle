import Toys.Toy;
import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        RaffleConstructor raffle = new RaffleConstructor(100000,
                100,
                10,
                10,
                10,
                1,
                33,
                33,
                33);
        ArrayList<Toy> toys = raffle.getAllToys();
        System.out.println(toys);
        RaffleExecutor executor = new RaffleExecutor(toys);
        for (Toy toy:toys) {
            toy.printToy();
        }
        System.out.println(executor.getRaffleResults());
    }
}