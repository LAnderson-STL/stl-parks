package org.launchcode.stlparks.controllers;

import org.launchcode.stlparks.models.data.AmenityDao;
import org.launchcode.stlparks.models.data.ParkDao;
import org.launchcode.stlparks.models.Amenity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("")
public class ParkController {

    @Autowired
    private ParkDao parkDao;

    @Autowired
    private AmenityDao amenityDao;

    @RequestMapping (value="", method = RequestMethod.GET)
    public String index(Model model){

        model.addAttribute("amenities", amenityDao.findAll());

        return "park/index";
    }

    @RequestMapping (value="showParks", method=RequestMethod.GET)
    public String showParks(Model model){

        model.addAttribute("parks", parkDao.findAll());

        return "park/showParks";
    }



}
