/*
 * @lc app=leetcode.cn id=1 lang=java
 *
 * [1] 两数之和
 */

// @lc code=start
// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         int[] result = new int[2];
//         for (int i = 0; i < nums.length; i++){
//             for (int j = i+1;j<nums.length ; j ++){
//                 if (nums[i] + nums[j] == target){
//                     result[0] = i;
//                     result[1] = j;
//                     break;
//                 }
//             }
//         }
//         return result;
//     }
// }
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
                return new int[] { i, map.get(complement) };
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}

// @lc code=end

/*
 * @lc app=leetcode.cn id=1 lang=java
 *
 * [1] 两数之和
 */

// @lc code=start
// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         int[] result = new int[2];
//         for (int i = 0; i < nums.length; i++){
//             for (int j = i+1;j<nums.length ; j ++){
//                 if (nums[i] + nums[j] == target){
//                     result[0] = i;
//                     result[1] = j;
//                     break;
//                 }
//             }
//         }
//         return result;
//     }
// }
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
                return new int[] { i, map.get(complement) };
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}

// @lc code=end

