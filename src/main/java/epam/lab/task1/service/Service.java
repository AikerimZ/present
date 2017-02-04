package epam.lab.task1.service;

import epam.lab.task1.entity.Chewy;
import epam.lab.task1.entity.ChocolateCoins;
import epam.lab.task1.entity.OtherSweets;
import epam.lab.task1.entity.Sweets;

/**
 * 04.02.2017
 */
public class Service {

    private static final String CHEWY = "Beach Mix";
    private static final String COIN = "Casino Chips";
    private static final String OTHER = "Christmas Mallow Lolly";
    private static final int MIN = 10;
    private static final int MAX = 20;

    public static Sweets[] create(){

        Sweets[] candies = new Sweets[3];
        candies[0] = new Chewy(5, 60, 12, CHEWY);
        candies[1] = new ChocolateCoins(10, 23, 15, COIN);
        candies[2] = new OtherSweets(6, 19, 7, OTHER);

        return candies;
    }

    public static int collectGift(){

        int weight = 0;
        Sweets[] c = create();

        for (int i=0; i < c.length; i++){
            weight += c[i].getWeight();
        }

        System.out.println(weight);
        return weight;
    }

    public static String findBySugar (){

        String found = "";
        Sweets[] candies = create();

        for (int i=0; i < candies.length; i++){
            if (candies[i].getSugar() > MIN && candies[i].getSugar() < MAX){
                found += candies.toString();
            }
        }
        System.out.println(found);

        return found;
    }

    

}
