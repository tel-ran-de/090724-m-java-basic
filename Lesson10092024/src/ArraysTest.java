import java.util.Arrays;

public class ArraysTest {
    public static void main(String[] args) {
        int[] arr = {2, 5, 3, 100, 11};
        System.out.println(Arrays.toString(arr));

        int[] arrCopy = Arrays.copyOf(arr, 3);
        System.out.println(Arrays.toString(arrCopy));

        int[] arrRange = Arrays.copyOfRange(arr, 2, 6);
        System.out.println(Arrays.toString(arrRange));

        int num = arr[1];
        System.out.println(arr[1]);

        int[] arrCopyOf = Arrays.copyOf(arr, arr.length);
        Arrays.sort(arrCopyOf);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arrCopyOf));
    }
}
