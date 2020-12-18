public class Sorts {
  public static void bubbleSort(int[] data) {
    int swaps = 0;
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
        i = data.length;
      }
    }
  }

  public static void selectionSort(int[] data) {
    int swapIndex = 0;
    int minimum = 0;
    for (int i = 0; i < data.length - 1; i++) {
      minimum = data[i];
      for (int j = i + 1; j < data.length; j++) {
        if (data[j] < minimum) {
          minimum = data[j];
          swapIndex = j;
        }
      }
      data[swapIndex] = data[i];
      data[i] = minimum;
    }
  }
}
