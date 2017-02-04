package epam.lab.task1.entity;

/**
 */
public class Chewy extends Sweets {

    private static final String TEXT = "Fruit flavoured gummy sweets.";

    public Chewy(int weight, int calValue, int sugar, String name){
        super(weight, calValue, sugar, name);
    }

    public String getDescription(){
        return TEXT;
    }

    @Override
    public String toString() {
        return "Chewy: (" +
                "weight = " + getWeight() + ", " +
                "sugar = " + getSugar() + ", " +
                "name = " + getName();
    }
}
