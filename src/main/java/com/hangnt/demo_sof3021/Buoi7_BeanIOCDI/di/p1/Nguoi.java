package com.hangnt.demo_sof3021.Buoi7_BeanIOCDI.di.p1;

/**
 * @author hangnt169
 */
public class Nguoi {
    private TrangPhuc1 bo1;
    public Nguoi(){
        bo1 = new TrangPhuc1();
        // Nguoi can mac trang phuc 1 => Phu thuoc chat che. Moi quan he phu thuoc o day => chat che
        // => Vay khi o ngoai tao ra 1 nguoi => can tao them 1 trang phuc 1
        // => Xay ra van de neu nguoi muon mac vay thi sao ??? => Phai sua code
        //  => Nguyen tac:
        //  Các Class không nên phụ thuộc vào các kế thừa cấp thấp,
        //  mà nên phụ thuộc vào Abstraction (lớp trừu tượng).
    }

    public void nguoiMac(){
        bo1.mac(); // mac quan ao
    }
}
