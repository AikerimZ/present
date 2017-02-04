package epam.lab.task1.entity;

/**
 */
public class OtherSweets extends Sweets {

    private static final String TEXT = "Christmas Mallow Lollies are simply delicious.";

    public OtherSweets(int weight, int sugar, int calValue, String name) {
        super(weight, sugar, calValue, name);
    }

    public String getDescription(){
        return TEXT;
    }
}
