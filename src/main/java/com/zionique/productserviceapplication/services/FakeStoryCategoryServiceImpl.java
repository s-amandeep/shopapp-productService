package com.zionique.productserviceapplication.services;

import com.zionique.productserviceapplication.clients.fakeStoreApi.FakeStoreClient;
import com.zionique.productserviceapplication.models.Category;
import com.zionique.productserviceapplication.models.Product;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class FakeStoryCategoryServiceImpl implements CategoryService{

    private FakeStoreClient fakeStoreClient;

    @Override
    public List<Category> getAllCategories() {

//        return fakeStoreClient.getAllCategories();
        return null;
    }

    @Override
    public List<Product> getProductsInCategory(String categoryName) {

        return fakeStoreClient.getProductsInCategory(categoryName);
    }

    @Override
    public Optional<Category> getCategoryByName(String categoryName) {
        return Optional.empty();
    }

    @Override
    public Optional<Category> getCategoryById(Long id) {
        return Optional.empty();
    }

    @Override
    public Integer deleteCategoryById(Long id) {
        return null;
    }

    @Override
    public Category addNewCategory(Category category) {
        return null;
    }
}
