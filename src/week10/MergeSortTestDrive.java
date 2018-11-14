package week10;

public class MergeSortTestDrive {
    public static void printArray(int[] arr) {
        for (int item : arr) {
            System.out.print(item + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr1 = new int[]{24, 0, 0, 0, 78, 35, 97, 21, -82, 49, -70, 85, -68, 30, 56, -85, -95, 9, 62, 72, -74, -85, -35, 76, -32, -86, -83, 7, 57, 8, 48, -99, -11};
        MergeSort.mergeSort(arr1, 0, arr1.length - 1);
        printArray(arr1);
    }
}
