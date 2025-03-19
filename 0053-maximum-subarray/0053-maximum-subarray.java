class Solution {
    public int maxSubArray(int[] nums) {
        int sum=0;
        int maxsum=nums[0];
        
        for(int i=0;i<nums.length;i++)
        {
            sum=sum+nums[i];
            maxsum=Math.max(maxsum,sum);
            if(sum<0)
            {
                sum=0;
            }
        }
        return maxsum;
    }
}