package com.gherlan.recipeapp.service;

import com.gherlan.recipeapp.command.RecipeCommand;
import com.gherlan.recipeapp.model.Recipe;

import java.util.Optional;

public interface RecipeService extends AbstractService<Recipe, Long> {
    Optional<Recipe> findByDescription(String description);

    RecipeCommand save(RecipeCommand recipeCommand);

    RecipeCommand findCommandById(Long id);
}
