package at.fhj.iit;

import java.util.ArrayList;

/**
 * Class for  mixing a cocktail.
 *
 * @author Lukas Weber
 * @author Islam Hemida
 * @version %I%, %G%
 * @since 1.1
 */
// this is a subclass of drinks
public class Cocktail extends Drink {
    // for the current volume you have
    private double volume = 0;
    // for the max Volume you can drink
    private double maxVolume = 5;

    /**
     * Creates a Drink object with given name
     *
     * @param name name of the drink
     * 
     */
    public Cocktail(String name, double maxVolume) {
        super(name);
        this.maxVolume = maxVolume;
    }

    // you can have 0.2L and 0.5L
    @Override
    public double getVolume() {
        return volume;
    }

    @Override
    public double getAlcoholPercent() {
        return 0;
    }

    @Override
    public boolean isAlcoholic() {
        return true;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(double maxVolume) {
        this.maxVolume = maxVolume;
    }

    public static void toMuchAlkohol(int volume) {
        if (volume >= 2) {
            System.out.println("Don't drink nothing more this day");
        }
    }
}