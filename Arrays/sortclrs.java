public class sortclrs {
    public static void sortcls(int[] nums) {
        int start = 0;
        int mid = 0;
        int end = nums.length - 1;
        while (mid <= end) {
            switch (nums[mid]) {
                case 0:
                    swap(nums, start, mid);
                    start ++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    swap(nums, mid, end);
                    end--;
                    break;
                
            }
        }
        for(int n : nums){
            System.out.print(n+" ,");
        }
    }

    private static void swap(int[] arr, int pos1, int pos2){
        int temp = arr[pos1];
        arr[pos1] = arr[pos2];
        arr[pos2] = temp;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 0, 2, 1, 1, 0, 1, 0, 1, 0 };
        sortcls(arr);
    }
}
