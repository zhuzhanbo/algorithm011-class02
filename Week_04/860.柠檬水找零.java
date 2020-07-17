import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=860 lang=java
 *
 * [860] 柠檬水找零
 */

// @lc code=start
class Solution {

    // public static void main(String[] args) {
    //     Solution1 s = new Solution1();
    //     s.lemonadeChange(new int[]{5,5,10});
    // }


    public boolean lemonadeChange(int[] bills) {
        Map<Integer,Integer> cash =  new HashMap<Integer,Integer>();
        cash.put(5, 0);
        cash.put(10, 0);
        cash.put(20, 0);
        for(int i : bills){
            switch(i){
                case 5:
                    cash.put(5, cash.get(5)+1);
                    break;
                case 10:
                    if(cash.get(5)>0){
                        cash.put(10, cash.get(10)+1);
                        cash.put(5, cash.get(5)-1);
                        break;
                    }else{
                        return false;
                    }
                case 20:
                if (cash.get(10)>0&&cash.get(5)>0){
                    cash.put(10, cash.get(10)-1);
                    cash.put(5, cash.get(5)-1);
                    cash.put(20, cash.get(20)+1);
                    break;
                    } 
                else if(cash.get(5)>=3){
                    cash.put(5, cash.get(5)-3);
                    cash.put(20, cash.get(20)+1);
                    break;
                }else{
                    return false;
                }
            }
        }
        return true;
    }
}
// @lc code=end

