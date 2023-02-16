package com.hangnt.demo_sof3021.Buoi7_BeanIOCDI.tightcoupling.c1;

/**
 * @author hangnt169
 */
public class VeryComplexService {

    private BubbleSortAlgorithm bubbleSortAlgorithm  = new BubbleSortAlgorithm();

    public VeryComplexService(){
    }

    public void complexSort(int a[]){
        bubbleSortAlgorithm.sort(a);
    }
//    Với cách làm ở trên,
//    VeryComplexService đã hoàn thiện được nhiệm vụ,
//    tuy nhiên, khi có yêu cầu thay đổi thuật toán sắp xếp sang
//    QuickSort thì nghe vẻ chúng ta sẽ phải sửa lại hoàn toàn cả 2 Class trên.
//    Ngoài ra BubbleSortAlgorithm sẽ chỉ tồn tại nếu VeryComplexService tồn tại,
//    vì VeryComplexService tạo đối tượng BubbleSortAlgorithm bên trong nó
//    (hay nói cách khác là sự sống chết của BubbleSortAlgorithm sẽ do VeryComplexService quyết định),
//    theo như cách implement này, nó là liên kết rất chặt với nhau.
}
