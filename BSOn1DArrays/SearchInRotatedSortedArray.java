package BinarySearch.BSOn1DArrays;

public class SearchInRotatedSortedArray {
  public int search(int[] nums, int k) {
    int start = 0, end = nums.length - 1;
    while (start <= end) {
      int mid = (start + end) / 2;
      if(nums[mid] == k)
        return mid;
      if (nums[start] <= nums[mid]){
        if(nums[start] <= k && k < nums[mid])
            end = mid - 1;
        else
            start = mid + 1;
      }else{
        if(nums[mid] < k && k <= nums[end])
            start = mid + 1;
        else
            end = mid - 1;
      }
    }
    return -1;
  }
  public static void main(String args[]){
    int[] nums = {4, 5, 6, 7, 0, 1, 2};
    SearchInRotatedSortedArray sol = new SearchInRotatedSortedArray();
    System.out.println(sol.search(nums,3));
  }
}