class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int l[]= new int[nums.length];
        int n = nums.length;
        int r[]= new int[nums.length];
        int sum=0;int s=0;
        for (int i=0;i<n;i++)
        {
            sum=sum+nums[i];
            l[i]=sum;
            s=s+nums[n-i-1];
            r[n-i-1]=s;
        }
        for(int i=0;i<n;i++)
        {
            if(i==0)
            {
                nums[i]=r[i]-nums[i]*nums.length;
            }
            else if(i==n-1)
            {
                nums[i]=nums[i]*nums.length-l[i];
            }
            else{

                
                nums[i]=((nums[i]*i)-l[i-1])+(r[i+1]-nums[i]*(nums.length-i-1));
            }
        }
        return nums;
    }
}