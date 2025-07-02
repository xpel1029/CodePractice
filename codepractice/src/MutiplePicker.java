import java.util.Arrays;

public class MutiplePicker {

    public static int[] solution(int n, int[] numlist) {
        int count = 0;
        for (int num : numlist) {
            if (num % n == 0) {
                count++;
            }
        }

        int[] result = new int[count];

        int index = 0;
        for (int num : numlist) {
            if (num % n == 0) {
                result[index] = num;
                index++;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        int[] a = {4, 5, 6, 7, 8, 9, 10, 11, 12};

        int[] result = solution(3, a);

        System.out.println(Arrays.toString(result));
    }
}
