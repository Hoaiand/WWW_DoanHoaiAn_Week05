package vn.edu.iuh.fit.www_doanhoaian_week05.backend.reponsitories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import vn.edu.iuh.fit.www_doanhoaian_week05.backend.models.Candidate;
import vn.edu.iuh.fit.www_doanhoaian_week05.backend.models.Skill;

import java.util.List;


public interface CandidateRepository extends JpaRepository<Candidate, Long> {

    @Query("SELECT cs.candidate FROM Candidate_skill cs WHERE cs.skill = :skill")
    List<Candidate> findCandidatesBySkill(@Param("skill") Long skill);


    @Query("SELECT cs.skill FROM Candidate_skill cs WHERE cs.candidate.id = :candidateID")
    List<Skill> findSkillsByCandidateID(@Param("candidateID") Long candidateID);

}