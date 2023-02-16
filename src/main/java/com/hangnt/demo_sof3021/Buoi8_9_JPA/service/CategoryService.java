package com.hangnt.demo_sof3021.Buoi8_9_JPA.service;

import com.hangnt.demo_sof3021.Buoi8_9_JPA.entity.Category;
import org.springframework.data.domain.Page;

import java.util.List;

/**
 * @author hangnt169
 */
public interface CategoryService {

    List<Category>getAll();

    Page<Category> getCategoryByPage(Integer page, Integer size);

    void addCategory(Category category);

    void deleteCategory(Long id);

    void updateCategory(Long id, Category category);

    Category findCategoriesByIdAndCategoryCode(Long id, String categoryCode);

    Category findCategory1(Long id, String categoryCode);

    Category findCategory2(Long id, String categoryCode);


}
