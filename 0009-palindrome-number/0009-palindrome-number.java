class Solution {
    public boolean isPalindrome(int x) {
      int rev=0,d=0;
      int n=x;
      while(n>0)
      {
        d=n%10;
        rev=rev*10+d;
        n=n/10;
      }
      if(rev==x)
      return true;
      else 
      return false;
    }
}