import java.awt.TextField;
import java.util.ArrayList;
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
	catch(NumberFormatException | InputMismatchException e)
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
	catch(NumberFormatException | InputMismatchException e)
	{
	    error.setText("Student not found");
	}
    }
    
    public static void editStudentSubmitButton(JFrame caller, JLabel error, 
	    TextField txtName, TextField txtStudentId, TextField txtTeacher,
	    TextField txtAllergies, TextField txtMedications,
	    TextField txtAbsences, TextField txtAvgGrade,
	    TextField txtSchedule)
    {
	Student stu;
	String name;
	int studentId;
	String teacher;
	String allergies;
	String medications;
	int absenses;
	String avgGrade;
	String schedule;
	
	try
	{
	    name = txtName.getText();
	    studentId = Integer.parseInt(txtStudentId.getText());
	    teacher = txtTeacher.getText();
	    allergies = txtAllergies.getText();
	    medications = txtMedications.getText();
	    absenses = Integer.parseInt(txtAbsences.getText());
	    avgGrade = txtAvgGrade.getText();
	    schedule = txtSchedule.getText();
	    
	    stu = new Student(name, studentId, teacher, allergies, medications,
		    "", avgGrade, schedule, absenses);
	    StudentFile.editStudent(stu);
	    caller.setVisible(false);
	    new viewStudent(stu).setVisible(true);
	}
	catch(NumberFormatException e)
	{
	    error.setText("Input not valid");
	}
    }
    
    public static void jEditStudentSubmitButton(JFrame caller, JLabel error, 
	    JTextField txtName, JTextField txtStudentId, JTextField txtTeacher,
	    JTextField txtAllergies, JTextField txtMedications,
	    JTextField txtAbsences, JTextField txtAvgGrade,
	    JTextField txtSchedule)
    {
	Student stu;
	String name;
	int studentId;
	String teacher;
	String allergies;
	String medications;
	int absenses;
	String avgGrade;
	String schedule;
	
	try
	{
	    name = txtName.getText();
	    studentId = Integer.parseInt(txtStudentId.getText());
	    teacher = txtTeacher.getText();
	    allergies = txtAllergies.getText();
	    medications = txtMedications.getText();
	    absenses = Integer.parseInt(txtAbsences.getText());
	    avgGrade = txtAvgGrade.getText();
	    schedule = txtSchedule.getText();
	    
	    stu = new Student(name, studentId, teacher, allergies, medications,
		    "", avgGrade, schedule, absenses);
	    StudentFile.editStudent(stu);
	    caller.setVisible(false);
	    new viewStudent(stu).setVisible(true);
	}
	catch(NumberFormatException e)
	{
	    error.setText("Input not valid");
	}
    }
    
    public static int findId()
    {
        int count = 1;
        int k = 0;
        Change cng;
	ArrayList<Change> list = ChangeRequestFile.readChangeRequests("pendingChangeRequests.dat");
        while(k != list.size())
        {
            for(int i = 0; i < list.size(); i++)
            {
                if(list.get(i).getChangeId() == count) 
                {
                    count++;
                    k=0;
                }
                else
		{
                    k++; 
                }
            }
        }
        return count;
    }
}