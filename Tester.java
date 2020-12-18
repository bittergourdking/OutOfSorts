import java.util.Arrays;
public class Tester {
  public static void main(String[] args) {
    int[] a = {13, 74, 51, 83, 2, 90};
    int[] b = {};
    int[] c = {6, 1, 2, 3, 4, 5};
    Sorts.selectionSort(a);
    Sorts.selectionSort(b);
    Sorts.selectionSort(c);
    System.out.println(Arrays.toString(a));
    System.out.println(Arrays.toString(b));
    System.out.println(Arrays.toString(c));
  }
}
