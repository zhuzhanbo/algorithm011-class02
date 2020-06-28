//给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
//
// 示例:
//
// 输入: [0,1,0,3,12]
//输出: [1,3,12,0,0]
//
// 说明:
//
//
// 必须在原数组上操作，不能拷贝额外的数组。
// 尽量减少操作次数。
//
// Related Topics 数组 双指针


import sun.font.CreatedFontTracker;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public void moveZeroes(int[] nums) {
        if (nums.length>1){
            int lastIndex = 0;
            for (int i = 0; i<nums.length-1;){
                if (nums[i]==0){
                    for (int k =Math.max(i+1,lastIndex);k<nums.length;){
                        if (nums[k]!=0){
                            nums[i] = nums[k];
                            nums[k] = 0;
                            i++;
                            lastIndex = k;
                            break;
                        }else{
                            k++;
                            if (k==nums.length){
                                i++;
                            }
                        }
                    }
                }else{
                    i++;
                }
            }
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)
