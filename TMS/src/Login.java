/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author johnstevens
 */
public class Login extends javax.swing.JFrame
{
    /*
    faculty = 0
    non-faculty = 1
    admin = 2
    */
    public static int userType;
    
    /**
     * Creates new form TMS_UI
     */
    public Login()
    {
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

        btnFaculty = new javax.swing.JButton();
        lblWelcome = new javax.swing.JLabel();
        btnNonFaculty = new javax.swing.JButton();
        btnAdmin = new javax.swing.JButton();
        lblUserType = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnFaculty.setText("Faculty");
        btnFaculty.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnFacultyActionPerformed(evt);
            }
        });

        lblWelcome.setText("Welcome to TMS.");

        btnNonFaculty.setText("Non-Faculty");
        btnNonFaculty.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnNonFacultyActionPerformed(evt);
            }
        });

        btnAdmin.setText("Admin");
        btnAdmin.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnAdminActionPerformed(evt);
            }
        });

        lblUserType.setText("Please select user type to begin.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(lblWelcome))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnNonFaculty)
                            .addComponent(btnFaculty)
                            .addComponent(btnAdmin)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(lblUserType)))
                .addContainerGap(112, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblWelcome)
                .addGap(18, 18, 18)
                .addComponent(lblUserType)
                .addGap(24, 24, 24)
                .addComponent(btnFaculty)
                .addGap(28, 28, 28)
                .addComponent(btnNonFaculty)
                .addGap(28, 28, 28)
                .addComponent(btnAdmin)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFacultyActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnFacultyActionPerformed
    {//GEN-HEADEREND:event_btnFacultyActionPerformed
        // TODO add your handling code here:
        userType = 0;
	this.setVisible(false);
        new Faculty().setVisible(true);
    }//GEN-LAST:event_btnFacultyActionPerformed

    private void btnNonFacultyActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnNonFacultyActionPerformed
    {//GEN-HEADEREND:event_btnNonFacultyActionPerformed
        // TODO add your handling code here:
        userType = 1;
	this.setVisible(false);
        new NonFaculty().setVisible(true);
    }//GEN-LAST:event_btnNonFacultyActionPerformed

    private void btnAdminActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnAdminActionPerformed
    {//GEN-HEADEREND:event_btnAdminActionPerformed
        // TODO add your handling code here:
        userType = 2;
	this.setVisible(false);
        new Admin().setVisible(true);
    }//GEN-LAST:event_btnAdminActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
	/* Set the Nimbus look and feel */
	//<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
	/* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
	 */
	try
	{
	    for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
	    {
		if ("Nimbus".equals(info.getName()))
		{
		    javax.swing.UIManager.setLookAndFeel(info.getClassName());
		    break;
		}
	    }
	} catch (ClassNotFoundException ex)
	{
	    java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch (InstantiationException ex)
	{
	    java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch (IllegalAccessException ex)
	{
	    java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch (javax.swing.UnsupportedLookAndFeelException ex)
	{
	    java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	}
	//</editor-fold>
	//</editor-fold>

	/* Create and display the form */
	java.awt.EventQueue.invokeLater(new Runnable()
	{
	    @Override
	    public void run()
	    {
		new Login().setVisible(true);
	    }
	});
    }

    public static int getUserType()
    {
        return userType;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdmin;
    private javax.swing.JButton btnFaculty;
    private javax.swing.JButton btnNonFaculty;
    private javax.swing.JLabel lblUserType;
    private javax.swing.JLabel lblWelcome;
    // End of variables declaration//GEN-END:variables
}
