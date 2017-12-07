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
import java.util.ArrayList;

/**
 *
 * @author johnstevens
 */
public class StudentFile
{
    // writes an array of students to a binary file to initialize database
    public static void writeStudents(ArrayList<Student> students)
    {
	ObjectOutputStream out;
	
	try
	{
	    out = new ObjectOutputStream(new FileOutputStream("students.dat"));
	    
	    for(int i = 0; i < students.size(); i++)
	    {
		out.writeObject(students.get(i));
	    }
	    out.close();
	}
	catch(IOException e)
	{
	    System.out.println(e.getMessage());
	}
    }
    
    // adds a single student to the binary file
    public static void addStudent(Student student)
    {
	ArrayList<Student> students = readAllStudents();
	
	students.add(student);
	writeStudents(students);
    }
    
    // scans the binary file for a student with a matching Id and returns it
    public static Student readStudentById(int studentId)
    {
	ObjectInputStream in;
	Student stu;
	
	try
	{
	    in = new ObjectInputStream(new FileInputStream("students.dat"));
	    
	    while(true)
	    {
		stu = (Student) in.readObject();
		if(stu.compareStudentId(studentId))
		{
		    return stu;
		}
	    }
	}
	catch(IOException | ClassNotFoundException e)
	{
	    System.out.println(e.getMessage());
	    return null;
	}
    }
    
    /*
    scans the binary file for students with a given teacher and returns a list
    of them
    */
    public static ArrayList<Student> readStudentsByTeacher(String teacher)
    {
	ArrayList<Student> students = new ArrayList<>();
	ObjectInputStream in;
	Student stu;
	
	try
	{
	    in = new ObjectInputStream(new FileInputStream("students.dat"));
	    while(true)
	    {
		stu = (Student) in.readObject();
		if(stu.compareTeacher(teacher))
		    students.add(stu);
	    }
	}
	catch(EOFException eof)
	{
	    return students;
	}
	catch(IOException | ClassNotFoundException e)
	{
	    System.out.println(e.getMessage());
	    return null;
	}
    }
    
    // reads all the students stored in the binary file to an array list
    public static ArrayList<Student> readAllStudents()
    {
	ArrayList<Student> students = new ArrayList<>();
	ObjectInputStream in;
	
	try
	{
	    in = new ObjectInputStream(new FileInputStream("students.dat"));
	    while(true)
	    {
		students.add((Student) in.readObject());
	    }
	}
	catch(EOFException eof)
	{
	    return students;
	}
	catch(IOException | ClassNotFoundException e)
	{
	    System.out.println(e.getMessage());
	    return null;
	}
    }
    
    // deletes the student with a given Id from the binary file 
    public static void deleteStudent(int studentId)
    {
	ArrayList<Student> students = readAllStudents();
	
	for(int i = 0; i < students.size(); i++)
	{
	    if(students.get(i).getStudentId() == studentId)
	    {
		students.remove(i);
		break;
	    }
	}
	
	writeStudents(students);
    }
}
