package solid.unit.converter;

public class PoundsToKilogramsConverter implements CreatingConverter {

    @Override
    public double executeConversion(Integer value) {
        return Math.round(value * 0.453592 * 100) / 100.0;
    }
}
