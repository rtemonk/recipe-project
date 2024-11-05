package skn.springframework.recipeproject.repositories;

import skn.springframework.recipeproject.models.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {

}
