package AttractionTest;

import Attraction.Playground;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {

    private Playground playground1;

    @Before
    public void before(){
        playground1 = new Playground("Playworld");
    }

    @Test
    public void canGetName(){
        assertEquals("Playworld",playground1.getName());
    }
}