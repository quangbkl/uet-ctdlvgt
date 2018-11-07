package week8;

import java.util.Arrays;

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

    // Xóa phần tử lớn nhất trong heap
    public static void removeMaxHeap(int[] arr, int n) {
        if (n == 0) return;
        arr[0] = arr[n - 1];
        maxHeapify(arr, 0, n - 1);
    }

    public static void insertIncrease(int[] arr, int i, int n) {
        int parent = (i % 2 == 0) ? i / 2 - 1 : i / 2;
        if (parent < 0 || arr[i] < arr[parent]) return;

        int temp = arr[i];
        arr[i] = arr[parent];
        arr[parent] = temp;

        insertIncrease(arr, parent, n);
    }

    // Cập nhật một phần tử thứ i nào đó với một giá trị lớn hơn cho trước
    public static void updateValueHeap(int[] arr, int i, int key, int n) {
        if (key <= arr[i]) {
            arr[i] = key;
            maxHeapify(arr, i, n);
        } else {
            arr[i] = key;
            insertIncrease(arr, i, n);
        }
    }

    // Thêm một phần tử với giá trị khóa mới vào trong heap
    public static int[] pushHeap(int[] arr, int key, int n) {
        int[] newArr = Arrays.copyOf(arr, n + 1);
        newArr[newArr.length - 1] = key;
        insertIncrease(newArr, newArr.length - 1, newArr.length);
        return newArr;
    }
}
