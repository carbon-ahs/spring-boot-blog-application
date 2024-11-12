package com.example.spring_boot_blog_application.services;

import com.example.spring_boot_blog_application.models.Account;
import com.example.spring_boot_blog_application.repositories.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService{
    @Autowired
    private AccountRepository accountRepository;

    public Account save(Account account) {
        return accountRepository.save(account);
    }


}