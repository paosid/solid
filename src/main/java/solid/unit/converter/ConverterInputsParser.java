package solid.unit.converter;

final public class ConverterInputsParser {

    public static ConverterInputs parse(String... args){
        UnitType unitType = Enum.valueOf(UnitType.class, args[1].toUpperCase()+args[2].toUpperCase());
        return new ConverterInputs(Integer.parseInt(args[0]), unitType);
    }
}


