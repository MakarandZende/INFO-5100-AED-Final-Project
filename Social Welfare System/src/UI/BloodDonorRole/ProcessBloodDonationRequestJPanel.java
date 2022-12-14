/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.BloodDonorRole;

import Business.WorkStream.BloodDonationWorkRequest;
import UI.FundsProviderRole.*;
import Business.WorkStream.FundsWorkRequest;
import Business.WorkStream.FundsWorkRequest;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Pranali
 */
public class ProcessBloodDonationRequestJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ProcessWorkRequestJPanel
     */
    JPanel userProcessContainer;
    BloodDonationWorkRequest request;
    boolean emptyValidationStatus = true;
    ProcessBloodDonationRequestJPanel(JPanel userProcessContainer, BloodDonationWorkRequest request) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.request = request;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        backJButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        resultJTextField = new javax.swing.JTextField();
        submitJButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(239, 241, 228));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backJButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        backJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/back_button.png"))); // NOI18N
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        jPanel1.add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 70, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Process WorkRequest");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, -1, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1290, 80));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(193, 212, 227));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Result");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 69, -1));

        resultJTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel2.add(resultJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, 201, 29));

        submitJButton.setBackground(new java.awt.Color(239, 241, 228));
        submitJButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        submitJButton.setText("Submit Result");
        submitJButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        submitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButtonActionPerformed(evt);
            }
        });
        jPanel2.add(submitJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 140, 40));

        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, 480, 170));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/bdd3.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 740));

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 1200, 740));
    }// </editor-fold>//GEN-END:initComponents

    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed
        
        try{
            if(EmpytyFieldValidation()){

                request.setDonorComments(resultJTextField.getText());
                request.setStatus("Completed");
                resultJTextField.setText("");
            }
            else{
                JOptionPane.showMessageDialog(this,"Result cannot be empty");
                emptyValidationStatus=true;
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this,"Result not submitted, Try again");
            System.out.println(e.toString());
            emptyValidationStatus=true;
        }
        
    }//GEN-LAST:event_submitJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        BloodDonorWorkAreaJPanel bdwrjp = (BloodDonorWorkAreaJPanel) component;
        bdwrjp.populateTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private boolean EmpytyFieldValidation() {
        if(resultJTextField.getText().equals(null) || resultJTextField.getText().trim().isEmpty() )
        {
            resultJTextField.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            resultJTextField.setToolTipText("This Field Cannot be empty");
            emptyValidationStatus= false;
        }
        if(!resultJTextField.getText().equals(null) && !resultJTextField.getText().trim().isEmpty() )
        {
            resultJTextField.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        }
        return emptyValidationStatus;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField resultJTextField;
    private javax.swing.JButton submitJButton;
    // End of variables declaration//GEN-END:variables
}
