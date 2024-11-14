package skn.springframework.recipeproject.commands;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import skn.springframework.recipeproject.models.Difficulty;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
public class RecipeCommand {
    private Long id;
    private String description;
    private Integer prepTime;
    private Integer cookTime;
    private Integer servings;
    private String source;
    private String url;
    private String directions;
    private Difficulty difficulty;
    private Set<IngredientCommand> ingredients = new HashSet<>();
    private NotesCommand notes;
    private Set<CategoryCommand> categories = new HashSet<>();
}
