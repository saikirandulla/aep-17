package edu.berkeley.aep;

/**
 * Created by jezhumble on 2/23/17.
 */
public class ScaledQuantity {
    protected final int size;
    protected final Unit unit;

    public ScaledQuantity(int size, Unit unit) {
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
        if (!(other instanceof ScaledQuantity)) return false;
        ScaledQuantity otherQuantity = (ScaledQuantity) other;
        if (!unit.comparableWith(((ScaledQuantity) other).unit)) return false;
        return size == otherQuantity.unit.convert(otherQuantity.size, unit);
    }

    @Override
    public String toString() {
        return size + " " + unit ;
    }
}
