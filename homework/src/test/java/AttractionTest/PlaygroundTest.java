package AttractionTest;

import Attraction.Playground;
import Visitor.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {

    Visitor visitor1;

    private Playground playground1;

    @Before
    public void before(){
        playground1 = new Playground("Playworld");
    }

    @Test
    public void canGetName(){
        assertEquals("Playworld",playground1.getName());
    }

    @Test
    public void notAllowedIfUnder18() {
        visitor1 = new Visitor(16, 150, 5.00);
        assertEquals(false, playground1.isAllowedTo(visitor1));
    }
}