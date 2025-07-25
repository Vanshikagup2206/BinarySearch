package BinarySearch.BSOn1DArrays;

public class SearchInsertPosition{
    public int searchInsert(int[] nums, int target) {
        int start = 0, end = nums.length - 1;
        while(start <= end){
            int mid = (start + end)/2;
            if(nums[mid] == target)
            return mid;
            else if(nums[mid] < target)
            start = mid + 1;
            else if(nums[mid] > target)
            end = mid - 1;
        }
        return start;
    }
    public static void main(String args[]){
        int[] nums = {1, 3, 5, 6};
        SearchInsertPosition sol = new SearchInsertPosition();
        System.out.println(sol.searchInsert(nums,2));
    }
}
