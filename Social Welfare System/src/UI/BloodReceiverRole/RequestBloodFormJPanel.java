/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.BloodReceiverRole;

import Business.Enterprises.Enterprise;
import Business.Human.BloodGroup;
import Business.Organization.BloodDonorOrganization;
import Business.Organization.Org;
import Business.UserAccount.User_Account;
import Business.WorkStream.BloodDonationWorkRequest;
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
public class RequestBloodFormJPanel extends javax.swing.JPanel {

    /**
     * Creates new form RequestBloodFormJPanel
     */
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private User_Account userAccount;
    boolean emptyValidationStatus = true;
    public RequestBloodFormJPanel(JPanel userProcessContainer, User_Account userAccount, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.userAccount = userAccount;
        valueLabel.setText(enterprise.getName());
        populateBloodGroupCombobox();
    }
    
    public void populateBloodGroupCombobox(){
        bloodGroupCombobox.removeAllItems();
        bloodGroupCombobox.removeAllItems();
        for(BloodGroup bloodGroup: BloodGroup.values()){
            bloodGroupCombobox.addItem(bloodGroup.toString());
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        requestTestJButton = new javax.swing.JButton();
        bloodGroupCombobox = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        enterpriseLabel = new javax.swing.JLabel();
        messageJTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(239, 241, 228));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Request Blood");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, -1, -1));

        backJButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        backJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/back_button.png"))); // NOI18N
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        jPanel2.add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1360, 70));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(193, 212, 227));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        requestTestJButton.setBackground(new java.awt.Color(239, 241, 228));
        requestTestJButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        requestTestJButton.setText("Request Blood");
        requestTestJButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        requestTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestTestJButtonActionPerformed(evt);
            }
        });
        jPanel3.add(requestTestJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 130, 50));

        bloodGroupCombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel3.add(bloodGroupCombobox, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, 190, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Blood Group");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, -1, 26));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Message");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 135, 26));

        valueLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        valueLabel.setText("<value>");
        jPanel3.add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 130, 30));

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("EnterPrise :");
        jPanel3.add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 120, 30));

        messageJTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel3.add(messageJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, 185, -1));

        jPanel4.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 600, 220));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/bd.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1370, 720));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1376, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 795, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 5, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void requestTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestTestJButtonActionPerformed

        try{
            if(EmpytyFieldValidation()){
                String message = messageJTextField.getText();
                BloodGroup bloodGroup = BloodGroup.valueOf(bloodGroupCombobox.getSelectedItem().toString());
                BloodDonationWorkRequest request = new BloodDonationWorkRequest();
                request.setMessage(message);
                request.setSender(userAccount);
                request.setStatus("Sent");
                request.setBloodGroup(bloodGroup);

        Org org = null;
        for (Org organization : enterprise.getOrganizationDirectory().getOrganizationList()){
            if (organization instanceof BloodDonorOrganization){
                org = organization;
                break;
            }
        }
        if (org!=null){
            org.getWorkStream().getWorkRequestList().add(request);
            userAccount.getWorkStream().getWorkRequestList().add(request);
            JOptionPane.showMessageDialog(null,"Blood Request sent successfully");
        }
        messageJTextField.setText("");
            }
            else{
                JOptionPane.showMessageDialog(this,"Message cannot be empty");
                emptyValidationStatus=true;
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this,"Message not submitted, Try again");
            System.out.println(e.toString());
            emptyValidationStatus=true;
        }
        
//        String message = messageJTextField.getText();
//        BloodGroup bloodGroup = BloodGroup.valueOf(bloodGroupCombobox.getSelectedItem().toString());
//        BloodDonationWorkRequest request = new BloodDonationWorkRequest();
//        request.setMessage(message);
//        request.setSender(userAccount);
//        request.setStatus("Sent");
//        request.setBloodGroup(bloodGroup);
//
//        Org org = null;
//        for (Org organization : enterprise.getOrganizationDirectory().getOrganizationList()){
//            if (organization instanceof BloodDonorOrganization){
//                org = organization;
//                break;
//            }
//        }
//        if (org!=null){
//            org.getWorkStream().getWorkRequestList().add(request);
//            userAccount.getWorkStream().getWorkRequestList().add(request);
//        }
//        messageJTextField.setText("");
    }//GEN-LAST:event_requestTestJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // refreshing components when going back page
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        BloodReceiverWorkAreaJPanel vwjp = (BloodReceiverWorkAreaJPanel) component;
        vwjp.populateRequestTable();
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

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
        return emptyValidationStatus;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JComboBox<String> bloodGroupCombobox;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField messageJTextField;
    private javax.swing.JButton requestTestJButton;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}
