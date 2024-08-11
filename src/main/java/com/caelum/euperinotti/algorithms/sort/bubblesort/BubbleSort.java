package com.caelum.euperinotti.algorithms.sort.bubblesort;

public class BubbleSort {

  public static void main(String[] args) {
    int[] arr = { 9, 2, 3, 5, 1 };
    System.out.println("Unsorted array: " + java.util.Arrays.toString(arr));
    arr = sort(arr);
    System.out.println("Sorted array: " + java.util.Arrays.toString(arr));
  }

  public static int[] sort(int[] arr) {

    /*
     * We use the length - 1 to avoid index out of bounds exception
     * at the end of the array
     */
    for (int i = 0; i < arr.length - 1; i++) {

      /*
       * Here we use the length - i - 1 because as the algorithm goes, it moves the biggest number to the right
       * so we don't need to check those last indexes because they are already ordered.
       *
       * Ex.: given the array = { 9, 2, 3, 5, 1 };
       * On the first iteration (while i is 0), we are looping through all the array
       * and moving the biggest number (9) all the way to the right.
       *
       * After that there's no need to loop through all the array again because biggest number is already at the end,
       * so we decrease the length of the inner loop
       */
      for (int j = 0; j < arr.length - i - 1; j++) {
        if (arr[j] > arr[j + 1]) {
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }

    return arr;
  }

}
