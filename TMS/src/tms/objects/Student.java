package tms.objects;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

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
    private char avgGrade; // average letter grade from major subjects
    private char block; // student's lunch block

    public Student(String name, int studentId, String teacher, String allergies, String medications, String address, char avgGrades, char block)
    {
	this.name = name;
	this.studentId = studentId;
	this.teacher = teacher;
	this.allergies = allergies;
	this.medications = medications;
	this.address = address;
	this.avgGrade = avgGrades;
	this.block = block;
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

    public char getavgGrade()
    {
	return avgGrade;
    }

    public void setAvgGrade(char avgGrade)
    {
	this.avgGrade = avgGrade;
    }

    public char getBlock()
    {
	return block;
    }

    public void setBlock(char block)
    {
	this.block = block;
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
}