package com.wingmann.algorithms.sort;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BubbleSorterTest {
    @Test
    public void arrayOfNumbers_increasing() {
        Integer[] data = {7, 175, 12, 35, 1, 26, 58, 7, 11};
        new BubbleSorter().sort(data);

        Assertions.assertArrayEquals(data, new Integer[]{1, 7, 7, 11, 12, 26, 35, 58, 175});
    }

    @Test
    public void arrayOfNumbers_decreasing() {
        Integer[] data = {7, 175, 12, 35, 1, 26, 58, 7, 11};
        new BubbleSorter().sort(data, SortingType.DECREASING);

        Assertions.assertArrayEquals(data, new Integer[]{175, 58, 35, 26, 12, 11, 7, 7, 1});
    }

    @Test
    public void arrayOfStrings() {
        String[] data = {"Alpha", "Delta", "Gamma", "Beta"};
        new BubbleSorter().sort(data);

        Assertions.assertArrayEquals(data, new String[]{"Alpha", "Beta", "Delta", "Gamma"});
    }
}
