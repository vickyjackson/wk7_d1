package AttractionTest;

import Attraction.Dodgem;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DodgemTest {

    private Dodgem dodgem1;

    @Before
    public void before(){
        dodgem1 = new Dodgem("Dodgy Dodgems");
    }

    @Test
    public void canGetName(){
        assertEquals("Dodgy Dodgems",dodgem1.getName());
    }
}
