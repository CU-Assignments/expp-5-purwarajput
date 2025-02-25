import java.util.*;

public class AutoboxingUnboxing {
    public static void main(String[] args) {

        List<String> numberStrings = Arrays.asList("10", "20", "30", "40", "50");

        List<Integer> numbers = new ArrayList<>();
        for (String str : numberStrings) {
            numbers.add(Integer.parseInt(str));
        }

        int sum = 0;
        for (Integer num : numbers) {
            sum += num;
        }

        System.out.println("List of Integers: " + numbers);
        System.out.println("Sum of the list: " + sum);
    }
}

