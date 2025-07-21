package BinarySearch.BSOnAnswers;

public class FindKthPositive {
    public int findKthPositive(int[] arr, int k) {
        int start = 0, end = arr.length - 1;
        while(start <= end){
            int mid = (start + end)/2;
            int missing = arr[mid] - (mid + 1);                
            if(missing < k)
                start = mid + 1;
            else
                end = mid - 1;
        }
        return start + k;
    }
    public static void main(String args[]){
        int[] arr = {3, 5, 7, 10};
        FindKthPositive sol = new FindKthPositive();
        System.out.println(sol.findKthPositive(arr,6));
    }
}