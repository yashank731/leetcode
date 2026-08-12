class Solution {
    public void moveZeroes(int[] nums) {
        int j = 0;
        for (int r = 0; r < nums.length; r++) {
            if (nums[r] != 0) {
                int temp = nums[r];
                nums[r] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
    }
}