package Toys;

public abstract class Toy {
    protected int id;
    protected int amount;
    protected int chance;
    protected int price;
    protected String name;

    public Toy(int id, int price, String name) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public void setChance(int chance) {
        if (chance > 100) {
            this.chance = 100;
            System.out.println("Chance can't be higher than 100. Chance of drop " + name + " set on 100%");
            return;
        }
        this.chance = chance;
    }
    public int getChance() {return chance;}
    public void amountDecrement() {this.amount--;}
    public int getAmount() {return amount;}
    public int getPrice() {return price;}
}
