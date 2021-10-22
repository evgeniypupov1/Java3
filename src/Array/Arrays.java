package Array;

public class Arrays{
    public static void main(String[] args) {
        int[] nums = new int[] {10, 20, 30, 40, 50};
        nums[0] = 50;
        nums[4] = 10;
        System.out.println(nums[nums.length - 5] + nums[nums.length - 3]);
}
}