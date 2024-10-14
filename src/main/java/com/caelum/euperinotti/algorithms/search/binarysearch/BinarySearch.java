package com.caelum.euperinotti.algorithms.search.binarysearch;

/**
 * Binary Search Algorithm is a searching algorithm
 * used in a sorted array by repeatedly dividing the search interval in half.
 * The idea of binary search is to use the information that the array is sorted
 * and reduce the time complexity to O(log N).
 *
 * It works by repeatedly dividing the search interval in half until the
 * target value is found or the interval is empty. The search interval is halved
 * by comparing the target element with the middle value of the search space.
 */
public class BinarySearch {
  public static void main(String[] args) {
    int arr[] = { 2, 3, 4, 10, 40 };
    int target = 10;
    int res = BinarySearch.execute(arr, target);

    System.out.println(res);
  }

  /**
   * 1- Divide the search space into two halves by finding the middle index “mid”.
   * 2- Compare the middle element of the search space with the key.
   * 3- If the key is found at middle element, the process is terminated.
   * 4- If the key is not found at middle element, choose which half will be used
   * as the next search space.
   * 5- If the key is smaller than the middle element, then the left side is used
   * for next search.
   * 6- If the key is larger than the middle element, then the right side is used
   * for next search.
   * 7- This process is continued until the key is found or the total search space
   * is exhausted.
   */
  public static int execute(int[] arr, int target) {
    int low = 0, high = arr.length - 1;
    while (low <= high) {
      int mid = low + (high - low) / 2;

      // Check if target is present at mid
      if (arr[mid] == target)
        return mid;

      // If target greater, ignore left half
      if (arr[mid] < target)
        low = mid + 1;

      // If target is smaller, ignore right half
      else
        high = mid - 1;
    }

    // If we reach here, then element was
    // not present
    return -1;
  }
}
