/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author user
 */
public class viewStudent extends javax.swing.JFrame {

    /**
     * Creates new form viewStudent
     */
    public viewStudent() {
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

        lblViewStudent = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblStudentID = new javax.swing.JLabel();
        lblTeacher = new javax.swing.JLabel();
        lblAllergies = new javax.swing.JLabel();
        lblMedications = new javax.swing.JLabel();
        lblAbsences = new javax.swing.JLabel();
        lblGrades = new javax.swing.JLabel();
        lblSchedule = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnChangeRequest = new javax.swing.JButton();
        btnMainMenu = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblViewStudent.setText("Viewing Student");

        lblName.setText("Name:  ");

        lblStudentID.setText("Student ID:  ");

        lblTeacher.setText("Teacher:  ");

        lblAllergies.setText("Allergies:  ");

        lblMedications.setText("Medications: ");

        lblAbsences.setText("Absences: ");

        lblGrades.setText("Grades:  ");

        lblSchedule.setText("Schedule:  ");

        btnChangeRequest.setText("Change Request");
        btnChangeRequest.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnChangeRequestActionPerformed(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(142, 142, 142)
                                .addComponent(lblViewStudent))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnChangeRequest)
                                .addGap(18, 18, 18)
                                .addComponent(btnMainMenu)))
                        .addGap(0, 8, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblTeacher)
                                    .addComponent(lblStudentID)
                                    .addComponent(lblName)
                                    .addComponent(lblAllergies)
                                    .addComponent(lblMedications)
                                    .addComponent(lblAbsences)
                                    .addComponent(lblGrades)
                                    .addComponent(lblSchedule))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(18, 18, 18)
                .addComponent(btnLogout)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblViewStudent)
                .addGap(7, 7, 7)
                .addComponent(lblName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblStudentID)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(lblTeacher)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblAllergies, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblMedications)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblAbsences)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblGrades)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblSchedule)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnChangeRequest)
                    .addComponent(btnMainMenu)
                    .addComponent(btnLogout))
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnChangeRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangeRequestActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new ChangeRequest().setVisible(true); 
    }//GEN-LAST:event_btnChangeRequestActionPerformed

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
            java.util.logging.Logger.getLogger(viewStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(viewStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(viewStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(viewStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new viewStudent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChangeRequest;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnMainMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblAbsences;
    private javax.swing.JLabel lblAllergies;
    private javax.swing.JLabel lblGrades;
    private javax.swing.JLabel lblMedications;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblSchedule;
    private javax.swing.JLabel lblStudentID;
    private javax.swing.JLabel lblTeacher;
    private javax.swing.JLabel lblViewStudent;
    // End of variables declaration//GEN-END:variables
}
