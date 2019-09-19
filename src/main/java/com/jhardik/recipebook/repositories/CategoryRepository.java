package com.jhardik.recipebook.repositories;

import com.jhardik.recipebook.domain.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
