public class RemoveSpecificChar {

    static class Solution {
        public String solution(String my_string, String letter) {
            return my_string.replace(letter, "");
        }
    }

    public static void main(String[] args) {
        Solution s1 = new Solution();

        String result1 = s1.solution("abcde", "b");
        System.out.println(result1);

        String result2 = s1.solution("taken", "e");
        System.out.println(result2);
    }
}
