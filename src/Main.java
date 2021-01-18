import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
    }

    public static boolean comparisonArrays(int[] array, int[] array1) {
        System.out.println(Arrays.toString(array) + "\n" + Arrays.toString(array1));
        return Arrays.equals(array, array1);
    }
}
