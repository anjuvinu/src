public class reverseString {
    public static String reverseStringMethod(String s){
        int left =0;
        int right = s.length()-1;
        char[] words =s.toCharArray();
        String vowels = "aeiouAEIOU";

        while(left<right){
                while(left<right && vowels.indexOf(words[left]<=-1)){
                    left++;
                }
                while(left<right && vowels.indexOf(words[right]<=-1)){
                    right--;
                }
                char temp = words[left];
                words[left]=words[right];
                words[right]=temp; 
                left++;
                right--;
            
            }
            return new String(words);

    }
    public static void main(String[] args) {
        String s = "hello";
        String result = reverseString.reverseStringMethod(s);
        System.out.println(result); // Output: "holle"
    }
}
