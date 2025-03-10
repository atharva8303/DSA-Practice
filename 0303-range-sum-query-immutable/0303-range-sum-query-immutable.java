class NumArray {
    public int[] arr;


    public NumArray(int[] nums) {
        this.arr = nums;



        
    }
    
    public int sumRange(int left, int right) {
        int res=0;
        for(int i=left;i<=right;i++)
        {
            res=res+arr[i];
        }


        return res;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */