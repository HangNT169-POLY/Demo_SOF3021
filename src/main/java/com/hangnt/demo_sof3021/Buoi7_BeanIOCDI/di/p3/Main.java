package com.hangnt.demo_sof3021.Buoi7_BeanIOCDI.di.p3;

/**
 * @author hangnt169
 */
public class Main {
    public static void main(String[] args) {
        TrangPhuc vay = new Vay();
        TrangPhuc outfit = new Outfit();

        Nguoi nguoi = new Nguoi(vay);
        Nguoi nguoi1 = new Nguoi(outfit);



    }
}
