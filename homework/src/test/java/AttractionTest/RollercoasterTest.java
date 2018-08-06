package AttractionTest;

import Attraction.Rollercoaster;
import Visitor.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    Visitor visitor1;

    private Rollercoaster rollercoaster1;

    @Before
    public void before(){
        rollercoaster1 = new Rollercoaster("Deathslide");
    }

    @Test
    public void canGetName(){
        assertEquals("Deathslide",rollercoaster1.getName());
    }

    @Test
    public void notAllowedIfUnder12() {
        visitor1 = new Visitor(11, 150, 5.00);
        assertEquals(false, rollercoaster1.isAllowedTo(visitor1));
    }

    @Test
    public void isAllowedIfOver12() {
        visitor1 = new Visitor(13, 150, 5.00);
        assertEquals(true, rollercoaster1.isAllowedTo(visitor1));
    }

    @Test
    public void notAllowedIfTooShort() {
        visitor1 = new Visitor(13, 144, 5.00);
        assertEquals(false, rollercoaster1.isAllowedTo(visitor1));
    }

    @Test
    public void isAllowedIfTallEnough() {
        visitor1 = new Visitor(13, 145, 5.00);
        assertEquals(true, rollercoaster1.isAllowedTo(visitor1));
    }
}