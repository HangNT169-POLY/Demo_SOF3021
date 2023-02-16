package com.hangnt.demo_sof3021.Buoi2_5_MVC_DataSharing_PathVariable_RequestParam_ModeAttribute_Controller_RestController_Validate.controller;

import com.hangnt.demo_sof3021.Buoi2_5_MVC_DataSharing_PathVariable_RequestParam_ModeAttribute_Controller_RestController_Validate.model.SinhVien;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/sinh-vien/")
public class SinhVienController {

    private List<SinhVien> listSinhVien = new ArrayList<>();

    @GetMapping("hien-thi")
    public String hienThiSinhVien(Model model) {
        if (listSinhVien.isEmpty()) {
            listSinhVien.add(new SinhVien("hangnt169", "Nguyễn Thuý Hằng", 10));
            listSinhVien.add(new SinhVien("nguyenvv4", "Vũ Văn Nguyên", 101));
            listSinhVien.add(new SinhVien("phongtt35", "Trần Tuấn Phong", 102));
            listSinhVien.add(new SinhVien("khanhpg", "Phạm Gia Khánh", 104));
            listSinhVien.add(new SinhVien("dungna29", "Nguyễn Anh Dũng", 105));
            listSinhVien.add(new SinhVien("tiennh21", "Nguyễn Hoàng Tiến", 107));
        }
        model.addAttribute("sinhViens", listSinhVien);
        return "buoi2/listSinhVien";
    }

    @GetMapping("search")
    public String searchTheoTen(@RequestParam("ten") String ten, Model model) {
        List<SinhVien> listSearch = new ArrayList<>();
        for (SinhVien sv : listSinhVien) {
            if (sv.getTen().contains(ten)) {
                listSearch.add(sv);
            }
        }
        model.addAttribute("sinhViens", listSearch);
        return "buoi2/listSinhVien";
    }

    @GetMapping("detail/{ma}")
    public String detailStudent(@PathVariable("ma") String ma, Model model) {
        for (SinhVien sv : listSinhVien) {
            if (sv.getMa().equalsIgnoreCase(ma)) {
                model.addAttribute("sinhVien", sv);
            }
        }
        return "buoi2/detailStudent";
    }

    @GetMapping("delete/{ma}")
    public String deleteStudent(@PathVariable("ma") String ma, Model model) {
        for (SinhVien sv : listSinhVien) {
            if (sv.getMa().equals(ma)) {
                listSinhVien.remove(sv);
                break;
            }
        }
        model.addAttribute("sinhViens", listSinhVien);
        return "buoi2/listSinhVien";
    }

    @GetMapping("view-add")
    public String viewAdd(Model model) {
        model.addAttribute("sv1", new SinhVien());
        return "buoi2/addStudent";
    }

    //    @PostMapping("add")
//    public String addSinhVien(@RequestParam("ma") String ma, @RequestParam("ten") String ten, @RequestParam("tuoi") String tuoi, Model model) {
//        SinhVien sinhVien = new SinhVien(ma,ten,Integer.valueOf(tuoi));
//        listSinhVien.add(sinhVien);
//        model.addAttribute("sinhViens", listSinhVien);
//        return "buoi2/listSinhVien";
//    }
//    @PostMapping("add")
//    public String addSinhVien1(@ModelAttribute SinhVien sinhVien, Model model) {
//        listSinhVien.add(sinhVien);
//        model.addAttribute("sinhViens", listSinhVien);
//        return "buoi2/listSinhVien";
//    }
    @PostMapping("add")
    public String addSinhVien2(@Valid @ModelAttribute("sv1") SinhVien sinhVien, BindingResult result) {
        if (result.hasErrors()) {
            return "buoi2/addStudent";
        }
        listSinhVien.add(sinhVien);
        return "redirect:/sinh-vien/hien-thi";
    }


    @GetMapping("view-update/{ma}")
    public String viewUpdate(@PathVariable("ma") String ma, Model model) {
        for (SinhVien sv : listSinhVien) {
            if (sv.getMa().equalsIgnoreCase(ma)) {
                model.addAttribute("sinhVien", sv);
            }
        }
        return "buoi2/updateStudent";
    }

    @PostMapping("update")
    public String updateStudent(@ModelAttribute() SinhVien sinhVien) {
        int index = 0;
        for (SinhVien sv : listSinhVien) {
            if (sv.getMa().equals(sinhVien.getMa())) {
                listSinhVien.set(index, sinhVien);
            }
            index++;
        }
        return "redirect:/sinh-vien/hien-thi";
    }

    @ResponseBody
    @GetMapping("all")
    public List<SinhVien> getAll() {
        listSinhVien.add(new SinhVien("hangnt169", "Nguyễn Thuý Hằng", 10));
        listSinhVien.add(new SinhVien("nguyenvv4", "Vũ Văn Nguyên", 101));
        listSinhVien.add(new SinhVien("phongtt35", "Trần Tuấn Phong", 102));
        listSinhVien.add(new SinhVien("khanhpg", "Phạm Gia Khánh", 104));
        listSinhVien.add(new SinhVien("dungna29", "Nguyễn Anh Dũng", 105));
        listSinhVien.add(new SinhVien("tiennh21", "Nguyễn Hoàng Tiến", 107));
        return listSinhVien;
    }

}
