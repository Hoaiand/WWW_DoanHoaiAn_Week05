package vn.edu.iuh.fit.www_doanhoaian_week05.fontend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import vn.edu.iuh.fit.www_doanhoaian_week05.backend.models.Job;
import vn.edu.iuh.fit.www_doanhoaian_week05.backend.models.Job_skill;
import vn.edu.iuh.fit.www_doanhoaian_week05.backend.models.Skill;
import vn.edu.iuh.fit.www_doanhoaian_week05.backend.services.JobService;
import vn.edu.iuh.fit.www_doanhoaian_week05.backend.services.JobSkillService;
import vn.edu.iuh.fit.www_doanhoaian_week05.backend.services.SkillService;

@Controller
public class JobControllers {
    @Autowired
    private JobService jobService;

    @Autowired
    private JobSkillService jobSkillService;

    @Autowired
    private SkillService skillService;


    @GetMapping("/job_list")
    public String showJob(Model model){
        model.addAttribute("jobs",jobService.findAll());
        return "job/job_list";
    }



    @GetMapping("/add_job")
    public String addJob(Model model){
        model.addAttribute("job", new Job());
        return "job/add-job";
    }


    @PostMapping("/add_job")
    public String saveJob(@ModelAttribute Job job){
        // Lấy ra đối tượng Job_skill từ job
        Job_skill jobSkill = (Job_skill) job.getJobSkills();

        // Lấy ra đối tượng Skill từ jobSkill
        Skill skill = jobSkill.getSkill();

        // Lưu Job_skill và Skill vào cơ sở dữ liệu
        jobSkillService.saveJobSkill(jobSkill);
        skillService.saveSkill(skill);

        // Lưu Job vào cơ sở dữ liệu
        jobService.save(job);

        return "redirect:/job_list";
    }

}
