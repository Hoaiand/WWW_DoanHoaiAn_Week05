package vn.edu.iuh.fit.www_doanhoaian_week05.fontend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import vn.edu.iuh.fit.www_doanhoaian_week05.backend.enums.SkillLevel;
import vn.edu.iuh.fit.www_doanhoaian_week05.backend.models.Job;
import vn.edu.iuh.fit.www_doanhoaian_week05.backend.models.Job_skill;
import vn.edu.iuh.fit.www_doanhoaian_week05.backend.services.JobService;
import vn.edu.iuh.fit.www_doanhoaian_week05.backend.services.JobSkillService;

@Controller
public class JobSkillControllers {
    @Autowired
    private JobSkillService jobSkillService;


    @Autowired
    private JobService jobService;


    @GetMapping("/job_details")
    public String showjobSkill(Model model) {
        model.addAttribute("jobSkills", jobSkillService.findAll());
        return "job/job-details";
    }

    @GetMapping("/add_jobSkill")
    public String addJobSkill(Model model) {
        model.addAttribute("jobSkill", new Job_skill());
        model.addAttribute("skill_level",SkillLevel.values());
        return "jobSkill/add_jobSkill";
    }

    @PostMapping("/add_jobSkill")
    public String saveJobSkill(@ModelAttribute Job_skill jobSkill) {
        Job job = jobSkill.getJob();
        jobService.save(job);

        jobSkillService.saveJobSkill(jobSkill);

        return "redirect:/job_details";
    }


}
