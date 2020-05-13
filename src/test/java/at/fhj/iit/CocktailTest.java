package at.fhj.iit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CocktailTest {

    private Cocktail C1;
    private Cocktail C2;
    private Cocktail C3;
    private Cocktail C4;


    @BeforeEach
    void setup() {
        C1 = new Cocktail("Long Island", 1);
        C2 = new Cocktail("Pina Colada", 4);
        C3 = new Cocktail("Mochito", 2);
        C4 = new Cocktail("Kaffee", 3);
    }

    /***
     *
     */
    @Test
    void testGetAlcoholPercent() {
        assertEquals(C1.getAlcoholPercent(), 0);
        assertEquals(C2.getAlcoholPercent(), 0);
        assertEquals(C3.getAlcoholPercent(), 0);
        assertEquals(C4.getAlcoholPercent(), 0);
    }

    /***
     * test if the drink is alcoholic
     */
    @Test
    void testIsAlcoholic() {
        assertTrue(C1.isAlcoholic());
        assertTrue(C2.isAlcoholic());
        assertTrue(C3.isAlcoholic());
        assertFalse(!C4.isAlcoholic());
    }

    /**
     *
     */
    @Test
    void getMaxVolume() {
        assertEquals(C1.getMaxVolume(), 1);
        assertEquals(C2.getMaxVolume(), 4);
        assertEquals(C3.getMaxVolume(), 2);
        assertEquals(C4.getMaxVolume(), 3);


    }

    /***
     * das musst noch ändern
     */
    @Test
    void tooMuchAlkohol() {
        assertEquals(C1.tooMuchAlkohol(1), false);
        assertEquals(C2.tooMuchAlkohol(3), false);
        assertEquals(C3.tooMuchAlkohol(3), true);
        assertEquals(C4.tooMuchAlkohol(1), false);
    }
}
