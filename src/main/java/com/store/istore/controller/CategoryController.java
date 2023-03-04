package com.store.istore.controller;

import com.store.istore.model.Category;
import com.store.istore.service.CategoryService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/controller")
@Getter
public class CategoryController {

    @Autowired
    CategoryService categoryService;
    @PostMapping
    public Category create(@RequestBody @Valid Category category ){
        return categoryService.createCategory(category);
    }
    @GetMapping("/{id}")
    public Category getById(@PathVariable Long id){
        return categoryService.getById(id);
    }
    @GetMapping
    public List<Category> getAll(){
        return categoryService.getAll();
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id){
        categoryService.delete(id);
    }
    @PutMapping("/{id}")
    public Category update(@PathVariable("id") Long id,@Valid @RequestBody Category category) {
        //return categoryService.update(id,category);
        System.out.println("");
        return null;
    }
}
