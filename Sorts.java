public class Sorts{
  /**Bubble sort of an int array.
  *@postcondition The array will be modified such that the elements will be in increasing order.
  *@param data  the elements to be sorted.
  */
  public static void bubbleSort(int[] data) {
    int swaps = 0;
    int largest = 0;
    int middleman = 0;
    for (int i = 0; i < data.length; i++) {
      swaps = 0;
      for (int j = 0; j < data.length - i - 1; j++) {
        if (data[j] > data[j + 1]) {
          middleman = data[j];
          data[j] = data[j + 1];
          data[j + 1] = middleman;
          swaps++;
        }
      }
      if (swaps == 0) {
        break;
      }
    }
  }
}
