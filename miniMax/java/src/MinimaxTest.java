import org.junit.Test;
//import org.junit.Ignore;
import static org.junit.Assert.assertEquals;

public class TimeConversionTest {
    TimeConversion timeConversion = new TimeConversion();

    String noon = "12:35:03PM";
    String expectNoon = "12:35:03";

    String midNight = "12:35:03AM";
    String expectMidNight = "00:35:03";

    @Test
    public void convertNoon(){
        assertEquals(expectNoon, timeConversion.timeConversion(noon));
    }

    @Test
    public void convertMidNight(){
        assertEquals(expectMidNight, timeConversion.timeConversion(midNight));
    }
}