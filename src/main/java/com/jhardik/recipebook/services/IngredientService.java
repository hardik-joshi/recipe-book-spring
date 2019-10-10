package com.jhardik.recipebook.services;

import com.jhardik.recipebook.commands.IngredientCommand;

public interface IngredientService {
    IngredientCommand findByRecipeIdAndIngredientId(Long recipeId, Long ingredientId);
}
