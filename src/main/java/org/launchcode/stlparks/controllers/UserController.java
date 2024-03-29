package org.launchcode.stlparks.controllers;

import org.launchcode.stlparks.models.User;
import org.launchcode.stlparks.models.data.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.validation.Errors;

@Controller
@RequestMapping("user")

public class UserController {

    @Autowired
    private UserDao userDao;

    @RequestMapping(value = "add", method = RequestMethod.GET)
    public String displayAddUser(Model model) {

        model.addAttribute("title", "New User Registration");
        model.addAttribute(new User());

    return "user/add-user";
    }

    @RequestMapping(value = "add", method = RequestMethod.POST)
    public String processAddUser(Model model, @RequestParam String userName, String password, String verifyPassword) {
        //TODO: error handling

        User newUser = new User(userName, password);

        userDao.save(newUser);

        return "redirect:/" + newUser.getId();
    }

    @RequestMapping(value = "/{userId}", method = RequestMethod.GET)
    public String displayProfilePage(Model model, @PathVariable int userId){

        User user = userDao.findOne(userId);
        model.addAttribute("title", "My Park Page");
        model.addAttribute("user", user);

        return "user/profile-page";
    }



}
