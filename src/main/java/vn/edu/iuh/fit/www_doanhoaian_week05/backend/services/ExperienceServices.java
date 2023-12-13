package vn.edu.iuh.fit.www_doanhoaian_week05.backend.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.edu.iuh.fit.www_doanhoaian_week05.backend.models.Experience;
import vn.edu.iuh.fit.www_doanhoaian_week05.backend.reponsitories.ExperienceRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ExperienceServices {

    @Autowired
    private ExperienceRepository experienceRepository;


    public List<Experience> findAll(){
        return experienceRepository.findAll();
    }



    public Optional<Experience> findById(long id){
        return experienceRepository.findById(id);
    }



    public void save(Experience experience){
        experienceRepository.save(experience);
    }



    public void delete(long id){
        experienceRepository.deleteById(id);
    }
}
