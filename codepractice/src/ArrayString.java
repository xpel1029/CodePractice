public class ArrayString {

    public static int[] solution(String my_string) {
        return my_string.chars()                 // 문자열을 IntStream으로 변환
                .filter(Character::isDigit) // 숫자만 남김
                .map(c -> c - '0')           // char -> int
                .sorted()                    // 오름차순 정렬
                .toArray();                  // int[]로 변환
    }


    public static void main(String[] args) {

    }
}
