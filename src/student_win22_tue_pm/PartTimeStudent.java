/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package student_win22_tue_pm;

/**
 *
 * @author NUPUR
 */
public class PartTimeStudent extends Student {
 
    private int numCourses;
    
    public PartTimeStudent(String studentID, String studentName, int numCourse) {
        super(studentID,studentName);
        this.numCourses = numCourse;

    }

    public int getNumCourses() {
        return numCourses;
    }

    public void setNumCourses(int numCourses) {
        this.numCourses = numCourses;
    }
    
    
}
