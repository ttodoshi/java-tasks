package strings;

public class StringTasks {
    public static void main(String[] args) {
        System.out.println(getLongestString(new String[] {"a", "ab", "abo", "bibb", "soss", "aljdsg", "ksd", "jsdlgkjsdlkgj"}));
        System.out.println(isPalindrome("aboba"));
        System.out.println(replaceWord("а вдпо дыовп дозце чбсьи доыегц навальный, ны оплыо оооп дцубье lsjadf навальный", "навальный", "'вырезано цензурой'"));
        System.out.println(findSubstring("а вдпо дыовп дозце чбсьи доыегц навальный, ны оплыо оооп дцубье lasjg навальный", "навальный"));
    }
    private static String getLongestString(String[] strings){
        String longestString = strings[0];
        for (String string : strings){
            if (string.length() > longestString.length()){
                longestString = string;
            }
        }
        return longestString;
    }
    private static boolean isPalindrome(String string){
        return string.equalsIgnoreCase(new StringBuilder(string).reverse().toString());
    }
    private static String replaceWord(String text, String replacedWord, String toWord){
        return text.replaceAll(replacedWord, toWord);
    }
    private static int findSubstring(String mainStr, String substring){
        int counter = 0;
        for (String word: mainStr.split(" ")){
            if (word.matches(substring + ".") || word.matches(substring)){
                counter++;
            }
        }
        return counter;
    }
}
