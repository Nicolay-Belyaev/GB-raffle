package Toys;

public abstract class Toy {
    protected int id;
    protected int amount;
    protected int chance;
    protected int chanceRange;
    protected int price;
    protected String name;

    public Toy(int id, int price, String name) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public void setChanceRange(int chanceRange) {this.chanceRange = chanceRange;}
    public int getChanceRange() {return chanceRange;}
    public int getChance() {return chance;}
    public void amountDecrement() {this.amount--;}
    public int getAmount() {return amount;}
    public String getName() {return name;}
}
