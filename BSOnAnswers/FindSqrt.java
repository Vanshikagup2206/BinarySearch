package BinarySearch.BSOnAnswers;

public class FindSqrt {
    public long floorSqrt(long n) {
      long start = 0, end = n;
      long x = 0;
      while(start <= end){
        long mid = (start + end) / 2;
        if(mid * mid == n)
            return mid;
        else if(mid * mid < n){
            x = mid;
            start = mid + 1;
        }else{
            x = mid;
            end = mid - 1;
        }
      }
      return x;
    }
    public static void main(String args[]){
        FindSqrt sol = new FindSqrt();
        System.out.println(sol.floorSqrt(36));
    }
}