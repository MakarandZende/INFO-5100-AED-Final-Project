/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.VolunteerRole;

import Business.Enterprises.Enterprise;
import Business.Organization.FundsProviderOrganization;
import Business.Organization.Org;
import Business.UserAccount.User_Account;
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
public class RequestFundsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form RequestFundsJPanel
     */
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private User_Account userAccount;
    boolean emptyValidationStatus = true;
    boolean validationCheck = true;

    public RequestFundsJPanel(JPanel userProcessContainer, User_Account userAccount, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.userAccount = userAccount;
        valueLabel.setText(enterprise.getName());
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
        jLabel2 = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        enterpriseLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        messageJTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        amountTxtField = new javax.swing.JTextField();
        requestTestJButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(239, 241, 228));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Request Funds");

        backJButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        backJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/back_button.png"))); // NOI18N
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(backJButton)
                .addGap(264, 264, 264)
                .addComponent(jLabel2)
                .addContainerGap(727, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 60));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(193, 212, 227));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("EnterPrise :");
        jPanel2.add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 120, 30));

        valueLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        valueLabel.setText("<value>");
        jPanel2.add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, 130, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Message");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 135, 26));

        messageJTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel2.add(messageJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, 185, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Amount");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, -1, 26));

        amountTxtField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        amountTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amountTxtFieldActionPerformed(evt);
            }
        });
        jPanel2.add(amountTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, 185, -1));

        requestTestJButton.setBackground(new java.awt.Color(193, 212, 227));
        requestTestJButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        requestTestJButton.setForeground(new java.awt.Color(255, 255, 255));
        requestTestJButton.setText("Request Funds");
        requestTestJButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        requestTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestTestJButtonActionPerformed(evt);
            }
        });
        jPanel2.add(requestTestJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, 140, 40));

        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 150, 630, 250));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/vol_backnew.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 1300, 800));
    }// </editor-fold>//GEN-END:initComponents

    private void requestTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestTestJButtonActionPerformed

        try{
            if(EmpytyFieldValidation()){

                
                    String message = messageJTextField.getText();
        int amount = Integer.parseInt(amountTxtField.getText());
        FundsWorkRequest request = new FundsWorkRequest();
        request.setMessage(message);
        request.setSender(userAccount);
        request.setStatus("Sent");
        request.setAmount(amount);

        Org org = null;
        for (Org organization : enterprise.getOrganizationDirectory().getOrganizationList()){
            if (organization instanceof FundsProviderOrganization){
                org = organization;
                break;
            }
        }
        if (org!=null){
            org.getWorkStream().getWorkRequestList().add(request);
            userAccount.getWorkStream().getWorkRequestList().add(request);
        }
        messageJTextField.setText("");
        amountTxtField.setText("");
                
                
            }
            else{
                JOptionPane.showMessageDialog(this,"Invalid details");
                emptyValidationStatus=true;
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this,"Request not created, Try again");
            System.out.println(e.toString());
            emptyValidationStatus=true;
        }
        
//        String message = messageJTextField.getText();
//        int amount = Integer.parseInt(amountTxtField.getText());
//        FundsWorkRequest request = new FundsWorkRequest();
//        request.setMessage(message);
//        request.setSender(userAccount);
//        request.setStatus("Sent");
//        request.setAmount(amount);
//
//        Org org = null;
//        for (Org organization : enterprise.getOrganizationDirectory().getOrganizationList()){
//            if (organization instanceof FundsProviderOrganization){
//                org = organization;
//                break;
//            }
//        }
//        if (org!=null){
//            org.getWorkStream().getWorkRequestList().add(request);
//            userAccount.getWorkStream().getWorkRequestList().add(request);
//        }
//        messageJTextField.setText("");
//        amountTxtField.setText("");
    }//GEN-LAST:event_requestTestJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // refreshing components when going back page
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        VolunteerWorkAreaJPanel vwjp = (VolunteerWorkAreaJPanel) component;
        vwjp.populateRequestTable();
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);

    }//GEN-LAST:event_backJButtonActionPerformed

    private void amountTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amountTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_amountTxtFieldActionPerformed

//    private boolean RegexValidation() {
//        if(!amountTxtField.getText().matches("^[0-9]$"))
//        {
//            amountTxtField.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
//            amountTxtField.setToolTipText("Please enter a valid amount");
//            validationCheck=false;
//        }
//        
//        if(amountTxtField.getText().matches("^[0-9]$"))
//        {
//            amountTxtField.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
//        }
//        return validationCheck;
//    }
    
    private boolean EmpytyFieldValidation() {
        if(messageJTextField.getText().equals(null) || messageJTextField.getText().trim().isEmpty() )
        {
            messageJTextField.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            messageJTextField.setToolTipText("This Field Cannot be empty");
            emptyValidationStatus= false;
        }
        if(!messageJTextField.getText().equals(null) && !messageJTextField.getText().trim().isEmpty() )
        {
            messageJTextField.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        }
        if(amountTxtField.getText().equals(null) || amountTxtField.getText().trim().isEmpty() )
        {
            amountTxtField.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            amountTxtField.setToolTipText("This Field Cannot be empty");
            emptyValidationStatus= false;
        }
        if(!amountTxtField.getText().equals(null) && !amountTxtField.getText().trim().isEmpty() )
        {
            amountTxtField.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        }
        return emptyValidationStatus;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField amountTxtField;
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField messageJTextField;
    private javax.swing.JButton requestTestJButton;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}
