public class mergeAlternatively {
    public static String mergeAlternativeString(String word1,String word2){
        StringBuilder merged = new StringBuilder();
        int len1 = word1.length();
        int len2 = word2.length();
        int min = Math.min(len1,len2);

        for(int i=0;i<min;i++){
        merged.append(word1.charAt(i));
        merged.append(word2.charAt(i));
        }

        if(len1>len2)
        {
            merged.append(word1.substring(min));
        } else {
            merged.append(word2.substring(min));
        }
        return merged.toString();
}
public static void main(String[] args) {
        String word1 = "abc";
        String word2 = "pqrstu";
        String result = mergeAlternatively.mergeAlternativeString(word1, word2);
        System.out.println(result); // Output: apbqcrstu
    }

}
