// 1480. Running Sum of 1d Array

class Solution {
    public int[] runningSum(int[] nums) {
        int x=nums.length;
        int sol[]=new int[x];
        for (int i=1;i<nums.length;i++)
        {
            nums[i]+=nums[i-1];
        }
        return nums;
    }
}