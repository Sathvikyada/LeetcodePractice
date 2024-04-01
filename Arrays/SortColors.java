// Example 1:
// Input: nums = [2,0,2,1,1,0]
// Output: [0,0,1,1,2,2]

// Example 2:
// Input: nums = [2,0,1]
// Output: [0,1,2]

package Arrays;

import java.util.Arrays;

class SortColors {
  public static void sortColors(int[] nums) {
    int low = 0;
    int med = 0;
    int high = nums.length - 1;
    while (med <= high) {
        if (nums[med] == 0) {
            int temp = nums[med];
            nums[med] = nums[low];
            nums[low] = temp;
            med++;
            low++;
        } else if (nums[med] == 2) {
            int temp = nums[high];
            nums[high] = nums[med];
            nums[med] = temp;
            high--;
        } else {
            med++;
        }
    }
}

  public static void main(String[] args) {
    int[] nums = {2,0,2,1,1,0};
    sortColors(nums);
    System.out.println(Arrays.toString(nums));
  }
}

// Problem: Sort three colors (represented by 0,1,2) in ascending order with all the same numbers next to each other.

// Solution: Use three pointers to arrange swap the colors into place. There are three pointers (low, medium, high) where the medium will iterate through the array and swap based on its number (swap with low if 0 or high if 2). When the swap occurs, you have to increment or decrement the appropriate pointers. When swapping the low and mid values, we increment both pointers because we know that the low pointer is getting 0. But when we swap the mid and high values we only decrement the high value because you would not know if the value the middle is getting is 0 or 1 which may mean that it needs to be checked to swap with the low or mid after. This algo stops after the mid and high pointer pass each other which would mean that mid pointer has sorted through everything that is not 2 as everything above the high pointer is 2. This would mean that all of the ones are sorted. This algo is called the Dutch National Flag algo/problem.
