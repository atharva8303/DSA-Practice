class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int prefix[]= new int[nums.length];
        int n = nums.length;
        int suffix[]= new int[nums.length];
        int sum=0;int s=0;
        for (int i=0;i<n;i++)
        {
            sum=sum+nums[i];
            prefix[i]=sum;

            s=s+nums[n-i-1];
            suffix[n-i-1]=s;
        }
        for(int i=0;i<n;i++)
        {
            if(i==0)
            {
                nums[i]=suffix[i]-nums[i]*nums.length;
            }
            else if(i==n-1)
            {
                nums[i]=nums[i]*nums.length-prefix[i];
            }
            else{

                
                nums[i]=((nums[i]*i)-prefix[i-1])+(suffix[i+1]-nums[i]*(nums.length-i-1));
            }
        }
        return nums;
    }
}