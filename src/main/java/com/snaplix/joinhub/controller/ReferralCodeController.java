package com.snaplix.joinhub.controller;

import com.snaplix.joinhub.model.ReferralCodeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ReferralCodeController {

    @Autowired
    ReferralCodeService refCodeService;

    @GetMapping("/cod")
    public String listAllCodesView(Model model){
        model.addAttribute("codigos", refCodeService.getAll());

        return "cod";
    }

}