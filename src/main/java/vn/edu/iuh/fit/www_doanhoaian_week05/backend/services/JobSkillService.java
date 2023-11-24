package vn.edu.iuh.fit.www_doanhoaian_week05.backend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.edu.iuh.fit.www_doanhoaian_week05.backend.ids.Job_skillID;
import vn.edu.iuh.fit.www_doanhoaian_week05.backend.models.Job;
import vn.edu.iuh.fit.www_doanhoaian_week05.backend.models.Job_skill;
import vn.edu.iuh.fit.www_doanhoaian_week05.backend.reponsitories.Job_skillRepository;


import java.util.List;
import java.util.Optional;

@Service
public class JobSkillService {
    @Autowired
    private Job_skillRepository jobSkillRepository;

    public void insertJobSkill(Job_skill jobSkill){
        jobSkillRepository.save(jobSkill);
    }

    public List<Job_skill> findAll(){
        return jobSkillRepository.findAll();
    }


    public void saveJobSkill(Job_skill jobSkill){
        jobSkillRepository.save(jobSkill);
    }

    public Optional<Job_skill> findById(Job_skillID id){
        return jobSkillRepository.findById(id);
    }
}
