package StallTest;

import Stall.CandyflossStall;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CandyflossStallTest {

    CandyflossStall candyflossStall1;

    @Before
    public void before(){
        candyflossStall1 = new CandyflossStall("We sell candy!", "Bob", 12);
    }

    @Test
    public void canGetName(){
        assertEquals("We sell candy!",candyflossStall1.getName());
    }

    @Test
    public void canGetOwnerName(){
        assertEquals("Bob",candyflossStall1.getOwnerName());
    }

    @Test
    public void canGetParkingSpot(){
        assertEquals(12,candyflossStall1.getParkingSpot());
    }
}
