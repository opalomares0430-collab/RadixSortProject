package module5;

public class RadixSortTest {

    public static void main(String[] args) {

        int[] numbers = {
                783, 99, 472, 182, 264,
                543, 356, 295, 692, 491, 94
        };

        System.out.println("Original Array:");

        for (int num : numbers) {
            System.out.print(num + " ");
        }

        RadixSort.radixSort(numbers);

        System.out.println("\n\nSorted Array:");

        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
