package epam.lab.task1.entities;

/**
 */
public class ChocolateCoins extends Sweets {

    private static final String TEXT = "Milk chocolate in the shape of a coin, wrapped in foil.";
    private int diameter;

    public int getDiameter() {
        return diameter;
    }

    public ChocolateCoins(int weight, int sugar, int calValue, String name, int diameter) {
        super(weight, sugar, calValue, name);
        this.diameter = diameter;
    }

    public String getDescription(){
        return TEXT;
    }

    @Override
    public String toString() {
        return "ChocolateCoins: (" +
                "name = " + getName() + ", " +
                "weight = " + getWeight() + ", " +
                "sugar = " + getSugar() + ", " +
                "diameter of coin = " + getDiameter();
    }
}
