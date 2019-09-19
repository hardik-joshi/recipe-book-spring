package com.jhardik.recipebook.services;

import com.jhardik.recipebook.domain.Recipe;

import java.util.Set;

public interface RecipeService {
    Set<Recipe> getRecipes();
}
