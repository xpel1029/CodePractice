public class StringInString {

    static int solution(String str1, String str2) {
        int result = (str1.contains(str2)) ? 1 : 2;
        return result;
    }

    public static void main(String[] args) {
        int result = solution("ab6CDE443fgh22iJKlmn1o", "6CD");
        System.out.println(result);
    }

}


