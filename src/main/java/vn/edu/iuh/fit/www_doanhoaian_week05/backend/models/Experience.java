package vn.edu.iuh.fit.www_doanhoaian_week05.backend.models;

import jakarta.persistence.*;
import lombok.*;
import vn.edu.iuh.fit.www_doanhoaian_week05.backend.enums.Roles;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@ToString
@Table(name = "experience")
public class Experience {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "exp_id")
    private long id;
    @Column(name = "company",length = 120, nullable = false)
    private String company;

    @Column(name = "from_date", nullable = false)
    private Date from_date;

    @Column(name = "to_date", nullable = false)
    private Date to_date;

    @Column(name = "role",length = 100, nullable = false)
    @Enumerated(EnumType.ORDINAL)
    private Roles role;

    @Column(name = "word_desc",length = 400, nullable = false)
    private String word_desc;

    @ManyToOne
    @JoinColumn(name = "candidate_id")
    private Candidate candidate;


}
