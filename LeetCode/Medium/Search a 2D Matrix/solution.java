class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int left = 0;  //first ele
        int right = (rows * cols) - 1; // last ele
 
        while ( left <= right) {
            int mid = left + (right - left) / 2;

            int r = mid / cols;
            int c = mid % cols;

            if(matrix[r][c] == target) {
                return true;
            } else if (matrix[r][c] < target) {
                left = mid +1;
            } else  {
                right = mid -1;
            }
        }
        return false;
    }
}