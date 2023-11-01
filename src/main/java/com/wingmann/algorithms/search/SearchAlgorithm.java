package com.wingmann.algorithms.search;

/**
 * The common interface of most searching algorithms.
 */
public interface SearchAlgorithm {
    /**
     * @param key is an element which should be found
     * @param data is an array where the element should be found
     * @param <T> Comparable type
     * @return first found index of the element
     */
    <T extends Comparable<T>> int find(T key, T[] data);
}
