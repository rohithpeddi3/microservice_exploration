package com.hopshop.repository;

import com.hopshop.domain.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by rohith on 7/12/17.
 */

@Repository
public interface CategoryRepository extends CrudRepository<Category, Long> {


}
