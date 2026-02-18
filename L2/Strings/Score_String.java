public class ScoreOfString {
    public static void main(String[] args) {
        String s = "hello";

        int score = 0;

        for (int i = 0; i < s.length() - 1; i++) {
            score += Math.abs(s.charAt(i) - s.charAt(i + 1));
        }

        System.out.println("Score: " + score);
    }
}
