package com.example.spring_boot_blog_application.controllers;

import com.example.spring_boot_blog_application.models.Post;
import com.example.spring_boot_blog_application.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

@Controller
public class PostController{
    @Autowired
    private PostService postService;

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
}
