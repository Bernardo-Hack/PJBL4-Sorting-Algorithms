import java.util.concurrent.ThreadLocalRandom;

public class QuickSort {
    static int counter = 1;

    static void quickSort(int[] array) {

        quickSortFunc(array, 0, array.length - 1);

        counter = 1;
    }

    static void quickSortFunc(int[] array, int low, int high) {

        if (low < high) {

            int separation = partition(array, low, high);

            quickSortFunc(array, low, separation - 1);
            quickSortFunc(array, separation + 1, high);
        }
    }

    private static int partition(int[] array, int low, int high) {
        // Index aleatório para melhorar performance
        int randomIndex = ThreadLocalRandom.current().nextInt(low, high + 1);
        swap(array, randomIndex, high);

        int pivot = array[high];
        int lastChangedIndex = low;

        for (int i = low; i < high; i++) {

            if (array[i] <= pivot) {
                
                swap(array, lastChangedIndex, i);

                lastChangedIndex++;
                printStep(array);

            }
        }

        swap(array, lastChangedIndex, high);

        return lastChangedIndex;
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    private static void printStep(int[] array) {

        System.out.print("Passo número " + counter + ": [");

        for (int i = 0; i != array.length; i++) {

            if (i == array.length - 1) {
                System.out.print(array[i] + "]");
                continue;
            }

            System.out.print(array[i] + ", ");
            
        }
        System.out.println("");
        counter++;
    }
}

