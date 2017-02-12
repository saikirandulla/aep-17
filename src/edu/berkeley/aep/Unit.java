package edu.berkeley.aep;

// Understands how to convert lengths into inches
public enum Unit {
    YARD(3 * 12), FOOT(12), MILE(1760 * 3 * 12),
    TEASPOON(1), TABLESPOON(3), OUNCE(6), CUP(48);

    private final int inBaseUnit;

    Unit(int inBaseUnit) {
        this.inBaseUnit = inBaseUnit;
    }

    public int toBaseUnit(int size) {
        return size * inBaseUnit;
    }
}
