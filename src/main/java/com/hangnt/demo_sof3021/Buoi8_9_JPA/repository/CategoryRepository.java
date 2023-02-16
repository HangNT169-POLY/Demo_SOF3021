package com.hangnt.demo_sof3021.Buoi8_9_JPA.repository;

import com.hangnt.demo_sof3021.Buoi8_9_JPA.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * @author hangnt169
 */
@Repository
public interface CategoryRepository extends JpaRepository<Category,Long> {
    Category findCategoryByIdAndCategoryCode(Long id, String categoryCode);

    @Query("SELECT c FROM Category c WHERE c.id = ?1 AND c.categoryCode = ?2")
    Category findCategory1(Long id, String categoryCode);

    @Query("SELECT c FROM Category c WHERE c.id = :id AND c.categoryCode = :category_code")
    Category findCategory2(@Param("id") Long id,@Param("category_code") String categoryCode);

    @Query(value = "SELECT * FROM category c " +
            "WHERE c.id = ?1 AND c.category_code =?2",nativeQuery = true)
    Category findCategory1Native(Long id, String categoryCode);

    @Query(value = "SELECT * FROM category c " +
            "WHERE c.id = :id AND c.category_code =:category_code",nativeQuery = true)
    Category findCategory2Native(@Param("id") Long id,@Param("category_code") String categoryCode);


}
