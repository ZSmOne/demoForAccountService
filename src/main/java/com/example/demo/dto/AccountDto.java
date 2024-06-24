package com.example.demo.dto;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//public record AccountDto(Long id,
//     String name,
//     String email) {
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AccountDto{

  private String id;
  private String customerId;
  private LocalDateTime openDate;
  private String currency;
  private String accountNumber;
  private String accountName;
  private double balance;
  private String status;
  private Double blockedCash;
  private boolean isMain;
  private String accountType;
  private LocalDateTime closeDate;



}
