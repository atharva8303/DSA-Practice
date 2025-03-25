class Solution {
    public int maximumWealth(int[][] accounts) 
    {
        int  res=0;
        int row=accounts.length;
        int col=accounts[0].length;

        for(int i=0 ; i<row ; i++)
        {   
             int sum =0;           
                        
            for(int j=0 ; j<col ; j++)
            {
             sum=sum+accounts[i][j];                                                   
            }
            res = Math.max(res,sum);
        }
        return res;

        
    }
}