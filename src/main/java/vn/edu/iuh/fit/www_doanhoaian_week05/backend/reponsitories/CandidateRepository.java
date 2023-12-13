package vn.edu.iuh.fit.www_doanhoaian_week05.backend.reponsitories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.RequestParam;
import vn.edu.iuh.fit.www_doanhoaian_week05.backend.enums.Roles;
import vn.edu.iuh.fit.www_doanhoaian_week05.backend.models.Candidate;

import java.util.List;


public interface CandidateRepository extends JpaRepository<Candidate, Long> {


    @Query("SELECT c FROM Candidate c JOIN c.experiences e WHERE e.role = :role")
    List<Candidate> findByExperienceRole(  @RequestParam(required = false) Roles role);



    @Query("SELECT c FROM Candidate c JOIN c.experiences e " +
            "WHERE e.to_date > ADD_MONTHS(e.from_date, 60)")
    List<Candidate> findCandidatesWithOver5YearsExp();
}