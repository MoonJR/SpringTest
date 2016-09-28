package com.jongrakko.controller;

import com.jongrakko.model.Post;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by MoonJR on 2016. 9. 24..
 */
@RestController
public class StudyController {

    @RequestMapping(value = "/signup", method = RequestMethod.GET)
    public Post signupUser(Post post) {
        return post;
    }

}
