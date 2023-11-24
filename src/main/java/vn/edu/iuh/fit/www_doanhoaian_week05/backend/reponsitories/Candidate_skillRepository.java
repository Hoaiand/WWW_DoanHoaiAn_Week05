package vn.edu.iuh.fit.www_doanhoaian_week05.backend.reponsitories;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.edu.iuh.fit.www_doanhoaian_week05.backend.ids.Candidate_skillID;
import vn.edu.iuh.fit.www_doanhoaian_week05.backend.models.Candidate;
import vn.edu.iuh.fit.www_doanhoaian_week05.backend.models.Candidate_skill;


public interface Candidate_skillRepository extends JpaRepository<Candidate_skill, Candidate_skillID> {
}