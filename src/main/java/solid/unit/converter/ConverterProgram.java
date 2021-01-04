package solid.unit.converter;

public class ConverterProgram {
    public static void main(String... args){
        InputValidator.inputValidation(args);
        ConverterInputs converterInputs = ConverterInputsParser.parse(args);
        ResultDoublePrinter.print(new Converter().executeConversion(converterInputs));
    }
}
