package sort;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        Integer[] intArray = {4, 6, 9, 10, 1, 2, 3};
        sort(intArray, new ComparatorNormal());
        System.out.println(Arrays.toString(intArray));

        Double[] douArray = {4.2, 6.1, 9.9, 10.0, 1.5, 2.3, 3.0, 1.1};
        sort(douArray, new ComparatorNormal());
        System.out.println(Arrays.toString(douArray));

        String[] strArray = {"snake", "Apple", "java"};
        sort(strArray, new ComparatorNormal());
        System.out.println(Arrays.toString(strArray));

        Cat[] catArray = {new Cat("snake"),
                new Cat("Apple"),
                new Cat("java")};
        sort(catArray, new ComparatorCat());
        System.out.println(Arrays.toString(catArray));

    }

    public static <T> void sort(T[] a, Comparator<T> cmp) {
        // i divides array into two parts: already-sorted, not sorted
        for (int i = 0; i < a.length - 1; i++) {
            int minPos = i;

            // loop to find index containing a minimum value
            for (int j = i + 1; j < a.length; j++) {
                if (cmp.compare(a[j], a[minPos]) < 0) {
                    minPos = j;
                }
            }
            // swap minPos and i so that data in minPos index will
            // be the already-sorted part
            T temp = a[minPos];
            a[minPos] = a[i];
            a[i] = temp;
        }
    }


}