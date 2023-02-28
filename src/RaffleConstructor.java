import Toys.*;
import java.util.ArrayList;

public class RaffleConstructor {
    ArrayList<Toy> allToys = new ArrayList<>();

    public RaffleConstructor(int amountOfBears, int amountOfDolls, int amountOfTrains, int amountOfTableGames,
                             int chanceOnBear, int chanceOnDoll, int chanceOnTrain, int chanceOnTableGame) {
        Toy teddyBear = new Bear(amountOfBears, chanceOnBear);
        Toy barby = new Doll(amountOfDolls, chanceOnDoll);
        Toy thomas = new Train(amountOfTrains, chanceOnTrain);
        Toy jenga = new TableGame(amountOfTableGames, chanceOnTableGame);

        allToys.add(teddyBear);
        allToys.add(barby);
        allToys.add(thomas);
        allToys.add(jenga);

        allToys.get(0).setChanceRange(allToys.get(0).getChance());
        for (int i = 1; i < allToys.size(); i++) {
            Toy currentToy = allToys.get(i);
            Toy previousToy = allToys.get(i - 1);
            currentToy.setChanceRange(previousToy.getChanceRange() + currentToy.getChance());
        }
    }
    public ArrayList<Toy> getAllToys() {return allToys;}
}
