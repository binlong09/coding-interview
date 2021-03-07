import java.util.*;

class ReverseTheWordsOfAsentence {

    public static void main(String[] args) {
        // String[] str1 = {"i", "live", "in", "a", "house"};
        // String[] result1 = reverseWords1(str1);
        // System.out.println(Arrays.toString(result1));

        String str2 = "I live in a house";
        String result2 = reverseWords2(str2);
        System.out.println(result2);
    }

    public static String[] reverseWords1(String[] array) {
        int i = array.length - 1;
        int j = 0;
        String[] result = new String[i+1];
        while(i >= 0) {
            result[j] = array[i];
            i--;
            j++;
        }
        return result;
    }

    public static String reverseWords2(String str) {
        StringBuilder builder = new StringBuilder();
        int currentWordEnd = str.length();

        for(int i = str.length() - 1; i >= 0; i--) {
            if(str.charAt(i) == ' ') {
                if(builder.length() > 0) {
                    builder.append(' ');
                }
                builder.append(str.substring(i+1, currentWordEnd));
                currentWordEnd = i;
            }
            System.out.print(i);
            System.out.println(str.charAt(i));
        }

        String firstWord = str.substring(0, currentWordEnd);
        if(builder.length() > 0) {
            builder.append(' ');
        }
        builder.append(firstWord);

        return builder.toString();
    }

}