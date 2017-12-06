package com.hopshop.repository;

import com.hopshop.domain.Cart;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by rohith on 6/12/17.
 */
@Repository
public interface CartRepository extends CrudRepository<Cart, Long> {


}
