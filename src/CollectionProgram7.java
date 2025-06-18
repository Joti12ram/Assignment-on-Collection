import java.util.ArrayList;
import java.util.Arrays;

public class CollectionProgram7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 7. Find the Longest Increasing Subsequence in an ArrayList.
		//Input: [10, 9, 2, 5, 3, 7, 101, 18]
		 ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(10, 9, 2, 5, 3, 7, 101, 18));
		 if (nums.isEmpty()) {
	            System.out.println("Length of LIS: 0");
	            return;
	        }

	        int n = nums.size();
	        int[] dp = new int[n]; // dp[i] = length of LIS ending at index i
	        Arrays.fill(dp, 1); // Every element is at least a subsequence of length 1

	        int maxLength = 1;

	        for (int i = 1; i < n; i++) {
	            for (int j = 0; j < i; j++) {
	                if (nums.get(i) > nums.get(j)) {
	                    dp[i] = Math.max(dp[i], dp[j] + 1);
	                }
	            }
	            maxLength = Math.max(maxLength, dp[i]);
	        }

	        System.out.println("Length of Longest Increasing Subsequence: " + maxLength);
	}

}
