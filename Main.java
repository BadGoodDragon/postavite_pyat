// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static char[] encryption (char[] input_chars, int key) {
        for (int i = 0; i < input_chars.length; i++) {
            input_chars[i] = (char)((int)('a') + ((int)(input_chars[i]) - (int)('a') + key ) % 26);

        }
        return input_chars;
    }

    public static char[] deencryption (char[] input_chars, int key) {
        return encryption(input_chars, 26 - key % 26);
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
        char[] arr = {'a', 'b', 'z'};
        out(deencryption(arr, 1));
    }


}