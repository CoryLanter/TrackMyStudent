
import java.util.InputMismatchException;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author johnstevens
 */
public class ButtonFunctions
{
    public static void viewStudentButton(JFrame caller, JLabel error, JTextField txtField)
    {
	int studentId;
	Student stu;
	
	try
	{
	    studentId = Integer.parseInt(txtField.getText());
	    if((stu = StudentFile.readStudentById(studentId)) == null)
	    {
		throw new InputMismatchException();
	    }
	    caller.setVisible(false);
	    new viewStudent(stu).setVisible(true);
	}
	catch(InputMismatchException e)
	{
	    error.setText("Student not found");
	}
    }
    
    public static void editStudentButton(JFrame caller, JLabel error, JTextField txtField)
    {
	int studentId;
	Student stu;
	
	try
	{
	    studentId = Integer.parseInt(txtField.getText());
	    if((stu = StudentFile.readStudentById(studentId)) == null)
	    {
		throw new InputMismatchException();
	    }
	    caller.setVisible(false);
	    new EditStudent(stu).setVisible(true);
	}
	catch(InputMismatchException e)
	{
	    error.setText("Student not found");
	}
    }
}