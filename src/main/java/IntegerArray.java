import java.util.Arrays;

public class IntegerArray {
    public static void main(String[] args){
        Integer[] nums = new Integer[3];
        for(Integer i: nums) {
            System.out.println(i);
        }
        for(int i = 0;i < nums.length;i++){
            nums[i] = i + 1;
            System.out.println(nums[i]);
        }
        Arrays.copyOf(nums,nums.length);
        System.out.println(Arrays.toString(nums));
    }
}