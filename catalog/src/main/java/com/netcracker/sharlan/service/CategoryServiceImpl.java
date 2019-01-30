package com.netcracker.sharlan.service;

import com.netcracker.sharlan.dao.CategoryDao;
import com.netcracker.sharlan.entities.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Set;

@Service
@Transactional
public class CategoryServiceImpl implements CategoryService {

    private CategoryDao dao;

    @Autowired
    public CategoryServiceImpl(CategoryDao dao){
        this.dao = dao;
    }

    @Override
    public Category findById(long id) {
        Category category = dao.findById(id);
        return category;
    }

    @Override
    public Category save(Category category) {
        return dao.save(category);
    }

    @Override
    public void saveAll(Set<Category> categories) {
        dao.saveAll(categories);
    }

    @Override
    public Category update(Category category) {
        if(dao.findById(category.getId()) == null) return null;
        return dao.update(category);
    }

    @Override
    public void delete(Category category) {
        dao.delete(category);
    }

    @Override
    public List<Category> findAll() {
        return dao.findAll();
    }

    @Override
    public void delete(long id) {
        dao.delete(id);
    }
}
