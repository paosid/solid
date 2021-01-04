package solid.unit.converter;

public class CentimetersToInchesConverter implements Convertible {

    @Override
    public double convert(Integer value) {
        return Math.round(value * 0.393701 * 100) / 100.0;
    }
}
