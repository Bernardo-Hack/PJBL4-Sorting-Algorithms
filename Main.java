public class Main {
    public static void main(String[] args) {
        int[] mainArray = {49, 15, 40, 27, 20, 19, 50, 2, 12, 28, 49, 44, 9, 59, 18, 5, 30, 6, 7, 28};

        System.out.println("\n - = Bubble Sort = - \n");

        BubbleSortFile.bubbleSort(mainArray.clone());

        System.out.println("\n - = Insert Sort = - \n");

        InsertionSortFile.insertSort(mainArray.clone());

        System.out.println("\n - = Quick Sort = - \n");

        QuickSort.quickSort(mainArray.clone());

    }
}
