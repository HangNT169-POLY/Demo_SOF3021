package com.hangnt.demo_sof3021.Buoi7_BeanIOCDI.tightcoupling.c2;

/**
 * @author hangnt169
 */
public class VeryComplexService {
    private  SortAlgorithm sortAlgorithm;

    public VeryComplexService(){
        sortAlgorithm = new BubbleSortAlgorithm();
    }

    public void complexBusiness(int a[]){
        sortAlgorithm.sort(a);
    }
//    Với cách làm này, VeryComplexService sẽ chỉ quan hệ với một interface SortAlgorithm.
//    Với cách này thì mỗi quan hệ giảm bớt sự liên kết, nhưng nó không thay đổi được việc thuật toán
//    vẫn đang là BubbleSortAlgorithm.
}
