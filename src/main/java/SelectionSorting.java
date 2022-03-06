public class SelectionSorting {
    public static int[] sort(int[] array) {
        long operations = 0;
        for (int i = 0; i < array.length - 1; i++) {
            int minimum = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minimum]) {
                    minimum = j;
                }
                operations++;
            }
            int temp = array[i];
            array[i] = array[minimum];
            array[minimum] = temp;
        }
        System.out.println("Operations count = " + operations);
        return array;
    }
}
