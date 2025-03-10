class Solution {
    public int[] runningSum(int[] nums) {
        int a[]=new int[nums.length];
        int s=0;
        for(int i=0;i<nums.length;i++)
        {   s=s+nums[i];
            a[i]=s;
        }
        return a;
    }
}