import org.junit.Test;
//import org.junit.Ignore;
import static org.junit.Assert.assertEquals;

public class TimeConversionTest {
    TimeConversion timeConversion = new TimeConversion();

    String noon = "12:35:03PM";
    String expectNoon = "12:35:03";

    String midNight = "12:35:03AM";
    String expectMidNight = "00:35:03";

    String morning = "06:40:03AM";
    String expectMorning = "06:40:03";

    String evening = "07:05:45PM";
    String expectEvening = "19:05:45";

    @Test
    public void convertNoon(){
        System.out.println(timeConversion.timeConversion(noon));
        assertEquals(expectNoon, timeConversion.timeConversion(noon));
    }

    @Test
    public void convertMidNight(){
        System.out.println(timeConversion.timeConversion(midNight));
        assertEquals(expectMidNight, timeConversion.timeConversion(midNight));
    }

    @Test
    public void convertMorning(){
        System.out.println(timeConversion.timeConversion(morning));
        assertEquals(expectMorning, timeConversion.timeConversion(morning));
    }

    @Test
    public void convertEvening(){
        System.out.println(timeConversion.timeConversion(evening));
        assertEquals(expectEvening, timeConversion.timeConversion(evening));
    }
}