package com.hopshop.service;

import com.hopshop.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by rohith on 7/12/17.
 */
@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

}
