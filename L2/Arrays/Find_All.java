import java.util.*;

public class FindDisappearedNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        boolean[] present = new boolean[n + 1];

        System.out.println("Enter elements (1 to n):");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
            present[nums[i]] = true;
        }

        System.out.print("Missing numbers: ");
        for (int i = 1; i <= n; i++) {
            if (!present[i])
                System.out.print(i + " ");
        }
    }
}
