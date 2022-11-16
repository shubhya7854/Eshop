package com.categoryProduct.service;

import com.categoryProduct.model.Category;

public interface CategoryService {
	public <optional> Category getCategoryById(Integer Id);

	public void deleteCategory(Integer id);

	public Iterable<Category> getAllCategory();

	public Category saveCategory(Category category);
}
