package com.umayr.customerapi.controllers;

import com.umayr.customerapi.models.ApiResponse;
import com.umayr.customerapi.models.Customer;
import com.umayr.customerapi.repository.CustomerRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import static net.logstash.logback.argument.StructuredArguments.kv;

@RestController
@Slf4j
@AllArgsConstructor
public class CustomerController {

  @Autowired
  private CustomerRepository customerRepository;

  @PostMapping("/customer")
  public Mono<ApiResponse> postCustomerData(@RequestBody Customer customer) {
    log.info("Received customer data: {}", kv("customer", customer));
//    customerRepository.save(customer);
    return Mono.just(ApiResponse.builder()
            .statusCode(200)
            .message("Successfully saved customer data")
            .build());
  }

  @GetMapping("/customer/{ref}")
  public Flux<Customer> postCustomerData(@PathVariable("ref") String customerRef) {
    log.info("Finding customer by ref: {}", kv("ref", customerRef));
    return customerRepository.findByCustomerRef(customerRef);
  }
}
