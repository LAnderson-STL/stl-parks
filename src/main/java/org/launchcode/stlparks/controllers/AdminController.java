package org.launchcode.stlparks.controllers;


import org.launchcode.stlparks.models.Park;
import org.launchcode.stlparks.models.data.ParkDao;
import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
@RequestMapping("admin")
public class AdminController {

    @Autowired
    private ParkDao parkDao;

    @RequestMapping(value="", method = RequestMethod.GET)
    public String displayAddForm(Model model){

        model.addAttribute("title","Add New Park");
        model.addAttribute(new Park());

        return "admin/index";
    }

    @RequestMapping(value="", method = RequestMethod.POST)
    public String processAddForm(@ModelAttribute Park newPark, Model model){


        //TODO error handing

        parkDao.save(newPark);
        return "redirect:";



    }




}
