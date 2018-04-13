/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springdemo;

/**
 *
 * @author Eugene Tan
 */
public class Student {
    private String studentName;
    private int studentID;
    private Address address;

    public Student() {
    }
    
    public Student(String studentName, int studentID) {
        this.studentName = studentName;
        this.studentID = studentID;
    }
    
    public Student(String studentName, int studentID, Address address) {
        this.studentName = studentName;
        this.studentID = studentID;
        this.address = address;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
    
    public void myInit(){
        System.out.println("Object init!");
    }
    
    public void myDestroy(){
        System.out.println("Object destroy!");
    }
    
}
