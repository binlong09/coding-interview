import java.util.*;

public class ReverseWordsOfASentence2 {

    public static void main(String[] args) {
        String str = "I live in a house";
        String result = reverseWords(str);
        System.out.println(result);
    }

    public static String reverseWords(String str) {
        int start = str.length() - 1;
        int end = start;
        StringBuilder newStr = new StringBuilder();
        while (start > 0) {
            if(str.charAt(start) == ' ') {
                newStr.append(str.substring(start, end + 1));
                newStr.append(' ');
                end = start - 1;
            }
            start--;
        }
        if (start == 0) {
            newStr.append(str.charAt(0));
        }
        return newStr.toString().trim();
    }
}