package BinarySearch.BSOn1DArrays;

public class SearchInRotatedSortedArrayWithDuplicates {
    public boolean search(int[] nums, int target) {
        int start = 0, end = nums.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] == target)
                return true;
            if (nums[start] == nums[mid] && nums[mid] == nums[end]) {
                start++;
                end--;
            } else if (nums[start] <= nums[mid]) {
                if (nums[start] <= target && target < nums[mid])
                    end = mid - 1;
                else
                    start = mid + 1;
            } else {
                if (nums[mid] < target && target <= nums[end])
                    start = mid + 1;
                else
                    end = mid - 1;
            }
        }
        return false;
    }

    public static void main(String args[]) {
        int[] nums = { 4, 5, 6, 7, 0, 1, 2 };
        SearchInRotatedSortedArrayWithDuplicates sol = new SearchInRotatedSortedArrayWithDuplicates();
        System.out.println(sol.search(nums, 3));
    }
}