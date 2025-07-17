package BinarySearch;

// Given a sorted array nums and an integer x. 
// Find the floor and ceil of x in nums. The floor of x is the largest element in the array
//  which is smaller than or equal to x. The ceiling of x is the smallest element in the array
//   greater than or equal to x. If no floor or ceil exists, output -1.

import java.util.Arrays;

public class FloorAndCeil {
    public int[] getFloorAndCeil(int[] nums, int x) {
        int start = 0, end = nums.length - 1;
        int floor = -1, ceil = -1;
        while(start <= end){
            int mid = (start + end)/2;
            if(nums[mid] == x){
                floor = nums[mid];
                ceil = nums[mid];
                break; 
            }
            else if(nums[mid] < x){
                floor = nums[mid];
                start = mid + 1;
            }
            else if(nums[mid] > x){
                ceil = nums[mid];
                end = mid - 1;
            }
        }
        int[] result = {floor, ceil};
        return result;
    }
    public static void main(String args[]){
        int[] nums = {3, 4, 4, 7, 8, 10};
        FloorAndCeil sol = new FloorAndCeil();
        System.out.println(Arrays.toString(sol.getFloorAndCeil(nums,5)));
    }
}
