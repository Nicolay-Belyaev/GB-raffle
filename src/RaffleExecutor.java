import Toys.Toy;
import java.util.ArrayList;

public class RaffleExecutor {
    private final ArrayList<String> raffleResults = new ArrayList<>();

    public RaffleExecutor(ArrayList<Toy> toys) {
        int allToysAmount = 0;
        for (Toy toy:toys) {
            allToysAmount += toy.getAmount();
        }
        while (allToysAmount != 0) {
            int currentIndex = getRandomToyIndex(toys);
            boolean win = getToy(currentIndex, toys);
            if (win) {
                allToysAmount -= 1;
            }
        }
    }

    private int getRandomToyIndex (ArrayList<Toy> toys) {
        int flip = 1 + (int) (Math.random() * 100);
        for (int i = 0; i < toys.size(); i++) {
            if (flip <= toys.get(i).getChanceRange()) {
                return i;
            }
        }
        return -1;
    }

    private boolean getToy(int index, ArrayList<Toy> toys) {
        if (toys.get(index).getAmount() != 0) {
            raffleResults.add(toys.get(index).getName());
            toys.get(index).amountDecrement();
            return true;
        }
        return false;
    }



    public ArrayList<String> getRaffleResults() {return raffleResults;}
}

