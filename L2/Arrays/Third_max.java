import java.util.*;

public class ThirdMaximum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++)
            nums[i] = sc.nextInt();

        TreeSet<Integer> set = new TreeSet<>();

        for (int num : nums) {
            set.add(num);
            if (set.size() > 3)
                set.pollFirst();
        }

        if (set.size() == 3)
            System.out.println("Third maximum: " + set.first());
        else
            System.out.println("Maximum: " + set.last());
    }
}
