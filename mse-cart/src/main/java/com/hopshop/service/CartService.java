package com.hopshop.service;

import com.hopshop.domain.Cart;
import com.hopshop.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by rohith on 6/12/17.
 */
@Service
public class CartService {

    @Autowired
    CartRepository cartRepository;

    public Cart getCartDetails (Long cartId) {
        return cartRepository.findOne(cartId);
    }

    public List getCartProductDetails (Long cartId) {
        return  getCartDetails(cartId).getProductDetails();
    }

}
