package com.wingmann.algorithms.sort;

public class BubbleSorter implements SortingAlgorithm {
    /**
     * Implements generic bubble sort algorithm.
     *
     * @param data the array to be sorted.
     * @param <T>  the type of array elements.
     * @return the sorted array.
     */
    @Override
    public <T extends Comparable<T>> T[] sort(T[] data, SortingType type) {
        var length = data.length - 1;
        boolean swapped;
        int compared;

        for (var i = 0; i <= length; ++i) {
            swapped = false;

            for (var j = 1; j <= length; ++j) {
                compared = data[j].compareTo(data[j - 1]);

                if ((type == SortingType.INCREASING) ? (compared < 0) : (compared > 0)) {
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

    @Override
    public <T extends Comparable<T>> T[] sort(T[] data) {
        return sort(data, SortingType.INCREASING);
    }
}
