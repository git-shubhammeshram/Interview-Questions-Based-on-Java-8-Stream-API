package StreamAPIQuestions;

import java.util.Arrays;
import java.util.List;

public class _01_FilterTheEvenNumber {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(20,23,8,49,23,96,32);
        list.stream().filter(n -> n%2==0).forEach(System.out::println);
    }
}
