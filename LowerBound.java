package BinarySearch;

public class LowerBound {
    public int lowerBound(int[] nums, int x) {
        int start = 0, end = nums.length - 1, ans = nums.length;
        while(start <= end){
            int mid = (start + end)/2;
            if(nums[mid] >= x){
                ans = mid;
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return ans;
    }
    public static void main(String args[]){
        int[] nums = {1,2,2,3};
        LowerBound sol = new LowerBound();
        System.out.println(sol.lowerBound(nums,2));
    }
}
