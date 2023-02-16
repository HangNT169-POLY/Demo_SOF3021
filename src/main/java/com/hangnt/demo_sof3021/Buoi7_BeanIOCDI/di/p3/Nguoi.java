package com.hangnt.demo_sof3021.Buoi7_BeanIOCDI.di.p3;

/**
 * @author hangnt169
 */
public class Nguoi {
    private TrangPhuc trangPhuc;
    public Nguoi(TrangPhuc p3){
        this.trangPhuc =p3;
        // Den day da hoan toan tach duoc mqh giua cac class.
       // Khái niệm Dependency Injection từ đây mà ra~
        //Dependency Injection là việc các Object nên phụ thuộc vào các Abstract Class
        // và thể hiện chi tiết của nó sẽ được Inject vào đối tượng lúc runtime.
//        Các cách để Inject dependency vào một đối tượng có thể kể đến như sau:
//
//        Constructor Injection: Cái này chính là ví dụ của mình, tiêm dependency ngay vào Contructor cho tiện.
//        Setter Injection: Ồ, sao không chứ 😗 chúng ta học về Setter từ những bài học vỡ lòng rồi,
//        quá hợp lý. Xài girl.setOutfit(new Naked()) 😈
//        Interface Injection: Mỗi Class muốn inject cái gì, thì phải implement một
//        Interface có chứa một hàm inject(xx) (Gần như thay thế cho setter ý bạn).
//        Rồi bạn muốn inject gì đó thì gọi cái hàm inject(xx) ra.
//        Cách này hơi dài và khó cho người mới.
    }
}
