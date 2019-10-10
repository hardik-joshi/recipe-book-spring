package com.jhardik.recipebook.services;

import com.jhardik.recipebook.commands.RecipeCommand;
import com.jhardik.recipebook.domain.Recipe;

import java.util.Set;

public interface RecipeService {
    Set<Recipe> getRecipes();

    Recipe findById(Long id);

    RecipeCommand findCommandById(Long id);

    RecipeCommand saveRecipeCommand(RecipeCommand command);

    void deleteById(Long idToDelete);
}
