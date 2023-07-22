package ArrayProblems;

public class CheckSentencePangram {
    public static void main(String[] args) {
        String str = "harshita";
        System.out.println(checkIfPangram(str));
    }

    static boolean checkIfPangram(String str) {
        String alphabets[] = {"a","b","c","d","e","f","g","h" ,"i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        for (int i = 0; i < alphabets.length; i++) {
            if (!(str.contains(alphabets[i]))){
                return false;
            }
        }
        return true; 
    }
}
