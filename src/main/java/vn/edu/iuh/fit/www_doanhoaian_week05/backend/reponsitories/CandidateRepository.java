package vn.edu.iuh.fit.www_doanhoaian_week05.backend.reponsitories;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.edu.iuh.fit.www_doanhoaian_week05.backend.models.Candidate;


public interface CandidateRepository extends JpaRepository<Candidate, Long> {

}