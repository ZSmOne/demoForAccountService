package com.example.demo.dto;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AccountResponseDto {
  private List<AccountDto> accounts;
  private int pageNumber;
  private int pageSize;
  private long totalElements;

}
