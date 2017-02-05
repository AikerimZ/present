package epam.lab.task1.entities;

/**
 */
public class Chewy extends Sweets {

    private static final String TEXT = "Fruit flavoured gummy sweets.";
    private static final String COLOUR = "Varicoloured";

    public Chewy(int weight, int calValue, int sugar, String name){
        super(weight, calValue, sugar, name);
    }

    public String getDescription(){
        return TEXT;
    }

    @Override
    public String toString() {
        return "Chewy: (" +
                "name = " + getName() + ", " +
                "weight = " + getWeight() + ", " +
                "sugar = " + getSugar() + ", " +
                "colour = " + COLOUR;
    }
}
