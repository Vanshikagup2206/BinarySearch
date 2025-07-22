package BinarySearch.BSOn2DArrays;

public class SortArray {
    public boolean searchMatrix(int[][] mat, int target) {
        int rows = mat.length;
        int cols = mat[0].length;
        int start = 0, end = rows * cols -1;
        while(start <= end){
            int mid = (start + end)/2;
            int row = mid / cols;
            int col = mid % cols;
            int midVal = mat[row][col];
            if(midVal == target)
                return true;
            else if(midVal < target)
                start = mid + 1;
            else
                end = mid - 1;
        }
        return false;
    }
    public static void main(String args[]){
        int[][] mat = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        SortArray sol = new SortArray();
        System.out.println(sol.searchMatrix(mat,3));
    }
}