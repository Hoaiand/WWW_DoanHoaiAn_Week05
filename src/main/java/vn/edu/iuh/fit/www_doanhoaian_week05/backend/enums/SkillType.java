package vn.edu.iuh.fit.www_doanhoaian_week05.backend.enums;

public enum SkillType {
    Soft_Skills(0),

    Technical_Skills(1),

    Management_Skills(2),

    Analytical_Skills (3);

    private int value;

    SkillType(int value){
        this.value= value;
    }

    public int getValue() {
        return value;
    }
}
