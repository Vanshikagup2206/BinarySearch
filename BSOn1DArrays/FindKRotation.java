package BinarySearch.BSOn1DArrays;

import java.util.*;

public class FindKRotation {
    public int findKRotation(ArrayList<Integer> nums) {
        int start = 0, end = nums.size() - 1;
        while(start < end){
            int mid = (start + end) / 2;
            if(nums.get(mid) > nums.get(end))
                start = mid + 1;
            else
                end = mid;
        }
        return start;
    }
    public static void main(String args[]){
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(3, 4, 5, 1, 2));
        FindKRotation sol = new FindKRotation();
        System.out.println(sol.findKRotation(nums));
    }
}
