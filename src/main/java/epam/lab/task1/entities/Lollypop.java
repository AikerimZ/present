package epam.lab.task1.entities;

/**
 */
public class Lollypop extends Sweets {

    private static final String TEXT = "Christmas Mallow Lollies are simply delicious.";

    public Lollypop(int weight, int sugar, int calValue, String name) {
        super(weight, sugar, calValue, name);
    }

    public String getDescription(){
        return TEXT;
    }

    @Override
    public String toString() {
        return "Other sweets: (" +
                "name = " + getName() + ", " +
                "weight = " + getWeight() + ", " +
                "sugar = " + getSugar();
    }
}
