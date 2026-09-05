package main.java.arrays.problems;
import java.util.HashMap;
import java.util.Map;

public class forth {

    public static int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> prefixSumMap = new HashMap<>();
        // Base case: prefix sum of 0 occurs once (empty prefix)
        prefixSumMap.put(0, 1);

        int count = 0;
        int currentSum = 0;

        for (int num : nums) {
            currentSum += num;

            // Check if (currentSum - k) exists in prefix map
            if (prefixSumMap.containsKey(currentSum - k)) {
                count += prefixSumMap.get(currentSum - k);
            }

            // Update frequency of current prefix sum
            prefixSumMap.put(currentSum, prefixSumMap.getOrDefault(currentSum, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {
        // Test cases
        int[] nums1 = {1, 1, 1};
        System.out.println(subarraySum(nums1, 2)); // Output: 2

        int[] nums2 = {1, -1, 0};
        System.out.println(subarraySum(nums2, 0)); // Output: 3
    }
}
