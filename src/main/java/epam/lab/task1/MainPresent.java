package epam.lab.task1;

import epam.lab.task1.entity.Chewy;
import epam.lab.task1.entity.ChocolateCoins;
import epam.lab.task1.entity.OtherSweets;
import epam.lab.task1.entity.Sweets;

import java.util.Arrays;

/**
 * 04.02.2017
 */
public class MainPresent {

    private static final String CHEWY = "Beach Mix";
    private static final String COIN = "Casino Chips";
    private static final String OTHER = "Christmas Mallow Lolly";

    public static void main(String[] args) {
        Sweets[] candies = new Sweets[3];
        candies[0] = new Chewy(5, 6, 12, CHEWY);
        candies[1] = new ChocolateCoins(10, 23, 15, COIN);
        candies[2] = new OtherSweets(24, 9, 7, OTHER);
        for (Sweets c : candies)
            System.out.println(c.getName()+ ", " + c.getDescription());
        Arrays.sort(candies);
        for (int i=0; i < candies.length; i++){
            System.out.println(candies[i]);
        }







    }



}
