package edu.berkeley.aep;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class QuantityTest {
    @Test
    public void threeFeetShouldEqualOneYard() {
        Quantity threeFeet = new Quantity(3, Unit.FOOT);
        Quantity oneYard = new Quantity(1, Unit.YARD);
        assertEquals(threeFeet, oneYard);
    }

    @Test
    public void oneMileShouldEqual1760Yard() {
        Quantity oneMile = new Quantity(1, Unit.MILE);
        Quantity seventeenSixtyYards = new Quantity(1760, Unit.YARD);
        assertEquals(oneMile, seventeenSixtyYards);
    }

    @Test
    public void oneTablespoonShouldEqualThreeTeaspoons() {
        Quantity oneTablespoon = new Quantity(1, Unit.TABLESPOON);
        Quantity threeTeaspoons = new Quantity(3, Unit.TEASPOON);
        assertEquals(oneTablespoon, threeTeaspoons);
    }

    @Test
    public void oneOunceShouldEqualTwoTablespoons() {
        Quantity onceOunce = new Quantity(1, Unit.OUNCE);
        Quantity twoTablespoons = new Quantity(2, Unit.TABLESPOON);
        assertEquals(onceOunce, twoTablespoons);
    }

    @Test
    public void eightOuncesShouldEqualOneCup() {
        Quantity oneCup = new Quantity(1, Unit.CUP);
        Quantity eightOunces = new Quantity(8, Unit.OUNCE);
        assertEquals(oneCup, eightOunces);
    }

}
