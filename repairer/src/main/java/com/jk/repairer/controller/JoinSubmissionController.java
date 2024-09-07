package com.jk.repairer.controller;

import com.jk.repairer.model.JoinSubmission;
import com.jk.repairer.service.JoinSubmissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class JoinSubmissionController {
    @Autowired
    private JoinSubmissionService joinSubmissionService;

    @PostMapping("/joinus")
    public String joinus(
            @RequestParam("name") String name,
            @RequestParam("mobile") String mobile,
            @RequestParam("email") String email,
            @RequestParam("location") String location,
            @RequestParam("profession") String profession,
            @RequestParam("experience") Double experience,
            @RequestParam("image") String image,
            @RequestParam("serviceType") String serviceType,
            @RequestParam("description") String description,
            RedirectAttributes redirectAttributes) {

        JoinSubmission joinSubmission = new JoinSubmission();
        joinSubmission.setName(name);
        joinSubmission.setMobile(mobile);
        joinSubmission.setEmail(email);
        joinSubmission.setLocation(location);
        joinSubmission.setProfession(profession);
        joinSubmission.setExperience(experience);
        joinSubmission.setImage(image);
        joinSubmission.setServiceType(serviceType);
        joinSubmission.setDescription(description);

        try {
            joinSubmissionService.saveJoinSubmission(joinSubmission);
            redirectAttributes.addFlashAttribute("message", "Join Registration Successfully");
        } catch (Exception e) {
            e.printStackTrace();
            redirectAttributes.addFlashAttribute("message", "Failed to Join With Us. Please try again.");
            return "redirect:/joinus";
        }
        return "redirect:/joinus";
    }
}
