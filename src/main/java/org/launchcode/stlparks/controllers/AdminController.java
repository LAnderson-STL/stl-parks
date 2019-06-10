package org.launchcode.stlparks.controllers;


import org.launchcode.stlparks.models.Amenity;
import org.launchcode.stlparks.models.Park;
import org.launchcode.stlparks.models.data.AmenityDao;
import org.launchcode.stlparks.models.data.ParkDao;
import org.launchcode.stlparks.models.forms.AddAmenityForm;
import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@RequestMapping("admin")
public class AdminController {

    @Autowired
    private ParkDao parkDao;

    @Autowired
    private AmenityDao amenityDao;


    @RequestMapping(value="addPark", method = RequestMethod.GET)
    public String displayAddPark(Model model){

        model.addAttribute("title","Add New Park");
        model.addAttribute(new Park());

        return "admin/addPark";
    }

    @RequestMapping(value="addPark", method = RequestMethod.POST)
    public String processAddPark(@ModelAttribute Park newPark, Model model){


        //TODO error handing

        parkDao.save(newPark);
        return "redirect:view/" + newPark.getId();

    }





    //@RequestMapping(value="/addParkAmenities/{parkId}", method = RequestMethod.GET)
    //public String displayAddParkAmenities(Model model){

        //Park newPark = new Park();
        //AddAmenityForm form = new AddAmenityForm(newPark, amenityDao.findAll());
        //model.addAttribute("title","Add New Park");
        //model.addAttribute("form", form);

        //model.addAttribute("amenities", amenityDao.findAll());


        //return "admin/addPark";
    //}

    //@RequestMapping(value="/addParkAmenities/{parkId}\"", method = RequestMethod.POST)
    //public String processAddParkAmenities(@ModelAttribute AddAmenityForm form, Park newPark, @RequestParam int[] amenityIds, Model model){

        //TODO error handing


        //for(int amenityId : amenityIds){
            //Amenity amenity = amenityDao.findOne(amenityId);

            //newPark.addAmenity(amenity);
        //}


       // parkDao.save(newPark);
        //return "redirect:view/" + newPark.getId();

    //}

    @RequestMapping(value = "/view/{parkId}", method = RequestMethod.GET)
    public String viewPark(Model model, @PathVariable int parkId) {
        Park newPark = parkDao.findOne(parkId);
        model.addAttribute("park", newPark);
        model.addAttribute("title", "Add Successful!");


        return "admin/viewPark";
    }

    @RequestMapping(value = "addAmenity", method = RequestMethod.GET)
    public String displayAddNewAmenity(Model model){
        model.addAttribute("title","Add New Amenity");
        model.addAttribute(new Amenity());

        return "admin/addAmenity";
    }

    @RequestMapping(value="addAmenity", method = RequestMethod.POST)
    public String processAddNewAmenity(@ModelAttribute Amenity newAmenity, Model model) {

        //TODO error handing


        amenityDao.save(newAmenity);
        return "redirect:addAmenity";
    }






}
