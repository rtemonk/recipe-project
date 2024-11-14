package skn.springframework.recipeproject.converters;

import skn.springframework.recipeproject.commands.CategoryCommand;
import skn.springframework.recipeproject.models.Category;
import lombok.Synchronized;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

@Component
public class CategoryToCategoryCommand implements Converter<Category, CategoryCommand> {

    @Synchronized
    @Nullable
    @Override
    public CategoryCommand convert(Category source) {
        if(source == null){
            return null;
        }

        final CategoryCommand categoryCommand = new CategoryCommand();
        categoryCommand.setId(source.getId());
        categoryCommand.setCategoryName(source.getCategoryName());
        return categoryCommand;
    }
}
