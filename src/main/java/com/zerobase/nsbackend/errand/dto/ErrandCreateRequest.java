package com.zerobase.nsbackend.errand.dto;

import com.zerobase.nsbackend.errand.domain.vo.PayDivision;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@AllArgsConstructor
@Builder
public class ErrandCreateRequest {
  private Long erranderId;
  private String title;
  private String content;
  private PayDivision payDivision;
  private Integer pay;
}