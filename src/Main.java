import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
    }

    public static int [] letterDelete (String [] strings) {
        for (int i = 0; i < strings.length; i++) {
            strings[i] = strings[i].replaceAll("[a-zA-z]", "");
        }
        int[] stringsToInt = new int[strings.length];
        for (int i = 0; i < stringsToInt.length; i++) {
            stringsToInt[i] = Integer.parseInt(strings[i]);
        }
        return stringsToInt;
    }
}
