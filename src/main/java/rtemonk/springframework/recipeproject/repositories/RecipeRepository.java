package rtemonk.springframework.recipeproject.repositories;

import rtemonk.springframework.recipeproject.models.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {

}
