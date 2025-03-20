class Solution {
    public int[][] transpose(int[][] matrix) {
     int rows=matrix.length;
     int colms=matrix[0].length;
     int transposem[][]=new int[colms][rows];
     for(int i=0;i<rows;i++)
     {
        for(int j=0;j<colms;j++)
        {
            transposem[j][i]=matrix[i][j];
        }
     }
        return transposem;
    }
}