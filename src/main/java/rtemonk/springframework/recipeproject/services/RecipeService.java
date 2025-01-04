package rtemonk.springframework.recipeproject.services;

import rtemonk.springframework.recipeproject.commands.RecipeCommand;
import rtemonk.springframework.recipeproject.models.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();

    Recipe findById(Long id);

    RecipeCommand findCommandById(Long id);

    RecipeCommand saveRecipeCommand(RecipeCommand command);

    void deleteById(Long l);
}
