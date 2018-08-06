package StallTest;

import Stall.TobaccoStall;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TobaccoStallTest {

    TobaccoStall tobaccoStall1;

    @Before
    public void before(){
        tobaccoStall1 = new TobaccoStall("We sell tobacco!", "John", 3);
    }

    @Test
    public void canGetName(){
        assertEquals("We sell tobacco!", tobaccoStall1.getName());
    }

    @Test
    public void canGetOwnerName(){
        assertEquals("John", tobaccoStall1.getOwnerName());
    }

    @Test
    public void canGetParkingSpot(){
        assertEquals(3, tobaccoStall1.getParkingSpot());
    }
}