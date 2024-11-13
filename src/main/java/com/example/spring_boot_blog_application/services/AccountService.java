package com.example.spring_boot_blog_application.services;

import com.example.spring_boot_blog_application.models.Account;
import com.example.spring_boot_blog_application.models.Post;
import com.example.spring_boot_blog_application.repositories.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AccountService{
    @Autowired
    private AccountRepository accountRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;

    public Account save(Account account) {
        account.setPassword(passwordEncoder.encode(account.getPassword()));
        return accountRepository.saveAndFlush(account);
    }


    public Optional<Account> findByEmail(String email) {
        return accountRepository.findByEmail(email);
    }

//    public Optional<Post> getById(Long id) {
//        return postRepository.findById(id);
//    }
}
