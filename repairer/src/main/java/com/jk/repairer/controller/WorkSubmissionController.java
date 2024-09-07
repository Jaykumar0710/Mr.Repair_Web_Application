package com.jk.repairer.controller;

import com.jk.repairer.model.WorkSubmission;
import com.jk.repairer.service.WorkSubmissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class WorkSubmissionController {
    @Autowired
    private WorkSubmissionService workSubmissionService;

    @PostMapping("/submitWork")
    public String submitWork(
            @RequestParam("name") String name,
            @RequestParam("mobile")String mobile,
            @RequestParam("email") String email,
            @RequestParam("location") String location,
            @RequestParam("workcategory") String workcategory,
            @RequestParam("worktodo") String worktodo,
            @RequestParam("budget") Double budget,
            RedirectAttributes redirectAttributes){
        WorkSubmission workSubmission = new WorkSubmission();
        workSubmission.setName(name);
        workSubmission.setMobile(mobile);
        workSubmission.setEmail(email);
        workSubmission.setLocation(location);
        workSubmission.setWorkcategory(workcategory);
        workSubmission.setWorktodo(worktodo);
        workSubmission.setBudget(budget);

        try {
            // Save the work submission data to the database
            workSubmissionService.saveWorkSubmission(workSubmission);
            redirectAttributes.addFlashAttribute("message", "Work submitted successfully!");
        } catch (Exception e) {
            e.printStackTrace();
            redirectAttributes.addFlashAttribute("message", "Failed to submit Work. Please try again.");
            return "redirect:/work";
        }

        return "redirect:/work";


    }
}
