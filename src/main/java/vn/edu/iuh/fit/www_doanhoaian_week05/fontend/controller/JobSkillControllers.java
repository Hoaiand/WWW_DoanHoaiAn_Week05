package vn.edu.iuh.fit.www_doanhoaian_week05.fontend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import vn.edu.iuh.fit.www_doanhoaian_week05.backend.enums.SkillLevel;
import vn.edu.iuh.fit.www_doanhoaian_week05.backend.ids.Job_skillID;
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




    @GetMapping("/list-jobskill")
    public String showjobskill(Model model){
        model.addAttribute("list", jobSkillService.findAll());
        return "jobSkill/list";
    }


    @GetMapping("/add-jobskill")
    public String addJobSkill(Model model){
        model.addAttribute("js", new Job_skill());
        return "jobSkill/add";
    }



    @PostMapping("/add-jobskill")
    public String savejobskill(@ModelAttribute Job_skill jobSkill, @RequestParam("skill_level") String level, @PathVariable Job_skillID id ) {
        jobSkillService.findById(id);
        jobSkill.setSkill_level(SkillLevel.valueOf(level));
        jobSkillService.saveJobSkill(jobSkill);
        return "redirect:/list-jobskill";
    }






}