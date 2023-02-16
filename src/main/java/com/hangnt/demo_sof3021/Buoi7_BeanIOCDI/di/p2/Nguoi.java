package com.hangnt.demo_sof3021.Buoi7_BeanIOCDI.di.p2;

import com.hangnt.demo_sof3021.Buoi7_BeanIOCDI.di.p2.Vay;

/**
 * @author hangnt169
 */
public class Nguoi {
    private  TrangPhuc trangPhuc;
    public Nguoi(){
        trangPhuc = new Vay();
        // da tao ra 1 Nguoi mac vay. Bay gio muon thay doi trang phuc thi doi
        // => Cac class da phu thuoc vao nhau long leo hon.
        // => Tuy nhien Nguoi van phu thuoc mac vay. Sua lai se kho khan
    }

    public void nguoiMac(){
        trangPhuc.wear();
    }
}
