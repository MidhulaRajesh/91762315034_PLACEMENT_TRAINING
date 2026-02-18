public class LengthOfLastWord {
    public static void main(String[] args) {
        String s = "Hello World";

        String trimmed = s.trim(); 
        int lastSpace = trimmed.lastIndexOf(' ');

        int length = trimmed.length() - lastSpace - 1;

        System.out.println("Length of last word: " + length);
    }
}
