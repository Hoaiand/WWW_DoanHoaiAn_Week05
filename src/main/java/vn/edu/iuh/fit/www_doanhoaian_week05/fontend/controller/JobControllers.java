package vn.edu.iuh.fit.www_doanhoaian_week05.fontend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import vn.edu.iuh.fit.www_doanhoaian_week05.backend.enums.SkillLevel;
import vn.edu.iuh.fit.www_doanhoaian_week05.backend.enums.SkillType;
import vn.edu.iuh.fit.www_doanhoaian_week05.backend.models.Company;
import vn.edu.iuh.fit.www_doanhoaian_week05.backend.models.Job;
import vn.edu.iuh.fit.www_doanhoaian_week05.backend.models.Job_skill;
import vn.edu.iuh.fit.www_doanhoaian_week05.backend.models.Skill;
import vn.edu.iuh.fit.www_doanhoaian_week05.backend.services.CompanyServices;
import vn.edu.iuh.fit.www_doanhoaian_week05.backend.services.JobService;
import vn.edu.iuh.fit.www_doanhoaian_week05.backend.services.JobSkillService;
import vn.edu.iuh.fit.www_doanhoaian_week05.backend.services.SkillService;

import java.util.Arrays;
import java.util.List;

@Controller
public class JobControllers {
    @Autowired
    private JobService jobService;

    @Autowired
    private JobSkillService jobSkillService;

    @Autowired
    private SkillService skillService;

    @Autowired
    private CompanyServices companyServices;


    @GetMapping("/job_list")
    public String showJob(Model model) {
        model.addAttribute("jobs", jobService.findAll());
        return "job/job_list";
    }


    @GetMapping("/add_job")
    public String addJob(Model model) {
        model.addAttribute("job", new Job());

        return "job/add-job";
    }




    @PostMapping("/add_job")
    public String saveJob(@ModelAttribute Job job) {

        jobService.save(job);

        return "redirect:/job_list";
    }



    @GetMapping("/job_list/{id}")
    public String getJobdetails(@PathVariable Long id,Model model){
       Job job = jobService.findById(id).orElse(null);
        model.addAttribute("job",job);
       return "job/job-details";
    }


}
