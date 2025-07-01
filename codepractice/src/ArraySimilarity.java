public class ArraySimilarity {

    public static int solution(String[] s1, String[] s2) {
        int result = 0;

        for(String str1 : s1) {
            for (String str2 : s2) {
                if (str1.equals(str2)) {
                    result++;
                    break;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {

        String[] s1 = {"a", "b", "c"};
        String[] s2 = {"com", "b", "d", "p", "c"};

        int result = solution(s1, s2);
        System.out.println("result = " + result);
    }
}
