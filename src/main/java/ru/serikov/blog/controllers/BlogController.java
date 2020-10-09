package ru.serikov.blog.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.serikov.blog.models.Post;
import ru.serikov.blog.repo.PostRepository;

@Controller
public class BlogController {

    @Autowired
    private PostRepository postRepository;



    @GetMapping("/blog")
    public String blogMain(Model model){
        Iterable<Post> posts = postRepository.findAll();
        model.addAttribute("posts", posts);
        return "blog-main";
    }

}
