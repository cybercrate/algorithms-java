package com.wingmann.algorithms.search;

public class BinarySearcher implements SearchAlgorithm {
    /**
     * @param data an array where the element should be found
     * @param key an element which should be found
     * @param <T> any comparable type
     * @return index of the element
     */
    @Override
    public <T extends Comparable<T>> int find(T key, T[] data) {
        return search(key, data, 0, data.length - 1);
    }

    /**
     * Implements the generic binary search algorithm.
     *
     * @param data the array to make the binary search
     * @param key the number you are looking for
     * @param left the lower bound
     * @param right the upper bound
     * @return the location of the key
     */
    private <T extends Comparable<T>> int search(T key, T[] data, int left, int right) {
        if (right < left) {
            return -1; // key not found
        }

        // Find median.
        int median = (left + right) >>> 1;
        int compared = key.compareTo(data[median]);

        if (compared == 0) {
            return median;
        } else if (compared < 0) {
            return search(key, data, left, median - 1);
        } else {
            return search(key, data, median + 1, right);
        }
    }
}
