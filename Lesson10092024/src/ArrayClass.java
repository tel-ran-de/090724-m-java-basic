import java.util.Arrays;

public class ArrayClass {
    public static void main(String[] args) {
        int[] arr1 = new int[5];
        for (int i = 0; i < 5; i++) {
            arr1[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(arr1[arr1.length - 1]);
        for (int i = 0; i < 5; i++) {
            arr1[i] = i * 2;
        }
        System.out.println(Arrays.toString(arr1));
    }
}
