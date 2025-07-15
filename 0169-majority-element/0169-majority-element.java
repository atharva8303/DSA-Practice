class Solution {
    public int majorityElement(int[] a) {
     int count = 0, cand = 0;
    for (int x : a) {
        if (count == 0) cand = x;
        if (x == cand) count++;
        else count--;
    }
    return cand;
}   
    
}