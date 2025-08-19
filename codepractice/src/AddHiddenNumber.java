public class AddHiddenNumber {

    public int solution(String my_string) {
        String number = my_string.replaceAll("[^0-9]", "");

        int answer = 0;

        for (char ch : number.toCharArray()) {
            answer += Character.getNumericValue(ch);
        }

        return answer;
    }
}
