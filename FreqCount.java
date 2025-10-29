import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FreqCount {
    public  Map<Character, Long> frequencyCount(String words){
        return words.chars()
        .mapToObj(c->(char)c)
        .filter(c -> !Character.isWhitespace(c))
        .collect(Collectors.groupingBy(Function.identity(),
        Collectors.counting()
        ));
    }
      

public static void main(String[] args) {
    FreqCount freqCount = new FreqCount();      
    String words = "hello world";
    Map<Character, Long> freqMap = freqCount.frequencyCount(words);
    System.out.println(freqMap);

    }
}
