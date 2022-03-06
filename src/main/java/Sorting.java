public class Sorting {

    public static int[] bubbleSort(int[] array) {
        return BubbleSorting.sort(array);
    }

    public static int[] selectionSort(int[] array) {
        return SelectionSorting.sort(array);
    }

    public static int[] insertionSort(int[] array) {
        return InsertionSorting.sort(array);
    }

    public static int[] mergeSort(int[] array) {
        return MergeSorting.sort(array);
    }

    public static int[] quickSort(int[] array) {
        return QuickSorting.sort(array, 0, array.length-1);
    }
}
