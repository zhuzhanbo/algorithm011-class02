/*
 * @lc app=leetcode.cn id=122 lang=java
 *
 * [122] 买卖股票的最佳时机 II
 */

// @lc code=start
class Solution {
    
    int bonus = 0;

    public int maxProfit(int[] prices) {
        getProfit(0, prices);
        return bonus;
    }

    public void getProfit(int i,int[] p){
        while(i<p.length-1){
            if(p[i]>p[i+1]){
                ++i;
                getProfit(i,p);
                break;
            }else{
                bonus+=p[i+1]-p[i];
                ++i;
                getProfit(i,p);
                break;
            }
        }
    }
}
// @lc code=end

