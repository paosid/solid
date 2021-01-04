package solid.unit.converter;

public class PoundsToKilogramsConverter implements Convertible {

    @Override
    public double convert(Integer value) {
        return Math.round(value * 0.453592 * 100) / 100.0;
    }
}
