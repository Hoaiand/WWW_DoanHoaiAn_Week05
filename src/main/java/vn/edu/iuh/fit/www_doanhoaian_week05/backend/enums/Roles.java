package vn.edu.iuh.fit.www_doanhoaian_week05.backend.enums;

public enum Roles {
    ADMINSTRANTION(1),
    STAFF(2),
    MANAGER(3),
    EXECUTUVE(4);

    private  int value;

    Roles(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
