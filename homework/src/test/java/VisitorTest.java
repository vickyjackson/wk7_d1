import Visitor.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VisitorTest {

    private Visitor visitor1;

    @Before
    public void before(){
        visitor1 = new Visitor(21, 160, 50.00);
    }

    @Test
    public void canGetAge(){
        assertEquals(21, visitor1.getAge());
    }

    @Test
    public void canGetHeight(){
        assertEquals(160, visitor1.getHeight());
    }

    @Test
    public void canGetMoney(){
        assertEquals(50.00, visitor1.getMoney(), 0.0);
    }

}
