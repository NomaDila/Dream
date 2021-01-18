import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

    }
        public static float[] getFractinalPart(float[] input) {
            float[] result = new float[input.length];
            for (int i = 0; i < input.length; i++) {
                result[i] = input[i] - (int) (input[i]);
            }
            return result;
        }

        public static int[] getIntegerFractionalPart (float[] input){
            int[] result=new int[input.length];
            for (int i = 0; i < input.length; i++) {
                result[i]=(int)((input[i]-(int)input[i])*10);
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