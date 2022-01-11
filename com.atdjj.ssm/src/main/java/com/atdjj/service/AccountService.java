package com.atdjj.service;

import com.atdjj.domain.Account;

import java.util.List;

public interface AccountService {

     void save(Account account);

    List<Account> findAll();
}
