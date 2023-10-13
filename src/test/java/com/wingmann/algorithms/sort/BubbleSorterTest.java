package com.wingmann.algorithms.sort;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BubbleSorterTest {
    @Test
    public void arrayOfNumbers() {
        Integer[] data = {7, 175, 12, 35, 1, 26, 58, 7, 11};
        new BubbleSorter().sort(data);

        Assertions.assertArrayEquals(data, new Integer[]{1, 7, 7, 11, 12, 26, 35, 58, 175});
    }

    @Test
    public void arrayOfStrings() {
        String[] data = {"Alpha", "Delta", "Gamma", "Beta"};
        new BubbleSorter().sort(data);

        Assertions.assertArrayEquals(data, new String[]{"Alpha", "Beta", "Delta", "Gamma"});
    }
}
