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
public class ChangeFile
{
    // writes an array of students to a binary file to initialize database
    public static void writeChangeRequest(Change[] change)
    {
	ObjectOutputStream out;
	
	try
	{
	    out = new ObjectOutputStream(new FileOutputStream("changeRequest.dat"));
	    
	    for(int i = 0; i < change.length; i++)
	    {
		out.writeObject(change[i]);
	    }
	    out.close();
	}
	catch(IOException e)
	{
	    System.out.println(e.getMessage());
	}
    }
    
    // adds a single student to the binary file
    public static void addChange(Change change)
    {
	ObjectOutputStream out;
	
	try
	{
	    out = new ObjectOutputStream(new FileOutputStream("students.dat"));
	    
	    out.writeObject(change);
	    out.close();
	}
	catch(IOException e)
	{
	    System.out.println(e.getMessage());
	}
    }
    
    // scans the binary file for a student with a matching Id and returns it
    public static Change readChangeById(int changeId)
    {
	ObjectInputStream in;
	Change cng;
	
	try
	{
	    in = new ObjectInputStream(new FileInputStream("changeRequest.dat"));
	    
	    while(true)
	    {
		cng = (Change) in.readObject();
		if(cng.compareChangeId(changeId))
		{
		    return cng;
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
    public static ArrayList<Change> readToName(String name)
    {
	ArrayList<Change> change = new ArrayList<Change>();
	ObjectInputStream in;
	Change cng;
	
	try
	{
	    in = new ObjectInputStream(new FileInputStream("changeRequest.dat"));
	    while(true)
	    {
		cng = (Change) in.readObject();
		if(cng.compareToName(name))
		    change.add(cng);
	    }
	}
	catch(EOFException eof)
	{
	    return change;
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
    public static ArrayList<Change> readFieldToEdit(String fieldToEdit)
    {
	ArrayList<Change> change = new ArrayList<Change>();
	ObjectInputStream in;
	Change cng;
	
	try
	{
	    in = new ObjectInputStream(new FileInputStream("changeRequest.dat"));
	    while(true)
	    {
		cng = (Change) in.readObject();
		if(cng.compareFieldToEdit(fieldToEdit))
		    change.add(cng);
	    }
	}
	catch(EOFException eof)
	{
	    return change;
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
    public static ArrayList<Change> readToTxtBlock(String txtBlock)
    {
	ArrayList<Change> change = new ArrayList<Change>();
	ObjectInputStream in;
	Change cng;
	
	try
	{
	    in = new ObjectInputStream(new FileInputStream("changeRequest.dat"));
	    while(true)
	    {
		cng = (Change) in.readObject();
		if(cng.compareToTxtBlock(txtBlock))
		    change.add(cng);
	    }
	}
	catch(EOFException eof)
	{
	    return change;
	}
	catch(IOException | ClassNotFoundException e)
	{
	    System.out.println(e.getMessage());
	    return null;
	}
    }

    
}