package epam.lab.task1.entities;

/**
 */
public abstract class Sweets implements Comparable{

    private int weight;
    private int sugar;
    private int calValue;
    private String name;

    public Sweets(int weight, int sugar, int calValue, String name) {
        this.weight = weight;
        this.sugar = sugar;
        this.calValue = calValue;
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public int getSugar() {
        return sugar;
    }

    public String getName() {
        return name;
    }

    public abstract String getDescription();

    public int compareTo(Object obj){
        Sweets candy = (Sweets)obj;
        if (this.sugar < candy.sugar){
            return -1;
        }
        else if (this.sugar > candy.sugar){
            return 1;
        }
        return 0;
    }
    
    @Override
    public String toString() {
        return "Sweets: (" +
                "name = " + getName() + ", " +
                "weight = " + getWeight() + ", " +
                "sugar = " + getSugar();
    }
}
