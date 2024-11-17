package skn.springframework.recipeproject.services;

import skn.springframework.recipeproject.commands.UnitOfMeasureCommand;

import java.util.Set;

public interface UnitOfMeasureService {

    Set<UnitOfMeasureCommand> listAllUoms();
}
