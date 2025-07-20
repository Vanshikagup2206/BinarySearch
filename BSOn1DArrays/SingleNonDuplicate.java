package BinarySearch.BSOn1DArrays;

public class SingleNonDuplicate {
    public int singleNonDuplicate(int[] nums) {
      int start = 0, end = nums.length - 1;
      while(start < end){
        int mid = (start + end) / 2;
        if(nums[mid] == nums[mid ^ 1]){
            start = mid + 1;
        }else{
            end = mid;
        }
      }
      return nums[start];
    }
    public static void main(String args[]){
        int[] nums = {1, 1, 2, 2, 3, 3, 4, 5, 5, 6, 6};
        SingleNonDuplicate sol = new SingleNonDuplicate();
        System.out.println(sol.singleNonDuplicate(nums)); 
    }
}