package com.example.spring_boot_blog_application.controllers;

import com.example.spring_boot_blog_application.models.Account;
import com.example.spring_boot_blog_application.models.Post;
import com.example.spring_boot_blog_application.services.AccountService;
import com.example.spring_boot_blog_application.services.PostService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Optional;

@Slf4j
@Controller
public class PostController{
    @Autowired
    private PostService postService;
    @Autowired
    private AccountService accountService;


    @GetMapping("/posts/{id}")
    public String getPost(@PathVariable Long id, Model model) {
        Optional<Post> optionalPost = postService.getById(id);
        // if post exists shove it on the model! pookie!
        if (optionalPost.isPresent()) {
            Post post = optionalPost.get();
            // think context var in django. Just key value pairing happening here.
            // context
            model.addAttribute("post", post);
            return "post";
        }
        else  {
            return "404";
        }
    }

    @GetMapping("/posts/new")
    public String createNewPost(Model model){
        Optional<Account> optionalAccount = accountService.findByEmail("admin@domain.com");
        if (optionalAccount.isPresent()) {

            Post post = new Post();
            post.setAccount(optionalAccount.get());
            model.addAttribute("post", post);
            return "post_new";
        }
        else {
            return "404";
        }
    }

    @PostMapping("/posts/new")
    public String saveNewPost(@ModelAttribute Post post){
        postService.save(post);
        return "redirect:/posts/" + post.getId();
    }
}
