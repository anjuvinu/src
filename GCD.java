public class GCD {
    public static String gcdOfStrings(String a,String b){
        if(!((a+b).equals(b+a))){
            return "";
        }
        int gcd = gcd(a.length(),b.length());
        return a.substring(0, gcd);
    }
    

    public static int gcd(int a,int b){
        return b==0?a:gcd(b,a%b);
    }

    public static void main(String[] args) {
        String str1 = "ABABAB";
        String str2 = "ABAB";
        String result = GCD.gcdOfStrings(str1, str2);
        System.out.println(result); // Output: "AB"
    }
}
