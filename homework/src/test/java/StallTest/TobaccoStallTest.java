package StallTest;

import Stall.TobaccoStall;
import Visitor.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TobaccoStallTest {

    Visitor visitor1;
    Visitor visitor2;

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

    @Test
    public void notAllowedIfUnder18() {
        visitor1 = new Visitor(17, 150, 5.00);
        assertEquals(false, tobaccoStall1.isAllowedTo(visitor1));
    }

    @Test
    public void isAllowedIfOver18() {
        visitor1 = new Visitor(19, 150, 5.00);
        assertEquals(true, tobaccoStall1.isAllowedTo(visitor1));
    }

}