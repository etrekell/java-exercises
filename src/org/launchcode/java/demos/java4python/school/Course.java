package org.launchcode.java.demos.java4python.school;

import java.util.List;

public class Course {
    private String courseName;
    private String professor;
    private String location;
    private int credits;
    private List<Student> classRoster;

    public Course(String courseName, String professor, String location, int credits, List<Student> classRoster) {
        this.courseName = courseName;
        this.professor = professor;
        this.location = location;
        this.credits = credits;
        this.classRoster = classRoster;
    }


    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public List<Student> getClassRoster() {
        return classRoster;
    }

    public void setClassRoster(List<Student> classRoster) {
        this.classRoster = classRoster;
    }

    public void addStudentToRoster(Student student){
        this.classRoster.add(student);
    }
}


