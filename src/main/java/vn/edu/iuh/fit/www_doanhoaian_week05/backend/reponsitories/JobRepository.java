package vn.edu.iuh.fit.www_doanhoaian_week05.backend.reponsitories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import vn.edu.iuh.fit.www_doanhoaian_week05.backend.models.Job;
import vn.edu.iuh.fit.www_doanhoaian_week05.backend.models.Skill;

import java.util.List;


public interface JobRepository extends JpaRepository<Job, Long> {

    @Query("SELECT js.skill FROM Job_skill js WHERE js.job.id = :jobId")
    List<Skill> findSkillsByJobId(@Param("jobId") Long jobId);
}