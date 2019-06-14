package org.launchcode.stlparks.controllers;


import org.hibernate.boot.jaxb.hbm.spi.JaxbHbmNamedNativeQueryType;
import org.launchcode.stlparks.models.Amenity;
import org.launchcode.stlparks.models.Park;
import org.launchcode.stlparks.models.data.AmenityDao;
import org.launchcode.stlparks.models.data.ParkDao;
import org.launchcode.stlparks.models.forms.AddParkAmenitiesForm;
import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@Controller
@RequestMapping("admin")
public class AdminController {

    @Autowired
    private ParkDao parkDao;

    @Autowired
    private AmenityDao amenityDao;


    @RequestMapping(value="", method = RequestMethod.GET)
    public String index(Model model){

        model.addAttribute("title", "Admin Home");
        model.addAttribute("parks", parkDao.findAll());

        return "admin/index";
    }

    @RequestMapping(value="addPark", method = RequestMethod.GET)
    public String displayAddPark(Model model){

        model.addAttribute("title","Add New Park");
        model.addAttribute(new Park());

        return "admin/addPark";
    }

    @RequestMapping(value="addPark", method = RequestMethod.POST)
    public String processAddPark(@ModelAttribute Park newPark, Errors errors, Model model){


        if (errors.hasErrors()) {
            model.addAttribute("title", "Add New Park");
            return "admin/addPark";
        }

        //TODO: error handling

        parkDao.save(newPark);
        return "redirect:view/" + newPark.getId();

    }




    @RequestMapping(value = "view/{parkId}", method = RequestMethod.GET)
    public String viewPark(Model model, @PathVariable int parkId) {
        Park newPark = parkDao.findOne(parkId);
        model.addAttribute("park", newPark);
        model.addAttribute("title", "Add Successful!");



        return "admin/viewPark";
    }

    @RequestMapping(value = "addAmenity", method = RequestMethod.GET)
    public String displayAddAmenity(Model model){
        model.addAttribute("title","Add New Amenity");
        model.addAttribute(new Amenity());

        return "admin/addAmenity";
    }

    @RequestMapping(value="addAmenity", method = RequestMethod.POST)
    public String processAddAmenity(@ModelAttribute Amenity newAmenity, Errors errors, Model model) {


        if (errors.hasErrors()) {
            model.addAttribute("title", "Add Amenity");
            return "admin/addAmenity";
        }

        amenityDao.save(newAmenity);
        return "redirect:addAmenity";
    }



    @RequestMapping(value="/addParkAmenities/{parkId}", method = RequestMethod.GET)
    public String displayAddParkAmenities(Model model, @PathVariable int parkId){

        Park park = parkDao.findOne(parkId);
        AddParkAmenitiesForm form = new AddParkAmenitiesForm(park, amenityDao.findAll());
        model.addAttribute("title","Add Amenities for Park " + park.getName());
        model.addAttribute("form", form);

        return "admin/addParkAmenities";
    }

    @RequestMapping(value = "addParkAmenities", method = RequestMethod.POST)
    public String processAddItem(@ModelAttribute AddParkAmenitiesForm form, Model model) {


        Park park = parkDao.findOne(form.getParkId());
        Amenity amenity = amenityDao.findOne(form.getAmenityId());
        park.addAmenity(amenity);
        parkDao.save(park);

        return "redirect:view/" + park.getId();

    }






}
