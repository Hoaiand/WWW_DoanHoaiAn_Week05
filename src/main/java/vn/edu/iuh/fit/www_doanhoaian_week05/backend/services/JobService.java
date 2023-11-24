package vn.edu.iuh.fit.www_doanhoaian_week05.backend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import vn.edu.iuh.fit.www_doanhoaian_week05.backend.models.Company;
import vn.edu.iuh.fit.www_doanhoaian_week05.backend.models.Job;
import vn.edu.iuh.fit.www_doanhoaian_week05.backend.reponsitories.JobRepository;

import java.util.List;
import java.util.Optional;

@Service
public class JobService {
    @Autowired
    private JobRepository jobRepository;

    @Autowired
    private CompanyServices companyService;

    public List<Job> findAll() {
        return jobRepository.findAll();
    }

    public void save(Job job) {
        jobRepository.save(job);
    }

    public Optional<Job> findById(long id) {
        return jobRepository.findById(id);
    }

}
