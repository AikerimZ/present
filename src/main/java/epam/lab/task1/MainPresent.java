package epam.lab.task1;

import epam.lab.task1.entities.Sweets;
import epam.lab.task1.service.Service;

import java.util.Arrays;

/**
 * 04.02.2017
 */
public class MainPresent {

    public static void main(String[] args) {
        Sweets[] candies = Service.create();
        Arrays.sort(candies);
        for (Sweets c : candies) {
            System.out.println(c.getName() + ", " + c.getDescription());
        }
        Service.findBySugar(candies);
        Service.collectGift(candies);









    }



}
