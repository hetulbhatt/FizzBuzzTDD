import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public List<String> listFizzBuzz(int n) {

        List<String> fizzBuzzList = new ArrayList<>(n);

        for(int i = 1; i <= n; i++) {
            String entryForCurrentNumber = "";

            if(i % 3 == 0) {
                entryForCurrentNumber += "Fizz";
            }
            if(i % 5 == 0) {
                entryForCurrentNumber += "Buzz";
            }
            if(entryForCurrentNumber == "") {
                entryForCurrentNumber += i;
            }
            fizzBuzzList.add(entryForCurrentNumber);
        }

        return fizzBuzzList;
    }
}