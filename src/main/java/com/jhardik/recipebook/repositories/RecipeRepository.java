package com.jhardik.recipebook.repositories;

import com.jhardik.recipebook.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
