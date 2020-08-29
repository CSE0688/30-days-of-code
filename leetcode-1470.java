class Solution {
    public int[] shuffle(int[] nums, int n) {
        int x=0,y=0,z;
        int t;
        for(x=1;x<n;x++)
        {
            for(z=n, y=x;y<n;y++, z++)
            {
                t=nums[y];
                nums[y]=nums[z];
                nums[z]=t;
                
            }
        }
        return nums;
     }
}