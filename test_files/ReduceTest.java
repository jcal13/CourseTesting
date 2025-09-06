import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/*
  Reminder: There are no hidden tests for this assignment.
 */
public class ReduceTest {


    @Test
    public void testMain() {
        assertEquals(9,
                Reduce.reduce(100),
                "Reduce.main(100) is incorrect");
    }

    @Test
    public void testMainTwoHundred() {
        assertEquals(10,
                Reduce.reduce(200),
                "Reduce.main(200) is incorrect");
    }

    @Test
    public void testMainFortyTwo() {
        assertEquals(8,
                Reduce.reduce(42),
                "Reduce.main(42) is incorrect");
    }

    @Test
    public void testOne() {
        assertEquals(1,
                Reduce.reduce(1),
                "Reduce.main(1) is incorrect");
    }

    @Test
    public void testTwo() {
        assertEquals(2,
                Reduce.reduce(2),
                "Reduce.main(2) is incorrect");
    }
}