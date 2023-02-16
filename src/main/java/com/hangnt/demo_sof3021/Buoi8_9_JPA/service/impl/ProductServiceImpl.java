package com.hangnt.demo_sof3021.Buoi8_9_JPA.service.impl;

import com.hangnt.demo_sof3021.Buoi8_9_JPA.entity.Product;
import com.hangnt.demo_sof3021.Buoi8_9_JPA.repository.ProductRepository;
import com.hangnt.demo_sof3021.Buoi8_9_JPA.response.ProductResponse;
import com.hangnt.demo_sof3021.Buoi8_9_JPA.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hangnt169
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<ProductResponse> getAll() {
        List<ProductResponse> responses = new ArrayList<>();
        List<Product> products = productRepository.getAll();
        for (Product p : products) {
            responses.add(convertProduct(p));
        }
        return responses;
    }

    private ProductResponse convertProduct(Product p) {
        ProductResponse response = new ProductResponse();
        response.setProductId(p.getId());
        response.setProductName(p.getProductName());
        response.setPrice(p.getPrice());
        response.setCategoryName(p.getCategory().getCategoryName());
        return response;
    }
}
