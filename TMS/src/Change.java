/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Cory Lanter
 */
public class Change implements Serializable
{
    private String name; // Person's name of who is requesting the change
    private int studentID; // Student ID to be changed
    private String fieldToEdit; // String to be built to interact with the radio buttons in ChangeRequest
    private String txtBlock; // Text block to be written in
    private Date reqDate; // Date of which the request is submitted
    private Date resolveDate; // Date of which the request is resolved
    private int changeId; // identifies the change request (6 digit)
    private static int idCounter = 100000; // used to generate changeId
    
    public Change(String name, int studentID, String fieldToEdit, String txtBlock, Date reqDate, Date resolveDate)
    {
        this.name = name;
        this.studentID = studentID;
        this.fieldToEdit = fieldToEdit;
        this.txtBlock = txtBlock;
        this.reqDate = reqDate;
        this.resolveDate = resolveDate;
	this.changeId = idCounter++;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getStudentID()
    {
        return studentID;
    }

    public void setStudentID(int studentID)
    {
        this.studentID = studentID;
    }

    public String getFieldToEdit()
    {
        return fieldToEdit;
    }

    public void setFieldToEdit(String fieldToEdit) {
        this.fieldToEdit = fieldToEdit;
    }

    public String getTxtBlock()
    {
        return txtBlock;
    }

    public void setTxtBlock(String txtBlock)
    {
        this.txtBlock = txtBlock;
    }

    public Date getReqDate()
    {
        return reqDate;
    }

    public void setReqDate(Date reqDate)
    {
        this.reqDate = reqDate;
    }

    public Date getResolveDate() {
        return resolveDate;
    }

    public void setResolveDate(Date resolveDate) {
        this.resolveDate = resolveDate;
    }

    public int getChangeId()
    {
	return changeId;
    }

    public void setChangeId(int changeId)
    {
	this.changeId = changeId;
    }

    public static int getIdCounter()
    {
	return idCounter;
    }
    
    
    public String toString()
    {
	return "From: " + this.getName() + ". Student Id: "
		+ this.getStudentID() + ". Field to Edit " + this.getFieldToEdit() + "."
		+ " Comment: " + this.getTxtBlock() + "." + "Date: " + this.getReqDate();
    }
}

    

