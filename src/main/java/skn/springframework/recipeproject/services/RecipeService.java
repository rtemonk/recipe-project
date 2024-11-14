package skn.springframework.recipeproject.services;

import skn.springframework.recipeproject.commands.RecipeCommand;
import skn.springframework.recipeproject.models.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();

    Recipe findById(Long id);

    RecipeCommand saveRecipeCommand(RecipeCommand command);
}
