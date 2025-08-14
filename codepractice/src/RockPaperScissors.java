public class RockPaperScissors {

    public static String solution(String rsp) {

        char[] chars = rsp.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (c == '2') {
                chars[i] = '0';
            } else if (c == '0') {
                chars[i] = '5';
            } else
                chars[i] = '2';
        }

        String answer = new String(chars);
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("2"));
        System.out.println(solution("205"));
    }
}
