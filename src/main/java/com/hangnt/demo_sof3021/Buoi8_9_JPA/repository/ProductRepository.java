package com.hangnt.demo_sof3021.Buoi8_9_JPA.repository;

import com.hangnt.demo_sof3021.Buoi8_9_JPA.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * @author hangnt169
 */
public interface ProductRepository extends JpaRepository<Product, Long> {

    @Query("SELECT p FROM Product p,Category  c WHERE p.category.id = c.id")
    List<Product> getAll();

}
