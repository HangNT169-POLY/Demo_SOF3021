package com.hangnt.demo_sof3021.Buoi8_9_JPA.service;

import com.hangnt.demo_sof3021.Buoi8_9_JPA.entity.Product;
import com.hangnt.demo_sof3021.Buoi8_9_JPA.response.ProductResponse;

import java.util.List;

/**
 * @author hangnt169
 */
public interface ProductService {

    List<ProductResponse> getAll();

}
