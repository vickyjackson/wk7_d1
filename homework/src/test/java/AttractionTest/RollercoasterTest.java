package AttractionTest;

import Attraction.Rollercoaster;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    private Rollercoaster rollercoaster1;

    @Before
    public void before(){
        rollercoaster1 = new Rollercoaster("Deathslide");
    }

    @Test
    public void canGetName(){
        assertEquals("Deathslide",rollercoaster1.getName());
    }
}