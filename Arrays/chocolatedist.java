import java.util.*;
public class chocolatedist {
    public static int distribute(int []arr, int m){
        if(arr.length == 0 || m == 0) return 0;
        Arrays.sort(arr);
        if(arr.length-1 < m) return -1;
        int min_diff = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            int nextwin = i + m - 1;
            if(nextwin >= m) break;
            int diff = arr[nextwin] - arr[i];
            min_diff = Math.min(min_diff, diff);
        }
        return min_diff;
    }
    public static void main(String[] args) {
        // Example input
        int arr[] = { 3, 4, 1, 9, 56, 7, 9, 12 };
        int m = 5;

        int result = distribute(arr, m);

        if (result != -1) {
            System.out.println("Minimum difference is " + result);
        } else {
            System.out.println("Invalid input");
        }
    }
}
