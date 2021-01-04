package solid.unit.converter;

public class Converter {
    ConvertibleFactory convertibleFactory = new ConvertibleFactory();

    double executeConversion(ConverterInputs converterInputs){
        Convertible convertibleInstance = convertibleFactory.createConvertibleInstance(converterInputs.converterUnits);
        return convertibleInstance.convert(converterInputs.value);
    }

}
