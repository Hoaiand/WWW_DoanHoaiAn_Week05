package vn.edu.iuh.fit.www_doanhoaian_week05.fontend.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import vn.edu.iuh.fit.www_doanhoaian_week05.backend.enums.SkillType;
import vn.edu.iuh.fit.www_doanhoaian_week05.backend.models.Skill;
import vn.edu.iuh.fit.www_doanhoaian_week05.backend.services.SkillService;

@Controller
public class SkillControllers {
    @Autowired
    private SkillService skillService;


    @GetMapping("/list-skill")
    public String showAllSkill(Model model){
        model.addAttribute("skill", skillService.findAll());
        return "skill/skill-list";
    }

    @GetMapping("/add-skill")
    public String addSkill(Model model){
        model.addAttribute("skill", new Skill());
//        model.addAttribute("type", SkillType.values());
        return "skill/add";
    }


    @PostMapping("add-skill")
    public String saveSkill(@ModelAttribute Skill skill, @RequestParam String type){
        skill.setType(SkillType.valueOf(type));
        skillService.saveSkill(skill);
        return "redirect:/list-skill";
    }

}
