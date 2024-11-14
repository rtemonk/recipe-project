package skn.springframework.recipeproject.commands;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import skn.springframework.recipeproject.models.Recipe;

@Getter
@Setter
@NoArgsConstructor
public class NotesCommand {
    private Long id;
    private Recipe recipe;
    private String recipeNotes;
}
