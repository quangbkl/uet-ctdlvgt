package week10;

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
            arrRight[i] = arr[middle + 1 + i];
        }

        int i = 0;
        int j = 0;
        int k = left;

        while (i < lengthLeft && j < lengthRight) {
            if (arrLeft[i] <= arrRight[j]) {
                arr[k] = arrLeft[i];
                i++;
            } else {
                arr[k] = arrRight[j];
                j++;
            }
            k++;
        }

        while (i < lengthLeft) {
            arr[k] = arrLeft[i];
            i++;
            k++;
        }

        while (j < lengthRight) {
            arr[k] = arrRight[j];
            j++;
            k++;
        }
    }

    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int middle = left + (right - left) / 2;
            mergeSort(arr, left, middle);
            mergeSort(arr, middle + 1, right);
            merge(arr, left, middle, right);
        }
    }
}
