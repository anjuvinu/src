import java.util.Arrays;
import java.util.List;

public class Java8Features {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
    public  void demonstrateStreams() {
        // Using Streams to filter and print even numbers
        try {
            numbers.stream()
                    .map(n->n*2)
                    .filter(n->n%2 ==0)
                    .forEach(System.out::println);
                            } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        
        Java8Features java8Features = new Java8Features();
        java8Features.demonstrateStreams();
    }
}
