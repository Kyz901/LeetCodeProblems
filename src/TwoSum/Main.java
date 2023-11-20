package TwoSum;

public class Main {
    public static void main(String[] args) {
        Main.print(Main.twoSum(new int[]{3, 3}, 6));
    }

    public static int[] twoSum(int[] nums, int target) {
        final int[] result = new int[2];

        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                }
            }
        }

        return result;
    }

    public static void print(int[] nums) {
        for(int i : nums) {
            System.out.println(i);
        }
    }
}
