import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/*
  One of the tests on MarkUs
 */
public class MultiplesDefaultTest {

    // TODO: When you are ready to test task X,
    //  copy this file into the test folder.
    @Test
    public void testDefault() {
        assertEquals(466,
                Multiples.multiples(),
                "lab1.Multiples.main() is incorrect for default values");
    }

}