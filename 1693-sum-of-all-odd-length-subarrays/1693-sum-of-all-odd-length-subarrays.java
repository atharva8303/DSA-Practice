class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int res =0;
        int n=arr.length;
         
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                if((j-i)%2==0){
                for(int k=i;k<=j;k++)
                {
                    
                    res=res+arr[k];
                }}
            }
        }
        return res;
    }
}