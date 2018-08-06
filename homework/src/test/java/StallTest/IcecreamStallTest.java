package StallTest;

import Stall.IcecreamStall;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IcecreamStallTest {

    IcecreamStall icecreamStall1;

    @Before
    public void before(){
        icecreamStall1 = new IcecreamStall("We sell ice cream!", "Sam", 6);
    }

    @Test
    public void canGetName(){
        assertEquals("We sell ice cream!", icecreamStall1.getName());
    }

    @Test
    public void canGetOwnerName(){
        assertEquals("Sam", icecreamStall1.getOwnerName());
    }

    @Test
    public void canGetParkingSpot(){
        assertEquals(6, icecreamStall1.getParkingSpot());
    }
}
