package edu.berkeley.aep;

public class Bester {
    private final ScaledQuantity[] quantities;

    public Bester(ScaledQuantity... quantities) {
        this.quantities = quantities;
    }

    public ScaledQuantity best() {
        ScaledQuantity best = quantities[0];
        for (ScaledQuantity candidate : quantities) {
            if (candidate.betterThan(best)) {
                best = candidate;
            }
        }
        return best;
    }
}
