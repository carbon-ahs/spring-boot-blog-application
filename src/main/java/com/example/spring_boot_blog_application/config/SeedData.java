package com.example.spring_boot_blog_application.config;

import com.example.spring_boot_blog_application.models.Post;
import com.example.spring_boot_blog_application.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SeedData implements CommandLineRunner {
    @Autowired
    private PostService postService;

    @Override
    public void run(String... args) throws Exception {
        List<Post> posts = postService.getAll();

        if (posts.isEmpty()) {
//            Post p1 = new Post();
//            p1.setTitle("Title p 1");
//            p1.setBody("Body p1");

            Post p1 = new Post();
            p1.setTitle("Welcome to my blog! p1");
            p1.setBody("This is my first blog post. I'm excited to share my thoughts and ideas with you.");



            Post p2 = new Post();
            p2.setTitle("My favorite programming language. p2");
            p2.setBody("I love programming in Java. It's so versatile and powerful.");



            Post p3 = new Post();
            p3.setTitle("How to learn a new skill. p3");
            p3.setBody("Learning a new skill takes time and practice. Don't be discouraged if you don't see progress at first.");


            Post p4 = new Post();
            p4.setTitle("My favorite book. p4");
            p4.setBody("I just finished reading 'The Hitchhiker's Guide to the Galaxy' by Douglas Adams. It's hilarious!");


            Post p5 = new Post();
            p5.setTitle("Why I love coding. p5");
            p5.setBody("Coding is like solving a puzzle. It's so satisfying when you finally figure it out.");

            postService.save(p1);
            postService.save(p2);
            postService.save(p3);
            postService.save(p4);
            postService.save(p5);
        }
    }
}
