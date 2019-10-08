package com.jhardik.recipebook.converters;

import com.jhardik.recipebook.commands.IngredientCommand;
import com.jhardik.recipebook.domain.Ingredient;
import lombok.Synchronized;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

@Component
public class IngredientCommandToIngredient implements Converter<IngredientCommand, Ingredient> {

    private final UnitOfMeasureCommandToUnitOfMeasure uomConvertor;

    public IngredientCommandToIngredient(UnitOfMeasureCommandToUnitOfMeasure uomConvertor) {
        this.uomConvertor = uomConvertor;
    }

    @Synchronized
    @Nullable
    @Override
    public Ingredient convert(IngredientCommand source) {
        if (source == null) {
            return null;
        }

        final Ingredient ingredient = new Ingredient();
        ingredient.setId(source.getId());
        ingredient.setAmount(source.getAmount());
        ingredient.setDescription(source.getDescription());
        ingredient.setUnitOfMeasure(uomConvertor.convert(source.getUnitOfMeasure()));
        return ingredient;
    }
}
