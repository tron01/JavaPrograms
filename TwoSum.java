/* 
Given an array of integers nums and an integer target,
return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, 
and you may not use the same element twice.
You can return the answer in any order.

Example 1:
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

*/


import java.util.HashMap;
//brute force method
class Solution1{

    public int[] twoSum(int[]nums,int target){

        int dif;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                //Input: nums = [2,7,11,15], target = 9 
                //9+2 =7
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                    //[0,1]
                }
            }
        }
        return nums;
    }
    
}


class Solution2{

    public int[] twoSum(int[]nums,int target){

        int dif;
        
        HashMap<Integer,Integer> Seen =new HashMap<>();

        for(int i=0; i<nums.length;i++){
            Integer SeenIndex =Seen.get(nums[i]);

            //if map is not null return
            if(SeenIndex!=null){
                return new int[]{SeenIndex,i};
            }
                //Input: nums = [2,7,11,15], target = 9 
                // Seen {7:0,7:1,0:2)}
            //number:index 
            Seen.put(target-nums[i],i);
            System.out.println(Seen);

        }
        return nums;
    }
    
}

class TwoSum{
    public static void main(String args[])
    {
        
    }
}