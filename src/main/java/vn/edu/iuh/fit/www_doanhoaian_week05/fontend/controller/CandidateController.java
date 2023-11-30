package vn.edu.iuh.fit.www_doanhoaian_week05.fontend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import vn.edu.iuh.fit.www_doanhoaian_week05.backend.models.Address;
import vn.edu.iuh.fit.www_doanhoaian_week05.backend.models.Candidate;
import vn.edu.iuh.fit.www_doanhoaian_week05.backend.models.Skill;
import vn.edu.iuh.fit.www_doanhoaian_week05.backend.services.AddressService;
import vn.edu.iuh.fit.www_doanhoaian_week05.backend.services.CandidateService;
import vn.edu.iuh.fit.www_doanhoaian_week05.backend.services.SkillService;


import java.util.List;
import java.util.Optional;

@Controller
public class CandidateController {

    @Autowired
    private CandidateService candidateServices;

    @Autowired
    private AddressService addressService;

    @Autowired
    private SkillService skillService;


    @GetMapping("/home")
    public String gethome(){
        return "home";
    }

    @GetMapping("/candidate_list")
    public String showCandidateList(Model model) {
        model.addAttribute("candidates", candidateServices.findAll());
        return "candidate/candidate_list";
    }

//    @GetMapping("/candidates")
//    public String showCandidateListPaging(Model model,
//                                          @RequestParam("page") Optional<Integer> page,
//                                          @RequestParam("size") Optional<Integer> size) {
//        int currentPage = page.orElse(1);
//        int pageSize = size.orElse(10);
//        Page<Candidate> candidatePage = candidateServices.findPaginated(PageRequest.of(currentPage - 1, pageSize));
//        model.addAttribute("candidatePage", candidatePage);
//        int totalPages = candidatePage.getTotalPages();
//        if (totalPages > 0) {
//            List<Integer> pageNumbers = IntStream.rangeClosed(1, totalPages).boxed()
//                    .collect(Collectors.toList());
//            model.addAttribute("pageNumbers", pageNumbers);
//        }
//        return "candidate/candidates-paging";
//    }

    @GetMapping("/add_candidate")
    public String applyCandidate(Model model) {
        model.addAttribute("candidate", new Candidate());
        return "candidate/add-candidate";
    }

    @PostMapping("/add_candidate")
    public String processApplyCandidate(@ModelAttribute Candidate candidate) {
        Address address = candidate.getAddress();
        addressService.addAddress(address);
        candidateServices.addCan(candidate);
        return  "redirect:/candidate_list";
    }

    @GetMapping("/{id}")
    public String getCandidateDetails(@PathVariable Long id, Model model) {
        Candidate candidate = candidateServices.findById(id).orElse(null);
        List<Skill> skills = candidateServices.findSkillsByCandidateID(id);
        model.addAttribute("candidate", candidate);
        model.addAttribute("skills",skills);
        return "candidate/candidate_details";
    }


    @GetMapping("/search")
    public String searchBySkill(Model model, @RequestParam Long skillId) {
        Optional<Skill> skill = skillService.getById(skillId);
        List<Candidate> candidates = candidateServices.findCandidatesBySkill(skillId);
        model.addAttribute("candidates", candidates);
        return "candidate/candidate_list";

    }

}
