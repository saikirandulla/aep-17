package edu.berkeley.aep;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

public class QuantityTest {
    @Test
    public void threeFeetShouldEqualOneYard() {
        ArithmeticQuantity threeFeet = new ArithmeticQuantity(3, Unit.FOOT);
        ArithmeticQuantity oneYard = new ArithmeticQuantity(1, Unit.YARD);
        assertEquals(threeFeet, oneYard);
    }

    @Test
    public void oneMileShouldEqual1760Yard() {
        ArithmeticQuantity oneMile = new ArithmeticQuantity(1, Unit.MILE);
        ArithmeticQuantity seventeenSixtyYards = new ArithmeticQuantity(1760, Unit.YARD);
        assertEquals(oneMile, seventeenSixtyYards);
    }

    @Test
    public void oneTablespoonShouldEqualThreeTeaspoons() {
        ArithmeticQuantity oneTablespoon = new ArithmeticQuantity(1, Unit.TABLESPOON);
        ArithmeticQuantity threeTeaspoons = new ArithmeticQuantity(3, Unit.TEASPOON);
        assertEquals(oneTablespoon, threeTeaspoons);
    }

    @Test
    public void oneOunceShouldEqualTwoTablespoons() {
        ArithmeticQuantity onceOunce = new ArithmeticQuantity(1, Unit.OUNCE);
        ArithmeticQuantity twoTablespoons = new ArithmeticQuantity(2, Unit.TABLESPOON);
        assertEquals(onceOunce, twoTablespoons);
    }

    @Test
    public void eightOuncesShouldEqualOneCup() {
        ArithmeticQuantity oneCup = new ArithmeticQuantity(1, Unit.CUP);
        ArithmeticQuantity eightOunces = new ArithmeticQuantity(8, Unit.OUNCE);
        assertEquals(oneCup, eightOunces);
    }

    @Test
    public void twoInchesPlusTwoInchesShouldEqualFourInches() {
        ArithmeticQuantity twoInches = new ArithmeticQuantity(2, Unit.INCHES);
        ArithmeticQuantity fourInches = new ArithmeticQuantity(4, Unit.INCHES);
        assertEquals(fourInches, twoInches.add(twoInches));
    }

    @Test(expected = RuntimeException.class)
    public void twoTablespoonsPlusOneInchShouldThrowException() {
        ArithmeticQuantity twoTablespoons = new ArithmeticQuantity(2, Unit.TABLESPOON);
        ArithmeticQuantity twoInches = new ArithmeticQuantity(2, Unit.INCHES);
        twoInches.add(twoTablespoons);
    }

    @Test
    public void twoHundredAndTwelveFahrenheitShouldEqualOneHundredCelsius() {
        ScaledQuantity twoHundredAndTwelveFahrenheit = new ScaledQuantity(212, Unit.FAHRENHEIT);
        ScaledQuantity oneHundredCelsius = new ScaledQuantity(100, Unit.CELSIUS);
        assertEquals(oneHundredCelsius, twoHundredAndTwelveFahrenheit);
    }

    @Test
    public void thirtyTwoFahrenheitShouldEqualZeroCelsius() {
        ScaledQuantity thirtyTwoFahrenheit = new ScaledQuantity(32, Unit.FAHRENHEIT);
        ScaledQuantity zeroCelsius = new ScaledQuantity(0, Unit.CELSIUS);
        assertEquals(thirtyTwoFahrenheit, zeroCelsius);
    }

    @Test
    public void equalsShouldNotThrowAnException() {
        ScaledQuantity twoTablespoons = new ScaledQuantity(2, Unit.TABLESPOON);
        ScaledQuantity twoInches = new ScaledQuantity(2, Unit.INCHES);
        assertNotEquals(twoTablespoons, twoInches);
    }
}
