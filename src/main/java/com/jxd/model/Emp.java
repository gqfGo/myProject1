package com.jxd.model;

/**
 * @author ZhouYufei
 * @description Todo
 * @date 2021-03-09 14:57
 */
public class Emp {
    private Integer empno;
    private String ename;
    private String sex;
    private String hiredate;

    public Integer getEmpno() {
        return empno;
    }

    public void setEmpno(Integer empno) {
        this.empno = empno;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getHiredate() {
        return hiredate;
    }

    public void setHiredate(String hiredate) {
        this.hiredate = hiredate;
    }

    public Emp() {
    }

    public Emp(String ename, String sex, String hiredate) {
        this.ename = ename;
        this.sex = sex;
        this.hiredate = hiredate;
    }

    public Emp(Integer empno, String ename, String sex, String hiredate) {
        this.empno = empno;
        this.ename = ename;
        this.sex = sex;
        this.hiredate = hiredate;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "empno=" + empno +
                ", ename='" + ename + '\'' +
                ", sex='" + sex + '\'' +
                ", hiredate='" + hiredate + '\'' +
                '}';
    }
}
