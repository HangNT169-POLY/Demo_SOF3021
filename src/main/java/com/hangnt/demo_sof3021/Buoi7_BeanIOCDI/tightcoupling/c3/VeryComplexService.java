package com.hangnt.demo_sof3021.Buoi7_BeanIOCDI.tightcoupling.c3;

/**
 * @author hangnt169
 */
public class VeryComplexService {
    private SortAlgorithm sortAlgorithm;

    public VeryComplexService(SortAlgorithm sortAlgorithm){
        this.sortAlgorithm = sortAlgorithm;
    }

    public void complexBusiness(int a[]){
        sortAlgorithm.sort(a);
    }

//    Cách thứ ba này cũng là cách làm phổ biển nhất.
//    Mối liên hệ giữa 2 Class đã "lỏng lẻo" hơn trước rất nhiều.
//    VeryComplexService sẽ không quan tâm tới việc thuật toán sắp xép là gì nữa,
//    mà chỉ cần tập trung vào nghiệp vụ. Còn SortAlgorithm sẽ được đưa vào từ bên ngoài tùy theo nhu cầu sử dụng.
}
