package AttractionTest;

import Attraction.Park;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ParkTest {

    private Park park1;

    @Before
    public void before(){
        park1 = new Park("Parky McParkface");
    }

    @Test
    public void canGetName(){
        assertEquals("Parky McParkface",park1.getName());
    }
}
