import java.util.*;
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();
        for(int num : nums){
            count.put(num, count.getOrDefault(num, 0)+ 1);
        }
        return count.entrySet().stream()
        .sorted((a,b)->b.getValue()- a.getValue())
        .limit(k)
        .mapToInt(Map.Entry :: getKey)
        .toArray();
    }   
}