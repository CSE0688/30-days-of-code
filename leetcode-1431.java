class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int i, max=candies[0];
        int x=candies.length;
        for(i=1;i<x;i++)
        {
            if(candies[i]>max)
            {
                max=candies[i];
            }
        }
       List<Boolean> soln = new ArrayList<>();
       for(i=0;i<x;i++)
       {
           if((candies[i]+extraCandies)>=max)
               soln.add(true);
           else
               soln.add(false);
       }
        return soln;
    }