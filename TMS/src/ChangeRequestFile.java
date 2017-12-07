import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author johnstevens
 */
public class ChangeRequestFile
{
    // adds a change request to a given file
    public static void addChangeRequest(Change newChange, String fileName)
    {
	ObjectOutputStream out;
	
	try
	{
	    out = new ObjectOutputStream(new FileOutputStream(fileName));
	    
	    out.writeObject(newChange);
	    
	    out.close();
	}
	catch(IOException e)
	{
	    System.out.println(e.getMessage());
	}
    }
    
    // reads in all change requests from a given file
    public static ArrayList<Change> readChangeRequests(String fileName)
    {
	ArrayList<Change> changes = new ArrayList<Change>();
	ObjectInputStream in;
	Change change;
	
	try
	{
	    in = new ObjectInputStream(new FileInputStream(fileName));
	    while(true)
	    {
		change = (Change) in.readObject();
	    }
	}
	catch(EOFException eof)
	{
	    return changes;
	}
	catch(IOException | ClassNotFoundException e)
	{
	    System.out.println(e.getMessage());
	    return null;
	}
    }   
}