package epam.lab.task1;

/**
 */
public class Chewy extends Sweets{
  
  public Chewy(){
    super(int weight, int calValue, int sugar, String title);
  }
  
  
  
  @Override
  public String toString(){
    return "Chewy {" + 
      "title: " + title +
      "weight: " + weight +
      "sugar: " + sugar+
      "calorific value: " + calValue +
      "}";
      
  
}
