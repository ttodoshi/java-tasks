package Strings;

public class Lesson5Task0 {
    public static void main(String[] args) {
        String text = "sldkj wjeot mxbc. ;lyterk mlsdg sa,dtkkl dl;gh";
        buildDict(text);
    }

    private static void buildDict(String text) {
        for (int i = 97; i < 123; i++) {
            char currentChar = Character.toChars(i)[0];
            System.out.println(currentChar + ": " + charCount(text, currentChar));
        }
    }

    private static int charCount(String mainStr, char desiredSymbol) {
        int counter = 0;
        for (char character : mainStr.toCharArray()) {
            if (character == desiredSymbol) {
                counter++;
            }
        }
        return counter;
    }
}

