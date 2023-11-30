package vn.edu.iuh.fit.www_doanhoaian_week05.backend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.edu.iuh.fit.www_doanhoaian_week05.backend.models.Skill;
import vn.edu.iuh.fit.www_doanhoaian_week05.backend.reponsitories.SkillRepository;


import java.util.List;
import java.util.Optional;

@Service
public class SkillService {
    @Autowired
    private SkillRepository skillRepository;

    public List<Skill> findAll(){
        return skillRepository.findAll();
    }

    public Optional<Skill> getById(Long id){
        return skillRepository.findById(id);
    }

    public void saveSkill(Skill skill){
        skillRepository.save(skill);
    }

}
