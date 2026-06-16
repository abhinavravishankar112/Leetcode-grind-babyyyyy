/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray arr) {
        int n = arr.length(), left = 0, right = n - 1;
        
        while(left < right){
            int mid = left + (right - left) / 2;

            if(arr.get(mid) < arr.get(mid+1)){
                left = mid + 1;
            }
                else{
                    right = mid;
                }
            }
            int peak = left;
                int res = orderBS(arr, target, 0, peak, true);
                return res != -1 ? res: orderBS(arr, target, peak + 1, n - 1, false);

        }
            private int orderBS(MountainArray arr, int target, int left, int right, boolean isUp){
                while(left <= right){
                    int mid = left + (right - left) / 2;
                
                    int vale = arr.get(mid);
                    if (vale == target){
                        return mid;
                    }
                    if(isUp ? vale < target: vale > target) left = mid + 1;
                    else right = mid - 1;
                }
                return - 1;
            }
        
    }