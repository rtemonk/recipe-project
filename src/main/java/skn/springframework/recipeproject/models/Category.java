package skn.springframework.recipeproject.models;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@Entity
@EqualsAndHashCode(exclude = {"recipe"})
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String categoryName;

    @ManyToMany(fetch = FetchType.EAGER, mappedBy = "categories")
    private Set<Recipe> recipes;

}
