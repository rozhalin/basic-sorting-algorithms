public class Main {
    public static void main(String[] args) {
        int[] array = {3, 5, 1, 2, 9, 7, 5};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
        System.out.println("");
        array = Sorting.quickSort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
    }
}
