package main;

public class Student extends Person{

    private int rollNumber;
    private int studentId;

    private String insituteName;


    public String getInsituteName(){
        return insituteName;
    }
    public void setInsituteName(String insituteName){
        this.insituteName = insituteName;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
}
