
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Cory Lanter
 */
public class pendingChangeRequest extends javax.swing.JFrame
{
    private ArrayList<Change> changes;
    private Change cng;
    
        public pendingChangeRequest()
    {
        changes = ChangeRequestFile.readChangeRequests("pendingChangeRequests.dat");
	initComponents();
        addRowToTable();
    } 
    public void addRowToTable(){
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        ArrayList<Change> list = ChangeRequestFile.readChangeRequests("pendingChangeRequests.dat");
        Object rowData[] = new Object[5];
        for(int i= 0; i < list.size(); i++){
            rowData[0] = list.get(i).getName();
            rowData[1] = list.get(i).getStudentID();
            rowData[2] = list.get(i).getFieldToEdit();
            rowData[3] = list.get(i).getTxtBlock();
            rowData[4] = list.get(i).getChangeId();
            model.addRow(rowData);
        
        }
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        btnClosePopup = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnResolveChange = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        jScrollPane2.setViewportView(jEditorPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnClosePopup.setText("Close");
        btnClosePopup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClosePopupActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 274, Short.MAX_VALUE)
        );

        btnResolveChange.setText("Resolve Change");
        btnResolveChange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResolveChangeActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Student ID", "Field to Edit", "Comment", "Date Submitted"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnResolveChange)
                        .addGap(463, 463, 463)
                        .addComponent(btnClosePopup)
                        .addGap(16, 16, 16))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 659, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnResolveChange)
                    .addComponent(btnClosePopup))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    
    private void btnClosePopupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClosePopupActionPerformed

        // TODO add your handling code here:
            this.setVisible(false);
        new Admin().setVisible(false);
    }//GEN-LAST:event_btnClosePopupActionPerformed

    private void btnResolveChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResolveChangeActionPerformed

       DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
       int i = jTable1.getSelectedRow();
       Change change = new Change("",0,"","",null,null);
       change.setName(model.getValueAt(i,0).toString());
       change.setStudentID(Integer.parseInt(model.getValueAt(i,1).toString()));
       change.setFieldToEdit(model.getValueAt(i,2).toString());
       change.setTxtBlock(model.getValueAt(i,3).toString());
       change.setChangeId(Integer.parseInt(model.getValueAt(i,4).toString()));
       ChangeRequestFile.addChangeRequest(change, "log.dat");
       ChangeRequestFile.addChangeRequest(change, "backupLog.dat");
       ChangeRequestFile.deleteChangeRequest(change.getChangeId());
       model.removeRow(i);
    }//GEN-LAST:event_btnResolveChangeActionPerformed

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
            java.util.logging.Logger.getLogger(pendingChangeRequest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pendingChangeRequest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pendingChangeRequest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pendingChangeRequest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pendingChangeRequest().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClosePopup;
    private javax.swing.JButton btnResolveChange;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
