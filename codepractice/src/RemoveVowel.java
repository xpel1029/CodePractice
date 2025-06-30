public class RemoveVowel {

    public static String Solution(String string) {
        return string.replaceAll("[aeiou]", "");
    }

    public static void main(String[] args) {
        String string = Solution("banana");
        System.out.println("string = " + string);
    }
}
