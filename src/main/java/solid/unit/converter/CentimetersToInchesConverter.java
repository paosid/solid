package solid.unit.converter;

public class CentimetersToInchesConverter implements CreatingConverter {

    @Override
    public double executeConversion(Integer value) {
        return Math.round(value * 0.393701 * 100) / 100.0;
    }
}
