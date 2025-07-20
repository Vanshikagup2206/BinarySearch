package BinarySearch.BSOn1DArrays;

import java.util.ArrayList;
import java.util.Arrays;

public class MinInArrayList {
    public int findMin(ArrayList<Integer> arr) {
        int start = 0, end = arr.size() - 1;
        while (start < end) {
            int mid = (start + end) / 2;
            if (arr.get(mid) > arr.get(end))
                start = mid + 1;
            else
                end = mid;
        }
        return arr.get(start);
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(4, 5, 6, 7, 0, 1, 2, 3));
        MinInArrayList sol = new MinInArrayList();
        System.out.println("Minimum element is: " + sol.findMin(arr));
    }
}