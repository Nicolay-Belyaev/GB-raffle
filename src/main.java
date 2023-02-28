import Toys.Toy;
import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        RaffleConstructor raffle = new RaffleConstructor(100000,
                10,
                10,
                10,
                10,
                25,
                25,
                25,
                25);
        ArrayList<Toy> toys = raffle.getAllToys();
        System.out.println(toys);
    }
}