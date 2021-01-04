package solid.unit.converter;

public class Converter {
    ConvertersFactory convertersFactory = new ConvertersFactory();

    double executeConversion(ConverterInputs converterInputs){
        return convertersFactory.convert(converterInputs.converterUnits, converterInputs.value);
    }

}
