package epam.lab.task1.entity;

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

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getCalValue() {
        return calValue;
    }

    public void setCalValue(int calValue) {
        this.calValue = calValue;
    }

    public int getSugar() {
        return sugar;
    }

    public void setSugar(int sugar) {
        this.sugar = sugar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
                "weight = " + getWeight() + ", " +
                "sugar = " + getSugar() + ", " +
                "name = " + getName();
    }
}
