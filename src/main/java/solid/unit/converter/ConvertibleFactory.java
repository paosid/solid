package solid.unit.converter;

import java.util.HashMap;
import java.util.Map;

public class ConvertibleFactory {
    private Map<UnitType, Convertible> creationConvertersByUnitTypes = new HashMap<>();

    Convertible createConvertibleInstance(UnitType unitsConversions) {
        return this.creationConvertersByUnitTypes.get(unitsConversions);
    }

    public ConvertibleFactory() {
        creationConvertersByUnitTypes.put(UnitType.KGLB, new KilogramsToPoundsConverter());
        creationConvertersByUnitTypes.put(UnitType.LBKG, new PoundsToKilogramsConverter());
        creationConvertersByUnitTypes.put(UnitType.CMIN, new CentimetersToInchesConverter());
        creationConvertersByUnitTypes.put(UnitType.INCM, new InchesToCentimetersConverter());
    }

}
