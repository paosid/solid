package solid.unit.converter;

import java.util.Arrays;

public class InputValidator {

    static void inputValidation(String... args) {
        numberOfArgumentsValidator(args);
        numberValidator(args[0]);
        unitsValidator(args[1], args[2]);
    }

    private static void numberOfArgumentsValidator(String... args) throws IllegalNumberOfArgumentsException {
        if (args.length!=3){
            throw new IllegalNumberOfArgumentsException("Passed incorrect number of arguments");
        }
    }

    private static void numberValidator(String val) throws NumberFormatException {
        Integer.parseInt(val);
    }

    private static void unitsValidator(String unitBeforeConversion, String unitAfterConversion) throws IllegalConverterUnitsException{
        if (Arrays.stream(UnitType.values()).noneMatch((t) -> t.name().equals(unitBeforeConversion.toUpperCase()+unitAfterConversion.toUpperCase()))){
            throw new IllegalConverterUnitsException("Not supported conversion units");
        }
    }
}
