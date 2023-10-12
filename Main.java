// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static char[] encryption (char[] input_chars, int key) {
        for (int i = 0; i < input_chars.length; i++) {
            input_chars[i] += key;

        }
        return input_chars;
    }

    public static char[] deencryption (char[] input_chars, int key) {
        for (int i = 0; i < input_chars.length; i++) {
            input_chars[i] -= key;

        }
        return input_chars;
    }

    public static void out (char[] input_chars) {
        for (int i = 0; i < input_chars.length; i++) {
            if (i != 0) {
                System.out.print(", ");
            }
            System.out.print(input_chars[i]);
        }
    }

    public static void main(String[] args) {
        
    }


}