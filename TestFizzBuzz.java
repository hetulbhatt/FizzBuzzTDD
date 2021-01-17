import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class TestFizzBuzz {
    @Test
    public void testFizzBuzz() {
        List<String> actual = new FizzBuzz().listFizzBuzz(15);
        List<String> expected = new ArrayList<String>();
        expected.add("1");
        expected.add("2");
        expected.add("Fizz");
        expected.add("4");
        expected.add("Buzz");
        expected.add("Fizz");
        expected.add("7");
        expected.add("8");
        expected.add("Fizz");
        expected.add("Buzz");
        expected.add("11");
        expected.add("Fizz");
        expected.add("13");
        expected.add("14");
        expected.add("FizzBuzz");
        assertEquals(expected, actual);

    }
}
