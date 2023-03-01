package com.store.istore.service;

import com.store.istore.model.Category;
import com.store.istore.repository.CategoryRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
@Slf4j
@RequiredArgsConstructor
public class CategoryService {
    @Autowired
    CategoryRepository categoryRepository;

    public Category createCategory(Category category) {
        categoryRepository.save(category);
        return category;
    }

    public Category getById(Long id) {
        Optional<Category> optionalBusiness = categoryRepository.findById(id);
        return optionalBusiness.get();
    }

    public List<Category> getAll() {
        return categoryRepository.findAll();
    }

//    public Category update(Long id,Category dto) {
//        Optional<Category> optionalBusiness = categoryRepository.findById(id);
//        Category category = optionalBusiness.get();
//        category.setcategoryName(dto.getcategoryName());
//        category.setDescription(dto.getDescription());
//        category.setUpdatedAt(new Date());
//        category = businessCategoryRepository.save(category);
//        return category;
//    }

    public void delete(Long id) {
        Optional<Category> optionalBusiness = categoryRepository.findById(id);
        categoryRepository.delete(optionalBusiness.get());
        log.info("category with id deleted");
    }
}
