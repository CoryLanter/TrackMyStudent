

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.Serializable;

/**
 *
 * @author johnstevens
 */
public class Student implements Serializable
{
    private String name; // student's name
    private int studentId; // 5 digit id to identify student
    private String teacher; // the students teacher
    private String allergies; // list of student's allergies seperated by commas
    private String medications; // list of student's medications seperated by commas
    private String address; // student's address
    private String avgGrade; // average letter grade from major subjects
    private String block; // student's lunch block
    private int absences; //Number of student's absences per school year

    public Student(String name, int studentId, String teacher, String allergies, String medications, String address, String avgGrades, String block, int absences)
    {
	this.name = name;
	this.studentId = studentId;
	this.teacher = teacher;
	this.allergies = allergies;
	this.medications = medications;
	this.address = address;
	this.avgGrade = avgGrades;
	this.block = block;
        this.absences = absences;
    }
    
    public String getName()
    {
	return name;
    }

    public void setName(String name)
    {
	this.name = name;
    }

    public int getStudentId()
    {
	return studentId;
    }

    public void setStudentId(int studentId)
    {
	this.studentId = studentId;
    }

    public String getTeacher()
    {
	return teacher;
    }

    public void setTeacher(String teacher)
    {
	this.teacher = teacher;
    }

    public String getAllergies()
    {
	return allergies;
    }

    public void setAllergies(String allergies)
    {
	this.allergies = allergies;
    }

    public String getMedications()
    {
	return medications;
    }

    public void setMedications(String medications)
    {
	this.medications = medications;
    }

    public String getAddress()
    {
	return address;
    }

    public void setAddress(String address)
    {
	this.address = address;
    }

    public String getAvgGrade()
    {
	return avgGrade;
    }

    public void setAvgGrade(String avgGrade)
    {
	this.avgGrade = avgGrade;
    }

    public String getBlock()
    {
	return block;
    }

    public void setBlock(String block)
    {
	this.block = block;
    }
    
    public int getAbsences()
    {
        return absences;
    }

    public void setAbsences(int absences)
    {
        this.absences = absences;
    }
    
    // returns true if student matches entered id
    public boolean compareStudentId(int studentId)
    {
	return this.getStudentId() == studentId;
    }
    
    // returns true if student is taught by entered teacher
    public boolean compareTeacher(String teacher)
    {
	return this.teacher.equals(teacher);
    }
    
    public String toString()
    {
	return "Name: " + this.getName() + ". Student Id: " + this.getStudentId() + ". Grade: " + this.getAvgGrade() + ".";
    }
}
