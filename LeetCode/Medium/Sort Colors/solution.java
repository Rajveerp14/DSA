class Solution {
    public void sortColors(int[] nums) {
        int l = 0;
        int m = 0;
        int high = nums.length - 1;

        while (m <= high) {
            if (nums[m] == 0) {

                int temp = nums[l];
                nums[l] = nums[m];
                nums[m] = temp;
                l++;
                m++;
            } else if (nums[m] == 1) {
                m++;
            } else { 
    
                int temp = nums[m];
                nums[m] = nums[high];
                nums[high] = temp;

                high--;
            }
        }
    }
}