package com.moringaschool.spoonacularapi.util;

import com.moringaschool.spoonacularapi.models.Result;

import java.util.List;

public interface OnSelectedRecipeListener {
    public void onPetSelected(Integer position, List<Result> recipe, String source);
}
