public class BubbleSortFile {

    static void bubbleSortFunc(int[] array, int size) {
        boolean didChange = false;

        for (int checkedIndex = 0; checkedIndex < size - 1; checkedIndex++) {

            if (array[checkedIndex] > array[checkedIndex + 1]) {
                swap(array, checkedIndex);
                didChange = true;
            }
        }

        if (didChange) {
            printStep(array, size);
        }

        if (size > 0) {
            bubbleSortFunc(array, size - 1);
        }
    }

    static void swap(int[] array, int index) {
        int aux = array[index];
        array[index] = array[index + 1];
        array[index + 1] = aux;
    }

    private static void printStep(int[] array, int stepNum) {

        stepNum = (array.length - stepNum) + 1;
        System.out.print("Passo número " + stepNum + ": [");

        for (int i = 0; i != array.length; i++) {

            if (i == array.length - 1) {
                System.out.print(array[i] + "]");
                continue;
            } 

            System.out.print(array[i] + ", ");

        }
        System.out.println("");
    }
}

