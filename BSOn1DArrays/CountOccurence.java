package BinarySearch.BSOn1DArrays;

public class CountOccurence {
    public int countOccurence(int[] nums, int target) {
        int start = 0, end = nums.length - 1;
        int[] result = {-1, -1};
        while(start <= end){
            int mid = (start + end)/2;
            if(nums[mid] == target){
                result[0] = mid;
                end = mid - 1;
            }
            else if(nums[mid] < target)
            start = mid + 1;
            else if(nums[mid] > target)
            end = mid - 1;
        }
        start = 0; end = nums.length - 1;
        while(start <= end){
            int mid = (start + end)/2;
            if(nums[mid] == target){
                result[1] = mid;
                start = mid + 1;
            }
            else if(nums[mid] < target)
            start = mid + 1;
            else if(nums[mid] > target)
            end = mid - 1;
        }
        if (result[0] == -1 || result[1] == -1) return 0;
        return (result[1] - result[0] + 1);
    }
    public static void main(String args[]){
        int[] nums = {5, 7, 7, 8, 8, 10};
        CountOccurence sol = new CountOccurence();
        System.out.println(sol.countOccurence(nums, 6));
    }
}