package com.hangnt.demo_sof3021.Buoi8_9_JPA.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author hangnt169
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ProductResponse {

    private Long productId;
    private String productName;

    private String categoryName;

    private Double price;

}
