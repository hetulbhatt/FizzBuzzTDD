import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class TestFizzBuzz {
    @Test
    public void testFizzBuzz() {
        List<String> actual = new FizzBuzz().listFizzBuzz(60);
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
        expected.add("Fizz");
        expected.add("14");
        expected.add("FizzBuzz");
        expected.add("16");
        expected.add("17");
        expected.add("Fizz");
        expected.add("19");
        expected.add("Buzz");
        expected.add("Fizz");
        expected.add("22");
        expected.add("Fizz");
        expected.add("Fizz");
        expected.add("Buzz");
        expected.add("26");
        expected.add("Fizz");
        expected.add("28");
        expected.add("29");
        expected.add("FizzBuzz");
        expected.add("Fizz");
        expected.add("Fizz");
        expected.add("Fizz");
        expected.add("Fizz");
        expected.add("FizzBuzz");
        expected.add("Fizz");
        expected.add("Fizz");
        expected.add("Fizz");
        expected.add("Fizz");
        expected.add("Buzz");
        expected.add("41");
        expected.add("Fizz");
        expected.add("Fizz");
        expected.add("44");
        expected.add("FizzBuzz");
        expected.add("46");
        expected.add("47");
        expected.add("Fizz");
        expected.add("49");
        expected.add("Buzz");
        expected.add("FizzBuzz");
        expected.add("Buzz");
        expected.add("FizzBuzz");
        expected.add("FizzBuzz");
        expected.add("Buzz");
        expected.add("Buzz");
        expected.add("FizzBuzz");
        expected.add("Buzz");
        expected.add("Buzz");
        expected.add("FizzBuzz");
                
        assertEquals(expected, actual);

    }
}
