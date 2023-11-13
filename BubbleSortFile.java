public class BubbleSortFile {
    static int counter = 1;

    static void bubbleSort(int[] array) {
        bubbleSortFunc(array, array.length);

        counter = 1;
    }

    private static void bubbleSortFunc(int[] array, int size) {

        for (int checkedIndex = 0; checkedIndex < size - 1; checkedIndex++) {

            if (array[checkedIndex] > array[checkedIndex + 1]) {
                swap(array, checkedIndex);
                printStep(array);
            }
        }

        if (size > 0) {
            bubbleSortFunc(array, size - 1);
        }
    }

    private static void swap(int[] array, int index) {
        int aux = array[index];
        array[index] = array[index + 1];
        array[index + 1] = aux;
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

