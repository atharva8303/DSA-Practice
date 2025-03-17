class Solution {
    public static int[] leftMax(int[]height,int n)
    {
        int left[]=new int[n];
        left[0]=height[0];
        for(int i=1;i<n;i++)
        {
            left[i]=Math.max(left[i-1],height[i]);
        }
        return left;
    }
    public static int[] rightMax(int height[],int n)
    {
        int right[]=new int [n];
        right[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--)
        {
            right[i]=Math.max(right[i+1],height[i]);
        }
        return right;
    }
    public int trap(int[] height) {
        int sum=0;
        
        int n=height.length;
        if(n==0||n==1)
        {return 0;}
        
        int left[]=leftMax(height,n);
        int right[]=rightMax(height,n);
        
        for(int i=0;i<n;i++)
        {
            sum= sum+ Math.min(left[i],right[i])-height[i];
        }
        return sum;

    }
}