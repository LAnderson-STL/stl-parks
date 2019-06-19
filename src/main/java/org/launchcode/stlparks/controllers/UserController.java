package org.launchcode.stlparks.controllers;

import org.launchcode.stlparks.models.User;
import org.launchcode.stlparks.models.data.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.validation.Errors;

@Controller
@RequestMapping("user")

public class UserController {

    @Autowired
    private UserDao userDao;

    @RequestMapping(value = "add", method = RequestMethod.GET)
    public String addUser(Model model) {

        model.addAttribute("title", "New User Registration");
        model.addAttribute(new User());

    return "user/add-user";
    }

    @RequestMapping



}
