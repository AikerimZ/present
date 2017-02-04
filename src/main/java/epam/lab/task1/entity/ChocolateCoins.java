package epam.lab.task1.entity;

/**
 */
public class ChocolateCoins extends Sweets {

    private static final String TEXT = "Milk chocolate in the shape of a coin, wrapped in foil.";

    public ChocolateCoins(int weight, int sugar, int calValue, String name) {
        super(weight, sugar, calValue, name);
    }

    public String getDescription(){
        return TEXT;
    }

    @Override
    public String toString() {
        return "ChocolateCoins: (" +
                "weight = " + getWeight() + ", " +
                "sugar = " + getSugar() + ", " +
                "name = " + getName();
    }
}
