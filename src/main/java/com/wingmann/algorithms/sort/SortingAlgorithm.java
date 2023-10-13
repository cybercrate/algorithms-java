package com.wingmann.algorithms.sort;

/**
 * The common interface of most sorting algorithms.
 */
public interface SortingAlgorithm {
    /**
     * Basic array sorting method.
     *
     * @param data the array should be sorted.
     * @return the sorted array.
     */
    <T extends Comparable<T>> T[] sort(T[] data);
}
