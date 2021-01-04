package solid.unit.converter;

public class InchesToCentimetersConverter implements CreatingConverter {

    @Override
    public double executeConversion(Integer value) {
        return Math.round(value * 2.54 * 100) / 100.0;
    }
}
