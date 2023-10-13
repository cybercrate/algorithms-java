package com.wingmann.algorithms.sort;

public class BubbleSorter implements SortingAlgorithm {
    /**
     * Implements generic bubble sort algorithm.
     *
     * @param data the array to be sorted.
     * @param <T> the type of array elements.
     * @return the sorted array.
     */
    @Override
    public <T extends Comparable<T>> T[] sort(T[] data) {
        int length = data.length - 1;

        for (var i = 0; i <= length; ++i) {
            boolean swapped = false;

            for (var j = 1; j <= length; j++) {
                if (data[j].compareTo(data[j - 1]) < 0) {
                    swapped = true;

                    var temp = data[j];
                    data[j] = data[j - 1];
                    data[j - 1] = temp;
                }
            }

            if (!swapped) {
                break;
            }
        }

        return data;
    }
}
