package com.example.demo.Controller;


import com.example.demo.dto.AccountDto;
import com.example.demo.dto.AccountResponseDto;
import java.awt.print.Pageable;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/accounts")
public class AccountController {

  @GetMapping("/customer")
  public AccountResponseDto getAccounts(
      @RequestParam("customer_id") UUID customerId,
//      @RequestParam(defaultValue = "0") int page,
//      @RequestParam(defaultValue = "30") int size,
//      @RequestParam(defaultValue = "string") String[] sort)
      Pageable pageable)

  {
    AccountDto account1 = new AccountDto();
    account1.setId("00000000-0000-0000-0000-0000000003f5");
    account1.setCustomerId("c1c12bfb-ee07-42ee-9171-b705cebd6309");
    account1.setOpenDate(LocalDateTime.of(2024, 6, 9, 0, 0));
    account1.setCurrency("RUB");
    account1.setAccountNumber("81014081704026670001");
    account1.setAccountName("81014081704026670001");
    account1.setBalance(0);
    account1.setStatus("ACTIVE");
    account1.setBlockedCash(null);
    account1.setMain(false);
    account1.setAccountType("PAYMENT");
    account1.setCloseDate(LocalDateTime.of(2024, 6, 9, 20, 28, 56));

    AccountDto account2 = new AccountDto();
    account2.setId("00000000-0000-0000-0000-0000000003f4");
    account2.setCustomerId("c1c12bfb-ee07-42ee-9171-b705cebd6309");
    account2.setOpenDate(LocalDateTime.of(2024, 6, 9, 0, 0));
    account2.setCurrency("EUR");
    account2.setAccountNumber("97814081722667300001");
    account2.setAccountName("97814081722667300001");
    account2.setBalance(0);
    account2.setStatus("ACTIVE");
    account2.setBlockedCash(null);
    account2.setMain(false);
    account2.setAccountType("PAYMENT");
    account2.setCloseDate(LocalDateTime.of(2024, 6, 9, 20, 28, 56));

    List<AccountDto> accounts = Arrays.asList(account1, account2);

    AccountResponseDto response = new AccountResponseDto();
    response.setAccounts(accounts);
    response.setPageNumber(1);
    response.setPageSize(10);
    response.setTotalElements(30);

    return response;
  }


}
