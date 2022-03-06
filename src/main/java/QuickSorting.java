
public class QuickSorting {

    static int[] sort(int[] arr, int low, int high) {
        if (low < high) {
            // pi is partitioning index, arr[p]
            // is now at right place
            int pi = partition(arr, low, high);
            // Separately sort elements before
            // partition and after partition
            arr = sort(arr, low, pi - 1);
            arr = sort(arr, pi + 1, high);
        }
        return arr;
    }
    static int partition(int[] arr, int low, int high)
    {
        // pivot
        int pivot = arr[high];
        // Index of smaller element and
        // indicates the right position
        // of pivot found so far
        int i = (low - 1);
        for(int j = low; j <= high - 1; j++) {
            // If current element is smaller
            // than the pivot
            if (arr[j] < pivot) {
                // Increment index of
                // smaller element
                i++;
                arr = swap(arr, i, j);
            }
        }
        arr = swap(arr, i + 1, high);
        return (i + 1);
    }

    private static int[] swap(int[] array, int firstIndexItem, int secondIndexItem) {
        int temp = array[firstIndexItem];
        array[firstIndexItem] = array[secondIndexItem];
        array[secondIndexItem] = temp;
        return array;
    }
}
