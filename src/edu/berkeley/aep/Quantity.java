package edu.berkeley.aep;

// Understands how to compare lengths of different units
public class Quantity {
    private final int size;
    private final Unit unit;

    public Quantity(int size, Unit unit) {
        this.size = size;
        this.unit = unit;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(size);
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (!(other instanceof Quantity)) return false;
        Quantity otherQuantity = (Quantity) other;
        if (!unit.comparableWith(((Quantity) other).unit)) return false;
        return size == otherQuantity.unit.convert(otherQuantity.size, unit);
    }

    @Override
    public String toString() {
        return size + " " + unit ;
    }

    public Quantity add(Quantity other) {
        return new Quantity(size + other.unit.convert(other.size, unit), unit);
    }
}
