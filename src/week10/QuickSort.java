package week10;

public class QuickSort {
    public static int partition(int[] arr, int left, int right) {
        int latches = arr[right];
        int l = left - 1;
        int r = right;

        while (true) {
            while (true) {
                l++;
                if (arr[l] >= latches) break;
            }
            while (true) {
                r--;
                if (arr[r] <= latches) break;
            }

            if (l < r) {
                int temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
            } else {
                int temp = arr[right];
                arr[right] = arr[l];
                arr[l] = temp;
                return l;
            }
        }
    }

    public static void quickSort(int[] arr, int left, int right) {
        if (left < right) {
            int pos = partition(arr, left, right);
            quickSort(arr, left, pos - 1);
            quickSort(arr, pos + 1, right);
        }
    }
}