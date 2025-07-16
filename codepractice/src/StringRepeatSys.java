public class StringRepeatSys {

    public static void main(String[] args) {
        String abc = solution("abc", 4);
        System.out.println(abc);
    }

    static public String solution(String my_string, int n) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);

            for (int j = 0; j < n; j++) {
                stringBuilder.append(c);
            }
        }

        return stringBuilder.toString();
    }
}
