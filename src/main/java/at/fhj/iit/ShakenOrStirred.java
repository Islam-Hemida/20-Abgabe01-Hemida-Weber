package at.fhj.iit;

import java.time.Period;

public class ShakenOrStirred extends Cocktail {

    Boolean shaken;
    Boolean stirred;

    /**
     * Creates a Drink object with given name
     *
     * @param name      name of the drink
     * @param maxVolume
     */
    public ShakenOrStirred(String name, double maxVolume) {
        super(name, maxVolume);
    }

    // Check if costumer would like his/her cocktail shaken or stirred.
    public static void choice(Boolean shaken) {
        if(shaken) {
            System.out.println("I am James Bond");
        } else {
            System.out.println("Make it shaken!!!");
        }
    }
}
