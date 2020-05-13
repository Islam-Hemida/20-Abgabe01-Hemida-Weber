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

    /***
     * you can have 0.2L and 0.5L
     * @return
     */

    @Override
    public double getVolume() {
        return volume;
    }

    /***
     *
     * @return
     */
    @Override
    public double getAlcoholPercent() {
        return 0;
    }

    /***
     *
     * @return
     */
    @Override
    public boolean isAlcoholic() {
        return true;
    }

    /***
     *
     * @param volume
     */
    public void setVolume(double volume) {
        this.volume = volume;
    }

    /***
     *
     * @return
     */
    public double getMaxVolume() {
        return maxVolume;
    }

    /***
     *
     * @param maxVolume
     */
    public void setMaxVolume(double maxVolume) {
        this.maxVolume = maxVolume;
    }

    /***
     *
     * @param volume;
     */
    public boolean tooMuchAlkohol(int volume) {
        this.volume += volume;
        if (this.volume > this.maxVolume) {
            System.out.println("Don't drink nothing more this day");
            return true;
        }
        return false;
    }
}