package solid.unit.converter;

import java.util.HashMap;
import java.util.Map;

public class ConvertersFactory {
    private Map<UnitType, CreatingConverter> creationConvertersByUnitTypes = new HashMap<>();

    double convert(UnitType unitsConversions, Integer value) {
        CreatingConverter creatingConverters = this.creationConvertersByUnitTypes.get(unitsConversions);
        return creatingConverters.executeConversion(value);
    }

    public ConvertersFactory() {
        creationConvertersByUnitTypes.put(UnitType.KGLB, new KilogramsToPoundsConverter());
        creationConvertersByUnitTypes.put(UnitType.LBKG, new PoundsToKilogramsConverter());
        creationConvertersByUnitTypes.put(UnitType.CMIN, new CentimetersToInchesConverter());
        creationConvertersByUnitTypes.put(UnitType.INCM, new InchesToCentimetersConverter());
    }

}
