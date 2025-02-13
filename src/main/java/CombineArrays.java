
public class CombineArrays {
    /**
     * Combine two arrays into a single array and return it.
     *
     * @param arr1 an array of ints.
     * @param arr2 an array of ints.
     * @return an array containing the contents of arr1 followed by the contents of
     *         arr2.
     */
    public int[] combine(int[] arr1, int[] arr2) {

        int[] arr3 = new int[arr1.length + arr2.length];
        int index = 0;

        for (int num : arr1) {
            arr3[index] = num;
            index++;
        }

        for (int num : arr2) {
            arr3[index] = num;
            index++;
        }

        return arr3;
    }
}
