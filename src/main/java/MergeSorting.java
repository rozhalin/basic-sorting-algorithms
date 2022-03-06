
public class MergeSorting {

    public static int[] sort(int[] array) {
        if (array.length == 1) { return array;}

        int divisionPosition = array.length / 2;
        int[] firstPart = new int[divisionPosition];
        int[] lastPart = new int[array.length - divisionPosition];

        System.arraycopy(array, 0, firstPart, 0, firstPart.length);
        System.arraycopy(array, firstPart.length, lastPart, 0, lastPart.length);

        firstPart = sort(firstPart);
        lastPart = sort(lastPart);

        return merge(firstPart, lastPart);
    }

    private static int[] merge(int[] firstPart, int[] lastPart) {
        int[] mergedArray = new int[firstPart.length + lastPart.length];
        int firstArrayCounter = 0;
        int lastArrayCounter = 0;
        int mergedArrayCounter = 0;

        while(firstArrayCounter < firstPart.length && lastArrayCounter < lastPart.length) {
            if (firstPart[firstArrayCounter] < lastPart[lastArrayCounter]) {
                mergedArray[mergedArrayCounter] = firstPart[firstArrayCounter++];
            } else {
                mergedArray[mergedArrayCounter] = lastPart[lastArrayCounter++];
            }
            mergedArrayCounter++;
        }
        while (firstArrayCounter < firstPart.length) {
            mergedArray[mergedArrayCounter++] = firstPart[firstArrayCounter++];
        }
        while (lastArrayCounter < lastPart.length) {
            mergedArray[mergedArrayCounter++] = lastPart[lastArrayCounter++];
        }

        return mergedArray;
    }
}
