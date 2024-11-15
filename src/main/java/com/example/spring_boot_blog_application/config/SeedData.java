package com.example.spring_boot_blog_application.config;

import com.example.spring_boot_blog_application.models.Account;
import com.example.spring_boot_blog_application.models.Authority;
import com.example.spring_boot_blog_application.models.Post;
import com.example.spring_boot_blog_application.repositories.AuthorityRepository;
import com.example.spring_boot_blog_application.services.AccountService;
import com.example.spring_boot_blog_application.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Component
public class SeedData implements CommandLineRunner {
    @Autowired
    private PostService postService;

    @Autowired
    private AccountService accountService;

    @Autowired
    private AuthorityRepository authorityRepository;

    @Override
    public void run(String... args) throws Exception {
        List<Post> posts = postService.getAll();

        if (posts.isEmpty()) {
//            Post p1 = new Post();
//            p1.setTitle("Title p 1");
//            p1.setBody("Body p1");

//            Account account = new Account();
//            account.setFirstName("");
//            account.setLastName("");
//            account.setEmail("");
//            account.setPassword("");
//            Set<Authority> authorities = new HashSet<>();
//            authorityRepository.findById("ROLE_USER").ifPresent(authorities::add);
//


            Account account1 = new Account();
            account1.setFirstName("user");
            account1.setLastName("user");
            account1.setEmail("user@domain.com");
            account1.setPassword("1234");
            Set<Authority> authorities1 = new HashSet<>();
            authorityRepository.findById("ROLE_USER").ifPresent(authorities1::add);
            account1.setAuthorities(authorities1);


            Account account2 = new Account();
            account2.setFirstName("admin");
            account2.setLastName("admin");
            account2.setEmail("admin@domain.com");
            account2.setPassword("1234");
            Set<Authority> authorities2 = new HashSet<>();
            authorityRepository.findById("ROLE_USER").ifPresent(authorities2::add);
            authorityRepository.findById("ROLE_ADMIN").ifPresent(authorities2::add);
            account2.setAuthorities(authorities2);

            accountService.save(account1);
            accountService.save(account2);

            Post p1 = new Post();
            p1.setTitle("Welcome to my blog! p1");
            p1.setAccount(account1);
            p1.setBody("This is my first blog post. I'm excited to share my thoughts and ideas with you.");



            Post p2 = new Post();
            p2.setTitle("My favorite programming language. p2");
            p2.setAccount(account1);
            p2.setBody("I love programming in Java. It's so versatile and powerful.");



            Post p3 = new Post();
            p3.setTitle("How to learn a new skill. p3");
            p3.setAccount(account1);
            p3.setBody("Learning a new skill takes time and practice. Don't be discouraged if you don't see progress at first.");


            Post p4 = new Post();
            p4.setTitle("My favorite book. p4");
            p4.setAccount(account2);
            p4.setBody("I just finished reading 'The Hitchhiker's Guide to the Galaxy' by Douglas Adams. It's hilarious!");


            Post p5 = new Post();
            p5.setTitle("Why I love coding. p5");
            p5.setAccount(account2);
            p5.setBody("Coding is like solving a puzzle. It's so satisfying when you finally figure it out.");

            postService.save(p1);
            postService.save(p2);
            postService.save(p3);
            postService.save(p4);
            postService.save(p5);
        }
    }
}
