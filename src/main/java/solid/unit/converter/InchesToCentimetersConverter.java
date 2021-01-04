package solid.unit.converter;

public class InchesToCentimetersConverter implements Convertible {

    @Override
    public double convert(Integer value) {
        return Math.round(value * 2.54 * 100) / 100.0;
    }
}
