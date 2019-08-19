package org.launchcode.java.demos.java4python.school;

public class Student {

    private static int nextStudentId = 1;
    private String name;
    private final int studentId;
    private int numberOfCredits;
    private double gpa;

    public Student(String name, int studentId,
                   int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public Student(String name, int studentId) {
        this(name, studentId, 0, 0);
    }

    public Student(String name) {
        this(name, nextStudentId);
        nextStudentId++;
    }

    public void addGrade(int courseCredits, double grade) {
        // Update the appropriate fields: numberOfCredits, gpa
        // TODO - Fix this calculation
        this.numberOfCredits += courseCredits;
        this.gpa += (grade / courseCredits);

    }

    public String getGradeLevel() {

        if (this.numberOfCredits > 63){
            return "Senior";
        }else if (this.numberOfCredits > 42) {
            return "Junior";
        }else if (this.numberOfCredits > 21){
            return "Sophomore";
        }else
            return "Freshman";
    }

    public static int getNextStudentId() {
        return nextStudentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentId() {
        return studentId;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    public void setNumberOfCredits(int numberOfCredits) {
        this.numberOfCredits = numberOfCredits;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
}