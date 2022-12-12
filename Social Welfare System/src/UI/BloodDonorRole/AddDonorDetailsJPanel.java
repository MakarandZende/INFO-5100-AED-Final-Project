/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.BloodDonorRole;

import Business.Human.BloodGroup;
import Business.UserAccount.User_Account;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.util.Date;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Pranali
 */
public class AddDonorDetailsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AddDonorDetailsJPanel
     */
    private User_Account userAccount;
    JPanel userProcessContainer;
    boolean emptyValidationStatus = true;
    boolean validationCheck = true;
    public AddDonorDetailsJPanel(JPanel userProcessContainer, User_Account userAccount) {
        initComponents();
        this.userAccount = userAccount;
        this.userProcessContainer = userProcessContainer;
        populateBloodGroup();
    }
    
    private void populateBloodGroup(){
        bloodGroupComboBox.removeAllItems();
        for(BloodGroup bloodGroup: BloodGroup.values()){
            bloodGroupComboBox.addItem(bloodGroup.toString());
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

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        label = new javax.swing.JLabel();
        dob = new com.toedter.calendar.JDateChooser();
        mobile = new javax.swing.JTextField();
        city = new javax.swing.JTextField();
        bloodGroupComboBox = new javax.swing.JComboBox<>();
        email = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        addDonorBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(193, 212, 227));
        jPanel1.setForeground(new java.awt.Color(255, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setText("Date Of Birth");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 80, -1));

        jLabel6.setText("Mobile");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 60, -1));

        jLabel8.setText("Blood Group");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, 70, -1));

        jLabel9.setText("City");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 160, 37, -1));

        label.setText("Email");
        jPanel1.add(label, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 220, 43, -1));
        jPanel1.add(dob, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 110, -1));
        jPanel1.add(mobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 110, -1));
        jPanel1.add(city, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 160, 130, -1));

        bloodGroupComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(bloodGroupComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 100, 130, -1));
        jPanel1.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 220, 130, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setText("Donor ID:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(272, 30, 70, 20));
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(375, 26, 50, 30));

        addDonorBtn.setBackground(new java.awt.Color(239, 241, 228));
        addDonorBtn.setText("ADD");
        addDonorBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        addDonorBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDonorBtnActionPerformed(evt);
            }
        });
        jPanel1.add(addDonorBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 280, 90, 40));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 40, 650, 470));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/bdd3.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 83, 1370, 710));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(906, 546, -1, -1));

        jPanel4.setBackground(new java.awt.Color(239, 241, 228));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("ADD NEW DONOR");

        backBtn.setBackground(new java.awt.Color(71, 120, 197));
        backBtn.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        backBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/LabAssistantRole/back_button.png"))); // NOI18N
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(backBtn)
                .addGap(449, 449, 449)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(601, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(backBtn)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 90));
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        BloodDonorWorkAreaJPanel bloodDonorWorkArea = (BloodDonorWorkAreaJPanel) component;
        bloodDonorWorkArea.populateTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed

    private void addDonorBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addDonorBtnActionPerformed
        
        try{
            if(EmpytyFieldValidation()){
                if(RegexValidation()){
                    Date donorDOB = dob.getDate();
                    String city = this.city.getText();
                    String email = this.email.getText();
                    long PhoneNo;
        try{
            PhoneNo = Long.parseLong(mobile.getText());
        }
        catch(Exception e){
            return;
        }
        BloodGroup bloodGroup = BloodGroup.valueOf(bloodGroupComboBox.getSelectedItem().toString());

        if(donorDOB == null || city == null || email == null || bloodGroup == null) {
            return;
        }
        JOptionPane.showMessageDialog(this,"Added details");
        userAccount.getHuman().setEmail(email);
        userAccount.getHuman().setDob(donorDOB);
        userAccount.getHuman().setCity(city);
        userAccount.getHuman().setPhoneNo(PhoneNo);
        userAccount.getHuman().setBloodGroup(bloodGroup);
                }
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
        
//        Date donorDOB = dob.getDate();
//        String city = this.city.getText();
//        String email = this.email.getText();
//        long PhoneNo;
//        try{
//            PhoneNo = Long.parseLong(mobile.getText());
//        }
//        catch(Exception e){
//            return;
//        }
//        BloodGroup bloodGroup = BloodGroup.valueOf(bloodGroupComboBox.getSelectedItem().toString());
//
//        if(donorDOB == null || city == null || email == null || bloodGroup == null) {
//            return;
//        }
//
//        userAccount.getHuman().setEmail(email);
//        userAccount.getHuman().setDob(donorDOB);
//        userAccount.getHuman().setCity(city);
//        userAccount.getHuman().setPhoneNo(PhoneNo);
//        userAccount.getHuman().setBloodGroup(bloodGroup);
    }//GEN-LAST:event_addDonorBtnActionPerformed

    private boolean RegexValidation() {
        if(!mobile.getText().matches("^[0-9]{10}$"))
        {
            mobile.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            mobile.setToolTipText("Please enter a valid mobile number");
            validationCheck=false;
        }
        
        if(mobile.getText().matches("^[0-9]{10}$"))
        {
            mobile.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        }
        if(!email.getText().matches("^[A-Za-z0-9+_.-]+@(.+)$"))
        {
            email.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            email.setToolTipText("Please enter a valid mobile number");
            validationCheck=false;
        }
        
        if(email.getText().matches("^[A-Za-z0-9+_.-]+@(.+)$"))
        {
            email.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        }
        return validationCheck;
    }
    
    private boolean EmpytyFieldValidation() {
        if(mobile.getText().equals(null) || mobile.getText().trim().isEmpty() )
        {
            mobile.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            mobile.setToolTipText("This Field Cannot be empty");
            emptyValidationStatus= false;
        }
        if(!mobile.getText().equals(null) && !mobile.getText().trim().isEmpty() )
        {
            mobile.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        }
        if(city.getText().equals(null) || city.getText().trim().isEmpty() )
        {
            city.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            city.setToolTipText("This Field Cannot be empty");
            emptyValidationStatus= false;
        }
        if(!city.getText().equals(null) && !city.getText().trim().isEmpty() )
        {
            city.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        }
        if(email.getText().equals(null) || email.getText().trim().isEmpty() )
        {
            email.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            email.setToolTipText("This Field Cannot be empty");
            emptyValidationStatus= false;
        }
        if(!email.getText().equals(null) && !email.getText().trim().isEmpty() )
        {
            email.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        }
        return emptyValidationStatus;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addDonorBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JComboBox<String> bloodGroupComboBox;
    private javax.swing.JTextField city;
    private com.toedter.calendar.JDateChooser dob;
    private javax.swing.JTextField email;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel label;
    private javax.swing.JTextField mobile;
    // End of variables declaration//GEN-END:variables
}
