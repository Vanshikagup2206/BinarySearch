package BinarySearch.BSOn1DArrays;

public class MinInRotatedSortedArray {
    public int findMin(int[] nums) {
        int start = 0, end = nums.length - 1;
        while (start < end) {
            int mid = (start + end) / 2;
            if (nums[mid] > nums[end])
                start = mid + 1;
            else
                end = mid;
        }
        return nums[start];
    }
    public static void main(String args[]){
        int[] nums = {3,4,5,1,2};
        MinInRotatedSortedArray sol = new MinInRotatedSortedArray();
        System.out.println(sol.findMin(nums));
    }
}