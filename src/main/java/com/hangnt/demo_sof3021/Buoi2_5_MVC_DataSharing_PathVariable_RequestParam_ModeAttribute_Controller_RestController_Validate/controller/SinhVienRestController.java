package com.hangnt.demo_sof3021.Buoi2_5_MVC_DataSharing_PathVariable_RequestParam_ModeAttribute_Controller_RestController_Validate.controller;

import com.hangnt.demo_sof3021.Buoi2_5_MVC_DataSharing_PathVariable_RequestParam_ModeAttribute_Controller_RestController_Validate.model.SinhVien;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class SinhVienRestController {

    @GetMapping("/hien-thi-tat-ca")
    public List<SinhVien>getAll(){
        List<SinhVien> listSinhVien = new ArrayList<>();
        listSinhVien.add(new SinhVien("hangnt169", "Nguyễn Thuý Hằng", 10));
        listSinhVien.add(new SinhVien("nguyenvv4", "Vũ Văn Nguyên", 101));
        listSinhVien.add(new SinhVien("phongtt35", "Trần Tuấn Phong", 102));
        listSinhVien.add(new SinhVien("khanhpg", "Phạm Gia Khánh", 104));
        listSinhVien.add(new SinhVien("dungna29", "Nguyễn Anh Dũng", 105));
        listSinhVien.add(new SinhVien("tiennh21", "Nguyễn Hoàng Tiến", 107));
        return listSinhVien;
    }
}
