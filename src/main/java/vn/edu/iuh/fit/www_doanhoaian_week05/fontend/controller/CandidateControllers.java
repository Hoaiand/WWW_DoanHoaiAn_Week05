package vn.edu.iuh.fit.www_doanhoaian_week05.fontend.controller;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import vn.edu.iuh.fit.www_doanhoaian_week05.backend.enums.Roles;
import vn.edu.iuh.fit.www_doanhoaian_week05.backend.models.Candidate;
import vn.edu.iuh.fit.www_doanhoaian_week05.backend.services.CandidateService;

import java.util.List;

@Controller
public class CandidateControllers {
    @Autowired
    private CandidateService candidateService;

@GetMapping("/")
public String getHome(){
    return "index";
}
    @GetMapping("/list")
    public String showListCandidate(Model model){
        model.addAttribute("candidate", candidateService.findAll());
        return "home";
    }


    @GetMapping("/moreinfor/{id}")
    public String showdetailCandidate(Model model,@PathVariable Long id){
        model.addAttribute("candidate",candidateService.findById(id).orElse(null));
        return "detailCandidate";
    }


    @GetMapping("/candidates")
    public String getCandidates(Model model) {

        List<Candidate> candidates = candidateService.findCandidatesWithOver5YearsExp();

        model.addAttribute("candidates", candidates);

        return "report2";
    }


    @GetMapping("/search")
    public String getByExperienceRole(Model model, @RequestParam("role") Roles role) {

        List<Candidate> candidates = candidateService.findByExperienceRole(role);

        model.addAttribute("candidates", candidates);

        return "report1";
    }

}

//    public String showFormInsert(Model model){
//
//    }
//}
