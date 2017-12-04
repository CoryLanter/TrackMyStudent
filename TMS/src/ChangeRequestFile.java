
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
    public static void writeChangeRequest(Change newChange)
    {
	ObjectOutputStream out;
	
	try
	{
	    out = new ObjectOutputStream(new FileOutputStream("pendingChangeRequests.dat"));
	    
	    out.writeObject(newChange);
	    
	    out.close();
	}
	catch(IOException e)
	{
	    System.out.println(e.getMessage());
	}
    }
    
    public static ArrayList<Change> readChangeRequests()
    {
	ArrayList<Change> changes = new ArrayList<Change>();
	ObjectInputStream in;
	Change change;
	
	try
	{
	    in = new ObjectInputStream(new FileInputStream("pendingChangeRequests.dat"));
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
