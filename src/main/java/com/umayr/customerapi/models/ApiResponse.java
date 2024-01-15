package com.umayr.customerapi.models;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ApiResponse {
  private String message;
  private Integer statusCode;
}
