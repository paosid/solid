package solid.unit.converter;

import org.junit.Assert;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class ConverterTest {
    private Converter underTest;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @org.junit.Before
    public void setUp() {
        underTest = new Converter();
        System.setOut(new PrintStream(outContent));
    }

    @org.junit.Test
    public void givenKgToLb_whenExecuteConversion_thenReturnedResultIsCorrect() {
        double result = underTest.executeConversion(ConverterInputsParser.parse("12", "kg", "lb"));
        Assert.assertEquals(26.46,result, 0.01);
    }

    @org.junit.Test
    public void givenIncorrectKgNameToLb_whenExecuteConversion_thenReturnedResultIsCorrect() {
        double result = underTest.executeConversion(ConverterInputsParser.parse("12", "kG", "Lb"));
        Assert.assertEquals(26.46,result, 0.01);
    }

    @org.junit.Test
    public void givenLbToKg_whenExecuteConversion_thenReturnedResultIsCorrect() {
        double result = underTest.executeConversion(ConverterInputsParser.parse("5", "lb", "kg"));
        Assert.assertEquals(2.27, result, 0.01);
    }

    @org.junit.Test
    public void givenCmToIn_whenExecuteConversion_thenReturnedResultIsCorrect() {
        double result = underTest.executeConversion(ConverterInputsParser.parse("1000", "cm", "in"));
        Assert.assertEquals(393.70, result, 0.01);
    }

    @org.junit.Test
    public void givenInToCm_whenExecuteConversion_thenReturnedResultIsCorrect() {
        double result = underTest.executeConversion(ConverterInputsParser.parse("12", "in", "cm"));
        Assert.assertEquals(30.48, result, 0.01);
    }

    @org.junit.Test(expected = IllegalNumberOfArgumentsException.class)
    public void givenTooMannyArguments_whenConverterProgramRuns_thenThrowsIllegalNumberOfArgumentsException() {
        ConverterProgram.main("12", "kg", "lb", "sth");
    }

    @org.junit.Test(expected = IllegalConverterUnitsException.class)
    public void givenKgToUnsupportedUnit_whenConverterProgramRuns_thenThrowsIllegalConverterUnitsException() {
        ConverterProgram.main("12", "kg", "unsupported");
    }

    @org.junit.Test(expected = NumberFormatException.class)
    public void givenIncorrectValueToConvert_whenConverterProgramRuns_thenThrowsNumberFormatException() {
        ConverterProgram.main("test", "kg", "lb");
    }

    @org.junit.Test
    public void givenKgToLb_whenConverterProgramRuns_thenOutputIsReturnedSuccessfully() {
        ConverterProgram.main("12", "kg", "lb");
        Assert.assertEquals("The result is: 26.46", outContent.toString().trim());
    }

    @org.junit.After
    public void tearDown() {
        System.setOut(originalOut);
    }
}
