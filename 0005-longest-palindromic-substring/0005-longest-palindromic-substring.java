class Solution {
    int max=0,st=0,e=0;
    public static boolean pal(String s,int i,int j)
    {
        while(i<j)
        {
            int c1= s.charAt(i);
            int c2=s.charAt(j);
            if(c1!=c2)
            
                return false;
                i++;
                j--;
        }
            return true;
    }
    public String longestPalindrome(String s) {
        int n=s.length();
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                if(pal(s,i,j)==true)
                {
                    if(j-i+1>max)
                    {
                        max=j-i+1;
                        st=i;
                        e=j;
                    }
                }
            }
            
        }
        return s.substring(st,e+1);
    }
}