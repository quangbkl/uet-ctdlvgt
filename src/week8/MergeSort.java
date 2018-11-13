package week8;

public class MergeSort {
    public static void merge(int[] arr, int left, int middle, int right) {
        int lengthLeft = middle - left + 1;
        int lengthRight = right - middle;

        int[] arrLeft = new int[lengthLeft];
        int[] arrRight = new int[lengthRight];

        for (int i = 0; i < lengthLeft; i++) {
            arrLeft[i] = arr[left + i];
        }
        for (int i = 0; i < lengthRight; i++) {
            arrRight[i] = arr[middle + 1 + right];
        }
    }
}
