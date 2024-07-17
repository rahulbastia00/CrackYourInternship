public class duplicate{
public static int dupli(int [] nums){
    int sl = 0, fa = 0;
    do{
        sl = nums[sl];
        fa = nums[nums[fa]];
    } while(sl != fa);

    sl = 0;
    while (sl != fa) {
        sl = nums[sl];
        fa = nums[fa];
    }
    return sl;
}
public static void main(String[] args) {
    int [] arr = {2, 6, 4, 1, 3, 1, 5};
    System.out.println(dupli(arr));
}
}
