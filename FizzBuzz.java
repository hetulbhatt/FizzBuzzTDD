import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public List<String> listFizzBuzz(int n) {

        List<String> fizzBuzzList = new ArrayList<>(n);

        for(int i = 1; i <= n; i++) {
            String entryForCurrentNumber = "";

            if(i % 3 == 0 || String.valueOf(i).contains("3")) {
                entryForCurrentNumber += "Fizz";
            }
            if(i % 5 == 0 || String.valueOf(i).contains("5")) {
                entryForCurrentNumber += "Buzz";
            }
            if(entryForCurrentNumber == "") {
                entryForCurrentNumber += i;
            }
            fizzBuzzList.add(entryForCurrentNumber);
        }

        return fizzBuzzList;
    }

    public static void main(String[] args) {
        FizzBuzz fb = new FizzBuzz();
        for(String str : fb.listFizzBuzz(100)) {
            System.out.println(str);
        }
    }
}