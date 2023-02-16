package com.hangnt.demo_sof3021.Buoi2_5_MVC_DataSharing_PathVariable_RequestParam_ModeAttribute_Controller_RestController_Validate.model;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class SinhVien {

    @NotEmpty(message = "Trong")
    @Length(min = 1,max = 5,message = "Nhap trong khoang tu 1 toi 5")
    private String ma;

    @NotBlank(message = "{ten.notblank}")
    @Pattern(regexp = "[a-zA-Z][a-zA-Z ]+",message = "Ten chua dung dinh dang")
    private String ten;
    @Min(value = 5,message = "Min la 5")
    private int tuoi;

}
