public class ReverseVowels {
    public static void main(String[] args) {
        String s = "hello";
        char[] arr = s.toCharArray();

        int left = 0, right = arr.length - 1;

        while (left < right) {
            if (!isVowel(arr[left])) {
                left++;
            } else if (!isVowel(arr[right])) {
                right--;
            } else {
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }

        System.out.println("Result: " + new String(arr));
    }

    static boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }
}
