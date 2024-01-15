package com.umayr.customerapi.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Table(name = "customer")
public class Customer {

  @Id
  private Long id;

  private String customerRef;

  private String customerName;

  private String addressLine1;

  private String addressLine2;

  private String town;

  private String county;

  private String country;

  private String postcode;
}

