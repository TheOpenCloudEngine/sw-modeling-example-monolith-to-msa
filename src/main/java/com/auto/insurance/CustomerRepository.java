package com.auto.insurance;

import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by uengine on 2018. 10. 25..
 */
public interface CustomerRepository extends PagingAndSortingRepository<Customer, Long> {
}
