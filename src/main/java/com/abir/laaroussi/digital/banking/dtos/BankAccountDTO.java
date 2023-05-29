package com.abir.laaroussi.digital.banking.dtos;


import com.abir.laaroussi.digital.banking.enums.AccountStatus;
import lombok.Data;

import java.util.Date;

@Data
public class BankAccountDTO {

    private String id;
    private double balance;
    private Date createdAt;
    private AccountStatus status;
    private CustomerDTO customerDTO;
    private double overDraft;
    private String type ;
    private double interestRate ;

}
