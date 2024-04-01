package Arrays;

//EASY

// Example 1:
// Input: nums = [2,7,11,15], target = 9
// Output: [0,1]
// Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

// Example 2:
// Input: nums = [3,2,4], target = 6
// Output: [1,2]

// Example 3:
// Input: nums = [3,3], target = 6
// Output: [0,1]

import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

class TwoSum {
  public static int[] twoSum(int[] nums, int target) {
      Map<Integer,Integer> keyCombos = new HashMap<>();
      for (int i = 0; i < nums.length; i++) {
          keyCombos.put(nums[i], i);
      }
      for (int i = 0; i < nums.length; i++) {
          int complement = target - nums[i];
          if (keyCombos.containsKey(complement)) {
              int[] sol = {i, keyCombos.get(complement)};
              if (sol[0] != sol[1]) {
                  return sol;
              }
          }
      }
      return null;
  }
  
  public static void main(String[] args) {
    int[] arr = {2,7,11,15};
    System.out.print(Arrays.toString(twoSum(arr, 9)));
  }
}

// Problem: The problem was to find a combination of numbers in an array which when added would result in a given target number. 

// Implementation: Used a hashmap to log all the values of the array (key) seperatly with its indicies as the values for each key. Then found the complement (subtract trarget-key) for each key and see if the complement existed in the map. If it did I check if it was the same value and if not I returned the indicies array.