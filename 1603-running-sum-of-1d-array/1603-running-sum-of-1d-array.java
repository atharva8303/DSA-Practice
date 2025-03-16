class Solution {
    public int[] runningSum(int[] nums) { 
        int s=0;
        int p[]=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {   s=s+nums[i];
            p[i]=s;
        }
        return p;
    }
}