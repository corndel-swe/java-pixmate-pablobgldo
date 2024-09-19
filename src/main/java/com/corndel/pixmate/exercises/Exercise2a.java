package com.corndel.pixmate.exercises;

/**
 * @see <a href="https://tech-docs.corndel.com/java/loop-control-flow.html">Loop Control Flow in Java</a>
 */
public class Exercise2a {

  /**
   * Calculates the sum of numbers in an array that are either even or greater than 10,
   * but skips numbers that are both.
   * <p>
   * For example, if the input array is [1, 4, 12, 15, 20, 5, 8, 10], the method returns 37.
   * </p>
   *
   * @param numbers an array of numbers to be processed
   * @return the sum of numbers that meet the criteria
   */
  public static int sumSelective(int[] numbers) {
    int result = 0;
    for (int i=0; i<numbers.length; i++) {
      if (numbers[i] % 2 == 0 || numbers[i] > 10) {
        if (numbers[i] % 2 == 0 && numbers[i] > 10) {
          continue;
        } else {
          result+= numbers[i];
        }
      }
    }

    return result;
  }
}
