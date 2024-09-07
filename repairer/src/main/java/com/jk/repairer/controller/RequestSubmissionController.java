package com.jk.repairer.controller;

import com.jk.repairer.model.RequestSubmission;
import com.jk.repairer.service.RequestSubmissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class RequestSubmissionController {
    @Autowired
    private RequestSubmissionService requestSubmissionService;

    @PostMapping("/reqcallvisit")
    public String reqcallvisit(
            @RequestParam("name") String name,
            @RequestParam("email") String email,
            @RequestParam("phone") String phone,
            @RequestParam("service") String service,
            @RequestParam("message") String message,
            RedirectAttributes redirectAttributes) {

        RequestSubmission requestSubmission = new RequestSubmission();
        requestSubmission.setName(name);
        requestSubmission.setEmail(email);
        requestSubmission.setPhone(phone);
        requestSubmission.setService(service);
        requestSubmission.setMessage(message);

        try {
            requestSubmissionService.saveRequestSubmission(requestSubmission); // Using service to save
            redirectAttributes.addFlashAttribute("message", "Request Successfully Submitted");
        } catch (Exception e) {
            e.printStackTrace();
            redirectAttributes.addFlashAttribute("message", "Failed to submit request. Please try again.");
            return "redirect:/reqcallvisit"; // Redirect to the same page on failure
        }

        return "redirect:/reqcallvisit"; // Redirect to the same page on success
    }
}
