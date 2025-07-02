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

   public static void main(String[] args) {
        Integer[] array = {9, 22, 0, 12, 5, 3, 6, 1};
        insertionSort(array);
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i]);
            if (i < array.length - 1) System.out.print(", ");
        }
   }
}
