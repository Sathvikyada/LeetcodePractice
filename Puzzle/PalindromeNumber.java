package Puzzle;

// Example 1:
// Input: x = 121
// Output: true
// Explanation: 121 reads as 121 from left to right and from right to left.

// Example 2:
// Input: x = -121
// Output: false
// Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.

// Example 3:
// Input: x = 10
// Output: false
// Explanation: Reads 01 from right to left. Therefore it is not a palindrome.

class Solution {
  public boolean isPalindrome(int x) {
      int original = x;
      int reversed = 0;
      while (original > 0) {
          reversed = reversed*10 + original%10;
          original = original/10;
      }
      if (reversed == x) {
          return true;
      }
      return false;
  }
}

// Problem:
// Palindrome checker for an integer without converting it to a string.

// Solution:
// Took the integer and then created a reversed version of it with a while loop and then compared the reversed with the original number to see if it was equal.