import java.util.Arrays;

public class DescendingSort {
    public static void main(String[] args) {

        Integer[] arr={5,2,1,4,3};
        Arrays.sort(arr, Collections.reverseOrder());

        System.out.println(Arrays.toString(arr));
    }
}
