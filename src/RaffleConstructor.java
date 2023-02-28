import Toys.*;

import java.util.ArrayList;

/**
 * RaffleConstructor serves 2 aims:
 * 1. Don't let sum prices on toys of raffle overcomes game budget (seted by user) and sum of chances be more or less than
 * 100 (seted by common sense).
 * 2. Return on next stage valid array of toys to play in raffle.
 */
public class RaffleConstructor {
    int raffleCost;
    ArrayList<Toy> allToys = new ArrayList<>();

    public RaffleConstructor(int raffleBudget,
                             int amountOfBears, int amountOfDolls, int amountOfTrains, int amountOfTableGames,
                             int chanceOnBear, int chanceOnDoll, int chanceOnTrain, int chanceOnTableGame) {
        Toy teddyBear = new Bear(amountOfBears, chanceOnBear);
        Toy barby = new Doll(amountOfDolls, chanceOnDoll);
        Toy thomas = new Train(amountOfTrains, chanceOnTrain);
        Toy jenga = new TableGame(amountOfTableGames, chanceOnTableGame);


        raffleCost = amountOfBears * teddyBear.getPrice() +
                amountOfDolls * barby.getPrice() +
                amountOfTableGames * jenga.getPrice() +
                amountOfTrains * thomas.getPrice();
        if (raffleCost > raffleBudget) {
            throw new RuntimeException("Raffle cost overcomes raffle budget. Try again with less amount of toys.");
        }
        if (chanceOnBear + chanceOnDoll + chanceOnTableGame + chanceOnTrain != 100) {
            throw new RuntimeException("Sum of chances on all toys don't equal to 100%. Try again with new chances.");
        }
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
