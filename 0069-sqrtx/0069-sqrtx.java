class Solution {
    public int mySqrt(int x) {
        long l = -1;
        long h = (long) x + 1;
        while (h - l > 1) {
            long mid = (h + l) / 2;
            if (mid * mid <= x) {
                l = mid;
            } else {
                h = mid;
            }
        }
        return (int) l;
    }
}