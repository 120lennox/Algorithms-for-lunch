package Sorting;

public class InsertionSort {
    static <E extends Comparable <? super E>>
    void swap(int i , int j, E[] array) {
        E temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    static <E extends Comparable <? super E>>
    void insertionSort(E[] arr) {
        int length = arr.length;
        for (int i = 1; i < length; i++) {
            for (int j = i; (j > 0) && (arr[j].compareTo(arr[j - 1]) < 0); j--) {
                swap(j, j-1, arr);
            }
        }
   }
}
