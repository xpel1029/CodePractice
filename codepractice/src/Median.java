import java.util.Arrays;

public class Median {

    static public int solution(int[] array) {
        Arrays.sort(array);

        int midIndex = array.length / 2;

        return array[midIndex];
    }

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 7, 10, 11};
        System.out.println(solution(arr1)); // 7

        int[] arr2 = {9, -1, 0};
        System.out.println(solution(arr2)); // 0

    }
}
