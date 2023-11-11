public class InsertionSortFile {

    static void insertSortFunc(int[] array) {

        for (int i = 1; i != array.length; i++) {

            int value = array[i];
            int checkedIndex = i - 1;

            while (checkedIndex >= 0 && array[checkedIndex] > value) {
                array[checkedIndex + 1] = array[checkedIndex];
                checkedIndex -= 1;
            }

            array[checkedIndex + 1] = value;
            printStep(array, i);

        }
    }

    private static void printStep(int[] array, int stepNum) {

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
