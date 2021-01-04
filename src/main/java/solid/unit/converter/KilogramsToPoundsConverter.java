package solid.unit.converter;

public class KilogramsToPoundsConverter implements CreatingConverter {

    @Override
    public double executeConversion(Integer value) {
        return Math.round(value * 2.20462 * 100) / 100.0;
    }
}
