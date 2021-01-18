import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        float[] arrFloat = {1.2f, 1.8f, 2.2f, 1.5f};
        String[] arrString = {"1g4d3", "3sdfs12", "7d2d2"};

        System.out.println(comparisonArrays(getIntegerFractionalPart(getFractinalPart(arrFloat)), letterDelete(arrString)));
    }

    public static int[] letterDelete(String[] strings) {
        for (int i = 0; i < strings.length; i++) {
            strings[i] = strings[i].replaceAll("[a-zA-z]", "");
        }
        int[] stringsToInt = new int[strings.length];
        for (int i = 0; i < stringsToInt.length; i++) {
            stringsToInt[i] = Integer.parseInt(strings[i]);
        }
        return stringsToInt;
    }

    public static boolean comparisonArrays(int[] array, int[] array1) {
        System.out.println(Arrays.toString(array) + "\n" + Arrays.toString(array1));
        return Arrays.equals(array, array1);
    }

    public static float[] getFractinalPart(float[] input) {
        float[] result = new float[input.length];
        for (int i = 0; i < input.length; i++) {
            result[i] = input[i] - (int) (input[i]);
        }
        return result;
    }

    public static int[] getIntegerFractionalPart(float[] input) {
        int[] result = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            result[i] = (int) ((input[i] - (int) input[i]) * 10);
        }
        return result;

    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }
    }
}