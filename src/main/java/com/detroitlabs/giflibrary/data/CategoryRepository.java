package com.detroitlabs.giflibrary.data;

import com.detroitlabs.giflibrary.model.Category;
import com.sun.org.apache.xpath.internal.operations.Bool;
import org.springframework.stereotype.Component;


import java.util.Arrays;
import java.util.List;

@Component
public class CategoryRepository {


    private static final List<Category> ALL_CATEGORIES = Arrays.asList(
            new Category(610, "comedy"),
            new Category(401, "horror"),
            new Category(227, "scifi"));

    public List<Category> getAllCategories() {
        return ALL_CATEGORIES;
    }

    public Category findById(int id) {
        for (Category category : ALL_CATEGORIES) {
            if (category.getId() == id) {
                return category;
            }
        }
        return null;
    }

}


