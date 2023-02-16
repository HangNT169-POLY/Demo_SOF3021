package com.hangnt.demo_sof3021.Buoi7_BeanIOCDI.tightcoupling.c3;

/**
 * @author hangnt169
 */
public class Main {
    public static void main(String[] args) {
        SortAlgorithm bubbleSortAlgorithm = new BubbleSortAlgorithm();
        SortAlgorithm quickSortAlgorithm = new QuickSortAlgorithm();
        VeryComplexService business1 = new VeryComplexService(bubbleSortAlgorithm);
        VeryComplexService business2 = new VeryComplexService(quickSortAlgorithm);
    }
}
