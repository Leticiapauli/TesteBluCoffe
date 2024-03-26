package com.grupo01.blucoffe.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.grupo01.blucoffe.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
