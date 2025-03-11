class Solution {
    public int pivotIndex(int[] nums) {
        int pvt=0;
        int n=nums.length;
        int p[]=new int [n];
        int s[]=new int [n];
        p[0]=nums[0];
        s[n-1]=nums[n-1];
        for(int i=1;i<n;i++)
        {   
            p[i]=p[i-1]+nums[i];
        }
        for(int i=n-2;i>=0;i--)
        {
            s[i]=s[i+1]+nums[i];
        }
        for (int i=0;i<n;i++)
        {
            if(p[i]==s[i])
            return i;
        }
        return -1;
    }
}