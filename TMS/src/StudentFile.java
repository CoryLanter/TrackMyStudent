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
    public static void writeStudents(Student[] students)
    {
	ObjectOutputStream out;
	
	try
	{
	    out = new ObjectOutputStream(new FileOutputStream("students.dat"));
	    
	    for(int i = 0; i < students.length; i++)
	    {
		out.writeObject(students[i]);
	    }
	    out.close();
	}
	catch(IOException e)
	{
	    System.out.println(e.getMessage());
	}
    }
    
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
    
    public static ArrayList<Student> readStudentsByTeacher(String teacher)
    {
	ArrayList<Student> students = new ArrayList<Student>();
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
}
