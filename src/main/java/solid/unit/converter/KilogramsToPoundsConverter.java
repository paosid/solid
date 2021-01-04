package solid.unit.converter;

public class KilogramsToPoundsConverter implements Convertible {

    @Override
    public double convert(Integer value) {
        return Math.round(value * 2.20462 * 100) / 100.0;
    }
}
