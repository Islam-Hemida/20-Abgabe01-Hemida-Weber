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

int volume;
    /**
     * Creates a Drink object with given name
     *
     * @param name name of the drink
     */
    public Cocktail(String name) {
        super(name);
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
        return false;
    }
}
