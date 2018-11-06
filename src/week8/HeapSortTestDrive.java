package week8;

public class HeapSortTestDrive {
    public static void main(String[] args) {
        int[] arr1 = new int[]{24, 78, 35, 97, 21, -82, 49, -70, 85, -68, 30, 56, -85, -95, 9, 62, 72, -74, -85, -35, 76, -32, -86, -83, 7, 57, 8, 48, -99, -11};
        int[] arr2 = new int[]{62, -49, -18, 16, 35, 81, 90, 41, -42, -75, 33, 19, -96, 0, 66, 96, -80, 66, -30, 59, 79, 9, 69, -11, 70, -97, -67, 55, 7, -81};
        int[] arr3 = new int[]{-72, -37, 13, 96, 59, -54, 54, -90, 24, 70, -28, -3, 23, -26, -3, 56, 66, -83, -23, -71, -31, -24, -92, 86, -88, 91, 56, -42, 67, 55};

        HeapSort.heapSort(arr1, arr1.length);
        for (int i = 0, length = arr1.length; i < length; i++) {
            System.out.print(arr1[i] + ", ");
        }
    }
}
