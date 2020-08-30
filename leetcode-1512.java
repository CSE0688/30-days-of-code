class Solution {
    public int numIdenticalPairs(int[] nums) {
        Arrays.sort(nums);
        int count=0,i=0;
        for(int j=1;j<nums.length;j++)
                if((nums[j]==nums[i])&&(i<j))
                    count+=j-i;
                else
                    i=j;
        return count;
    }
      
}
