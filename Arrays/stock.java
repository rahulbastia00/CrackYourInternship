public class stock {
    public static int Maxprofit(int [] nums){
        int buyP = nums[0], profit = 0;
        for(int i=1; i<nums.length; i++){
            if(nums[i] < buyP){
                buyP = nums[i];
            } else {
                int curr_profit = nums[i] - buyP;
                profit = Math.max(curr_profit, buyP);
            }
        }
        return buyP;
    }
    public static void main(String[] args) {
        int [] nums = {7, 4, 5, 3, 3, 6, 4};
        System.out.println(Maxprofit(nums));
    }
}
