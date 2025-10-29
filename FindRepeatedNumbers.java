import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collectors;

public class FindRepeatedNumbers {
    public static LinkedHashMap<Integer,Long> findRepeatedNumbers(int[] arr){
       List<Integer> numbers = Arrays.stream(arr).boxed().collect(Collectors.toList());
        return numbers.stream()
        .collect(Collectors.groupingBy(
            n->n,
            LinkedHashMap::new,
            Collectors.counting()));
        
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,2,5,3,6,7,8,5};
        findRepeatedNumbers(arr);
        System.out.println(findRepeatedNumbers(arr));
    }
    
}
