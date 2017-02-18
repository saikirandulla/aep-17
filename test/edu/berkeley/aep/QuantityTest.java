package edu.berkeley.aep;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

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

    @Test
    public void twoInchesPlusTwoInchesShouldEqualFourInches() {
        Quantity twoInches = new Quantity(2, Unit.INCHES);
        Quantity fourInches = new Quantity(4, Unit.INCHES);
        assertEquals(fourInches, twoInches.add(twoInches));
    }

    @Test(expected = RuntimeException.class)
    public void twoTablespoonsPlusOneInchShouldThrowException() {
        Quantity twoTablespoons = new Quantity(2, Unit.TABLESPOON);
        Quantity twoInches = new Quantity(2, Unit.INCHES);
        twoInches.add(twoTablespoons);
    }

    @Test
    public void twoHundredAndTwelveFahrenheitShouldEqualOneHundredCelsius() {
        Quantity twoHundredAndTwelveFahrenheit = new Quantity(212, Unit.FAHRENHEIT);
        Quantity oneHundredCelsius = new Quantity(100, Unit.CELSIUS);
        assertEquals(oneHundredCelsius, twoHundredAndTwelveFahrenheit);
    }

    @Test
    public void thirtyTwoFahrenheitShouldEqualZeroCelsius() {
        Quantity thirtyTwoFahrenheit = new Quantity(32, Unit.FAHRENHEIT);
        Quantity zeroCelsius = new Quantity(0, Unit.CELSIUS);
        assertEquals(thirtyTwoFahrenheit, zeroCelsius);
    }

    @Test
    public void equalsShouldNotThrowAnException() {
        Quantity twoTablespoons = new Quantity(2, Unit.TABLESPOON);
        Quantity twoInches = new Quantity(2, Unit.INCHES);
        assertNotEquals(twoTablespoons, twoInches);
    }
}
