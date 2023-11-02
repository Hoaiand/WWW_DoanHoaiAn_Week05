package vn.edu.iuh.fit.www_doanhoaian_week05.fontend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import vn.edu.iuh.fit.www_doanhoaian_week05.backend.services.JobService;
import vn.edu.iuh.fit.www_doanhoaian_week05.backend.services.JobSkillService;

@Controller
public class JobControllers {
    @Autowired
    private JobService jobService;

    @Autowired
    private JobSkillService jobSkillService;


    @GetMapping("/job_list")
    public String showJob(Model model){
        model.addAttribute("jobs",jobService.findAll());
        return "Job/job_list";
    }
}
