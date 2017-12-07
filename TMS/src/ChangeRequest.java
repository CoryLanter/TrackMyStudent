
import java.util.InputMismatchException;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class ChangeRequest extends javax.swing.JFrame {

    /**
     * Creates new form changeRequest
     */
    public ChangeRequest() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        buttonGroup1 = new javax.swing.ButtonGroup();
        lblChangeRequest = new javax.swing.JLabel();
        lblStudentID = new javax.swing.JLabel();
        lblPersonRequesting = new javax.swing.JLabel();
        lblSelectField = new javax.swing.JLabel();
        radioName = new javax.swing.JRadioButton();
        radioTeacher = new javax.swing.JRadioButton();
        radioAllergies = new javax.swing.JRadioButton();
        radioMedications = new javax.swing.JRadioButton();
        radioAbsences = new javax.swing.JRadioButton();
        radioGrades = new javax.swing.JRadioButton();
        radioSchedule = new javax.swing.JRadioButton();
        inputPersonRequesting = new javax.swing.JTextField();
        inputStudentID = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        lblExplainChange = new javax.swing.JLabel();
        scrollPaneChangeToBeMade = new javax.swing.JScrollPane();
        inputChangeToBeMade = new javax.swing.JTextArea();
        btnSubmit = new javax.swing.JButton();
        btnMainMenu = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        radioStudentID = new javax.swing.JRadioButton();
        radioAddStudent = new javax.swing.JRadioButton();
        btnDeleteStudent = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblChangeRequest.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblChangeRequest.setText("Change Request Form");

        lblStudentID.setText("Student ID:");

        lblPersonRequesting.setText("Name of person requesting change:");

        lblSelectField.setText("Select field(s) to edit:");

        radioName.setText("Name");

        radioTeacher.setText("Teacher");

        radioAllergies.setText("Allergies");

        radioMedications.setText("Medications");

        radioAbsences.setText("Absences");
        radioAbsences.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                radioAbsencesActionPerformed(evt);
            }
        });

        radioGrades.setText("Grades");

        radioSchedule.setText("Schedule");

        inputStudentID.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                inputStudentIDActionPerformed(evt);
            }
        });

        lblExplainChange.setText("Please explain the change(s) that needs to be made:");

        inputChangeToBeMade.setColumns(20);
        inputChangeToBeMade.setRows(5);
        scrollPaneChangeToBeMade.setViewportView(inputChangeToBeMade);

        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnSubmitActionPerformed(evt);
            }
        });

        btnMainMenu.setText("Main Menu");
        btnMainMenu.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnMainMenuActionPerformed(evt);
            }
        });

        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnLogoutActionPerformed(evt);
            }
        });

        radioStudentID.setText("Student ID");
        radioStudentID.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                radioStudentIDActionPerformed(evt);
            }
        });

        radioAddStudent.setText("Add a student");

        btnDeleteStudent.setText("Delete a student");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblPersonRequesting)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inputPersonRequesting, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(210, 210, 210))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblStudentID)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(inputStudentID, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(280, 280, 280))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblSelectField)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(169, 169, 169)
                                .addComponent(lblChangeRequest))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(lblExplainChange)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(11, 11, 11)
                                        .addComponent(btnSubmit)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnMainMenu)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(81, 81, 81)
                                        .addComponent(btnLogout))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(scrollPaneChangeToBeMade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(radioTeacher)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(radioAbsences)
                                        .addGap(29, 29, 29)
                                        .addComponent(radioAllergies)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(radioStudentID))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(radioName)
                                        .addGap(18, 18, 18)
                                        .addComponent(radioMedications)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(radioSchedule)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(radioGrades)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(radioAddStudent)
                                    .addComponent(btnDeleteStudent))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(lblChangeRequest)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPersonRequesting)
                    .addComponent(inputPersonRequesting, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblStudentID)
                    .addComponent(inputStudentID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblSelectField)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioName)
                    .addComponent(radioMedications)
                    .addComponent(radioSchedule)
                    .addComponent(radioGrades)
                    .addComponent(radioAddStudent))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioTeacher)
                    .addComponent(radioAbsences)
                    .addComponent(radioAllergies)
                    .addComponent(radioStudentID)
                    .addComponent(btnDeleteStudent))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblExplainChange)
                        .addGap(54, 54, 54)
                        .addComponent(btnSubmit)
                        .addGap(11, 11, 11)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(scrollPaneChangeToBeMade, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnLogout)
                            .addComponent(btnMainMenu))))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void radioAbsencesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioAbsencesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioAbsencesActionPerformed

    private void inputStudentIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputStudentIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputStudentIDActionPerformed

    private void radioStudentIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioStudentIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioStudentIDActionPerformed

    private void btnMainMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMainMenuActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        switch(Login.getUserType())
        {
            case 0:
                new Faculty().setVisible(true);
                break;
            case 1:
                new NonFaculty().setVisible(true);
                break;
            case 2:
                new Admin().setVisible(true);
                break;
        }
    }//GEN-LAST:event_btnMainMenuActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new Login().setVisible(true);
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        int studentID;
        
	
	try
	{
	    studentID = Integer.parseInt(inputStudentID.getText());
	    this.setVisible(false);
	    new changeVerified().setVisible(true);
	}
	catch(InputMismatchException e)
	{
	    System.out.println(e.getMessage());
	}
    }//GEN-LAST:event_btnSubmitActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ChangeRequest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChangeRequest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChangeRequest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChangeRequest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChangeRequest().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton btnDeleteStudent;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnMainMenu;
    private javax.swing.JButton btnSubmit;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextArea inputChangeToBeMade;
    private javax.swing.JTextField inputPersonRequesting;
    private javax.swing.JTextField inputStudentID;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblChangeRequest;
    private javax.swing.JLabel lblExplainChange;
    private javax.swing.JLabel lblPersonRequesting;
    private javax.swing.JLabel lblSelectField;
    private javax.swing.JLabel lblStudentID;
    private javax.swing.JRadioButton radioAbsences;
    private javax.swing.JRadioButton radioAddStudent;
    private javax.swing.JRadioButton radioAllergies;
    private javax.swing.JRadioButton radioGrades;
    private javax.swing.JRadioButton radioMedications;
    private javax.swing.JRadioButton radioName;
    private javax.swing.JRadioButton radioSchedule;
    private javax.swing.JRadioButton radioStudentID;
    private javax.swing.JRadioButton radioTeacher;
    private javax.swing.JScrollPane scrollPaneChangeToBeMade;
    // End of variables declaration//GEN-END:variables
}
