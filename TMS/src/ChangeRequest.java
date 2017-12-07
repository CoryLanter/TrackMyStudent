
import java.util.Date;
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
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        lblChangeRequest = new javax.swing.JLabel();
        lblStudentID = new javax.swing.JLabel();
        lblPersonRequesting = new javax.swing.JLabel();
        lblSelectField = new javax.swing.JLabel();
        inputPersonRequesting = new javax.swing.JTextField();
        inputStudentID = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        lblExplainChange = new javax.swing.JLabel();
        scrollPaneChangeToBeMade = new javax.swing.JScrollPane();
        inputChangeToBeMade = new javax.swing.JTextArea();
        btnSubmit = new javax.swing.JButton();
        btnMainMenu = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        cmbFieldToEdit = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblChangeRequest.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblChangeRequest.setText("Change Request Form");

        lblStudentID.setText("Student ID:");

        lblPersonRequesting.setText("Name of person requesting change:");

        lblSelectField.setText("Select field(s) to edit:");

        inputStudentID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputStudentIDActionPerformed(evt);
            }
        });

        lblExplainChange.setText("Please explain the change(s) that needs to be made:");

        inputChangeToBeMade.setColumns(20);
        inputChangeToBeMade.setRows(5);
        scrollPaneChangeToBeMade.setViewportView(inputChangeToBeMade);

        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        btnMainMenu.setText("Main Menu");
        btnMainMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMainMenuActionPerformed(evt);
            }
        });

        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        cmbFieldToEdit.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Name", "Medication", "Schedule", "Grades", "Teacher", "Absences", "Allergies", "Student ID", "Delete a student", "Add a student" }));
        cmbFieldToEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbFieldToEditActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(scrollPaneChangeToBeMade, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(225, 225, 225)
                        .addComponent(lblChangeRequest)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(btnSubmit)
                                .addGap(95, 95, 95)
                                .addComponent(btnMainMenu)
                                .addGap(81, 81, 81)
                                .addComponent(btnLogout))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblSelectField)
                                    .addComponent(lblStudentID)
                                    .addComponent(lblPersonRequesting))
                                .addGap(65, 65, 65)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(inputStudentID, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbFieldToEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(inputPersonRequesting, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblExplainChange)))
                .addContainerGap(129, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblChangeRequest)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPersonRequesting)
                    .addComponent(inputPersonRequesting, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblStudentID)
                    .addComponent(inputStudentID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSelectField)
                    .addComponent(cmbFieldToEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(lblExplainChange)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollPaneChangeToBeMade, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSubmit)
                        .addGap(11, 11, 11)
                        .addComponent(jLabel5))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnLogout)
                        .addComponent(btnMainMenu)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inputStudentIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputStudentIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputStudentIDActionPerformed

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
        String name;
        int studentID;
        String fieldToEdit;
        String txtBlock;
        Date reqDate;
        
	
	try
	{
	    name = inputPersonRequesting.getText();
            studentID = Integer.parseInt(inputStudentID.getText());
	    if(cmbFieldToEdit.getSelectedIndex() != -1)
            {
		fieldToEdit = cmbFieldToEdit.getItemAt(cmbFieldToEdit.getSelectedIndex());
            }
            else
            {
                throw new InputMismatchException();
            }
            txtBlock = inputChangeToBeMade.getText();
            reqDate = new Date();
            ChangeRequestFile.addChangeRequest(new Change(name, studentID, fieldToEdit, txtBlock, reqDate, null), "pendingChangeRequests.dat");
	    this.setVisible(false);
	    new changeVerified().setVisible(true);
	}
	catch(InputMismatchException e)
	{
	    System.out.println(e.getMessage());
	}
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void cmbFieldToEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbFieldToEditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbFieldToEditActionPerformed

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
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnMainMenu;
    private javax.swing.JButton btnSubmit;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cmbFieldToEdit;
    private javax.swing.JTextArea inputChangeToBeMade;
    private javax.swing.JTextField inputPersonRequesting;
    private javax.swing.JTextField inputStudentID;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblChangeRequest;
    private javax.swing.JLabel lblExplainChange;
    private javax.swing.JLabel lblPersonRequesting;
    private javax.swing.JLabel lblSelectField;
    private javax.swing.JLabel lblStudentID;
    private javax.swing.JScrollPane scrollPaneChangeToBeMade;
    // End of variables declaration//GEN-END:variables
}
