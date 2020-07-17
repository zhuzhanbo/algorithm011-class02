/*
 * @lc app=leetcode.cn id=169 lang=java
 *
 * [169] 多数元素
 */

// @lc code=start
class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> countMap = new HashMap<Integer, Integer>();
        int result = 0;
        int count = 0;
        for (int num : nums) {
            if (countMap.containsKey(num)) {
                countMap.put(num, countMap.get(num) + 1);
                if (countMap.get(num) + 1 > count) {
                    count = countMap.get(num) + 1;
                    result = num;
                }
            } else {
                countMap.put(num,1);
                if (1 >= count) {
                    count = 1;
                    result = num;
                }
            }
        }
        return result;
    }

/*     public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    } */

}
// @lc code=end
