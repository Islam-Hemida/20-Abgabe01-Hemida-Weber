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
        C2 = new Cocktail("Pina Colada",4);
        C3 = new Cocktail("Mochito", 2);
        C4 = new Cocktail("Kaffee", 3);
    }

    /***
     *
     */
    @Test
    void testGetVolume() {
       assertEquals(C1.getVolume(), 6);
        assertEquals(C2.getVolume(), 8);
        assertEquals(C3.getVolume(), 7);
        assertEquals(C4.getVolume(), 5);

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

    /***
     *
     */
    @Test
    void testSetVolume() {
        assertEquals(C1.getVolume(), 6);
        assertEquals(C2.getVolume(), 8);
        assertEquals(C3.getVolume(), 7);
        assertEquals(C4.getVolume(), 5);
    }

    /**
     *
     */
    @Test
    void getMaxVolume() {
    }

    /***
     *
     */
    @Test
    void setMaxVolume() {
    }

    /***
     *
     */
    @Test
    void toMuchAlkohol() {
    }
}