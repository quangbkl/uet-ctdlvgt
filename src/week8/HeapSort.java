package week8;

public class HeapSort {
    public static void maxHeapify(int[] arr, int i, int n) {
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        int largest = i;
        if (left < n && arr[largest] < arr[left]) largest = left;
        if (right < n && arr[largest] < arr[right]) largest = right;

        if (largest != i) {
            int temp = arr[largest];
            arr[largest] = arr[i];
            arr[i] = temp;

            maxHeapify(arr, largest, n);
        }
    }

    public static void buildMaxHeap(int[] arr, int n) {
        for (int i = n / 2; i >= 0; i--) {
            maxHeapify(arr, i, n);
        }
    }

    public static void heapSort(int[] arr, int n) {
        buildMaxHeap(arr, n);

        for (int i = n - 1; i >= 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            maxHeapify(arr, 0, i);
        }
    }
}
