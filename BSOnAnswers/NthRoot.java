package BinarySearch.BSOnAnswers;

public class NthRoot {
    public int nthRoot(int N, int M) {
        int start = 1, end = M;
        while(start <= end){
            int mid = (start + end) / 2;
            long result = 1;
            for(int i = 1; i <= N; i++){
                result *= mid;
                if(result > M) break;
            }
            if(result == M)
                return mid;
            else if(result < M)
                start = mid + 1;
            else
                end = mid - 1;
        }
        return -1;
    }
    public static void main(String args[]){
        NthRoot sol = new NthRoot();
        System.out.println(sol.nthRoot(3,27));
    }
}