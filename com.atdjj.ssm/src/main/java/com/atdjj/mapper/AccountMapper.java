package com.atdjj.mapper;

import com.atdjj.domain.Account;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface AccountMapper {

     void save(Account account);

    List<Account> findAll();
}
