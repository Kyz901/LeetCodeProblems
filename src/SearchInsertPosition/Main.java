package SearchInsertPosition;

/*
 *
 * https://leetcode.com/problems/search-insert-position/
 *
 */

public class Main {
    public static void main(String[] args) {

        Main main = new Main();
        int[] mass = new int[]{1};
        System.out.println(main.searchInsert(mass, 2));
    }

    public int searchInsert(int[] nums, int target) {


        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target | nums[i] > target) {

                return i;
            }



        }
        for (int i = 0; i < nums.length - 1; i++) {


            if (nums[i] < target & nums[i + 1] > target) {
                return i + 1;
            }
            if(nums[i] < target & nums[nums.length-1]==nums[i+1]){
                return i+2;
            }


        }
        if(nums.length == 1){
            if(nums[0] < target){
                return 1;
            } else return 0;
        }


        return -1;
    }
}
