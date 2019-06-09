package org.launchcode.stlparks.controllers;


import org.launchcode.stlparks.models.Park;
import org.launchcode.stlparks.models.data.ParkDao;
import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
@RequestMapping("admin")
public class AdminController {

    @Autowired
    private ParkDao parkDao;

    @RequestMapping(value="add", method = RequestMethod.GET)
    public String displayAddForm(Model model){

        model.addAttribute("title","Add New Park");
        model.addAttribute(new Park());

        return "admin/add";
    }

    @RequestMapping(value="add", method = RequestMethod.POST)
    public String processAddForm(@ModelAttribute Park newPark, Model model){


        //TODO error handing

        parkDao.save(newPark);
        return "redirect: view/" + newPark.getId();

    }

    @RequestMapping(value = "/view/{parkId}", method = RequestMethod.GET)
    public String viewPark(Model model, @PathVariable int parkId) {
        Park newPark = parkDao.findOne(parkId);
        model.addAttribute("park", newPark);
        model.addAttribute("title", "Add Successful!");


        return "admin/viewPark";
    }




}
