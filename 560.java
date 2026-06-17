import java.util.HashMap;
import java.util.Map;

class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> prefixSum = new HashMap<>();
        prefixSum.put(0, 1);

        int currentSum = 0;
        int totalSubarrays = 0;

        for (int num : nums) {
            currentSum += num;

            if (prefixSum.containsKey(currentSum - k)) {
                totalSubarrays += prefixSum.get(currentSum - k);
            }

            prefixSum.put(currentSum, prefixSum.getOrDefault(currentSum, 0) + 1);
        }

        return totalSubarrays;
    }
}