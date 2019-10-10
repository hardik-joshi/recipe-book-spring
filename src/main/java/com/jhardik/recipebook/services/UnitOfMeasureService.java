package com.jhardik.recipebook.services;

import com.jhardik.recipebook.commands.UnitOfMeasureCommand;

import java.util.Set;

public interface UnitOfMeasureService {
    Set<UnitOfMeasureCommand> listAllUnitOfMeasures();
}
