package vn.edu.iuh.fit.www_doanhoaian_week05.backend.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "candidate")
public class Candidate {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "candidate_id")
        private long id;

        @Column(name = "email", nullable = false)
        private String email;

        @Column(name = "full_name", nullable = false)
        private String full_name;

        @Column(name = "phone", length = 15, nullable = false)
        private String phone;

        @OneToMany(mappedBy = "candidate")
        private List<Experience> experiences;




}
