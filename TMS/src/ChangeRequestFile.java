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
    // writes all changes in a given array list to a binary file
    public static void writeChangeRequests(ArrayList<Change> changes, String fileName)
    {
	ObjectOutputStream out;
	
	try
	{
	    out = new ObjectOutputStream(new FileOutputStream(fileName));
	    
	    for(int i = 0; i < changes.size(); i++)
	    {
		out.writeObject(changes.get(i));
	    }
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
	ArrayList<Change> changes = new ArrayList<>();
	ObjectInputStream in;
        
	try
	{
	    in = new ObjectInputStream(new FileInputStream(fileName));
	    while(true)
	    {
		changes.add((Change) in.readObject());
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

    // adds a change request to a given file
    public static void addChangeRequest(Change newChange, String fileName)
    {
	ArrayList<Change> changes = readChangeRequests(fileName);
	changes.add(newChange);
	writeChangeRequests(changes, fileName);
    }
    
    // deletes a change request from the pending change request file
    public static void deleteChangeRequest(int changeId)
    {
	String fileName = "pendingChangeRequests.dat";
	ArrayList<Change> changes = readChangeRequests(fileName);
	
	for(int i = 0; i < changes.size(); i++)
	{
	    if(changes.get(i).getChangeId() == changeId)
	    {
		changes.remove(i);
		break;
	    }
	}
	
	writeChangeRequests(changes, fileName);
    }
}