package vn.edu.iuh.fit.www_doanhoaian_week05.backend.ids;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class Candidate_skillID implements Serializable {
    private Long candidate;
    private Long skill;
}