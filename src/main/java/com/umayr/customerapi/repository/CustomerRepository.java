package com.umayr.customerapi.repository;

import com.umayr.customerapi.models.Customer;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository
public interface CustomerRepository extends ReactiveCrudRepository<Customer, Long> {
  Flux<Customer> findByCustomerRef(String customerRef);
}
