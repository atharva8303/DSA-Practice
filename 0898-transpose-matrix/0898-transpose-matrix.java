class Solution {
  public int[][] transpose(int[][] A) {
    int rows=A.length;
    int col=A[0].length;
    int[][] ans = new int[col][rows];

    for (int i = 0; i < rows; ++i)
      for (int j = 0; j < col; ++j)
        ans[j][i] = A[i][j];

    return ans;
  }
}