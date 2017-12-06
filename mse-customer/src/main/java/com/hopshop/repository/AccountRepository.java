package com.hopshop.repository;

import com.hopshop.domain.Account;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by rohith on 7/12/17.
 */

@Repository
public interface AccountRepository extends CrudRepository<Account, Long> {

}
