package org.launchcode.stlparks.controllers;

import org.launchcode.stlparks.models.data.ParkDao;
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





}
