/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package student_win22_tue_pm;

/*
Date : 25 January, 2022
Author : Nupur Patel 
Comment : This is just a comment
*/

public class Student {
    private String studentId;    
    private String studentName;
    private String address;
    
    public Student(String studentId, String studentName){
        this.studentId = studentId;
        this.studentName = studentName;             
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    
    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    
}
