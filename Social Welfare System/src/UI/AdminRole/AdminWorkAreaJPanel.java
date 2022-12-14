/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.AdminRole;

import Business.Enterprises.Enterprise;
import Business.Organization.Org;
import Business.Human.Person;
import Business.UserAccount.User_Account;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


/**
 *
 * @author Pranali
 */
public class AdminWorkAreaJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    Enterprise enterprise;

    /**
     * Creates new form AdminWorkAreaJPanel
     */
    public AdminWorkAreaJPanel(JPanel userProcessContainer, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        valueLabel.setText(enterprise.getName());
        FillGraph();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        enterpriseLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        barchart = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        manageOrganizationJButton = new javax.swing.JButton();
        manageEmployeeJButton = new javax.swing.JButton();
        userJButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        enterpriseLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        enterpriseLabel.setForeground(new java.awt.Color(255, 255, 255));
        enterpriseLabel.setText("ENTERPRISE :");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 190, 200, 30));

        valueLabel.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(419, 68, 130, -1));

        barchart.setBackground(new java.awt.Color(239, 241, 228));
        barchart.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        add(barchart, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 230, 570, 230));

        jPanel2.setBackground(new java.awt.Color(239, 241, 228));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        manageOrganizationJButton.setBackground(new java.awt.Color(239, 241, 228));
        manageOrganizationJButton.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        manageOrganizationJButton.setText("Manage Organization");
        manageOrganizationJButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        manageOrganizationJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageOrganizationJButtonActionPerformed(evt);
            }
        });
        jPanel2.add(manageOrganizationJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 196, 53));

        manageEmployeeJButton.setBackground(new java.awt.Color(193, 212, 227));
        manageEmployeeJButton.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        manageEmployeeJButton.setText("Manage Employee");
        manageEmployeeJButton.setBorder(null);
        manageEmployeeJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageEmployeeJButtonActionPerformed(evt);
            }
        });
        jPanel2.add(manageEmployeeJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, 196, 54));

        userJButton.setBackground(new java.awt.Color(239, 241, 228));
        userJButton.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        userJButton.setText("Manage User");
        userJButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        userJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userJButtonActionPerformed(evt);
            }
        });
        jPanel2.add(userJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 480, 196, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/images/admin6.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 100, 100));

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 840));

        jPanel6.setBackground(new java.awt.Color(193, 212, 227));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel8.setText("My Work: Administrative Role");
        jPanel6.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 330, -1));

        add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 890, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/ad3.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, -50, 890, 870));
    }// </editor-fold>//GEN-END:initComponents

    private void userJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userJButtonActionPerformed
        // TODO add your handling code here:
        ManageUserAccountJPanel muajp = new ManageUserAccountJPanel(userProcessContainer, enterprise);
        userProcessContainer.add("ManageUserAccountJPanel", muajp);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_userJButtonActionPerformed

    private void manageEmployeeJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageEmployeeJButtonActionPerformed

        ManageEmployeeJPanel manageEmployeeJPanel = new ManageEmployeeJPanel(userProcessContainer, enterprise.getOrganizationDirectory());
        userProcessContainer.add("manageEmployeeJPanel", manageEmployeeJPanel);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_manageEmployeeJButtonActionPerformed

    private void manageOrganizationJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageOrganizationJButtonActionPerformed

        ManageOrganizationJPanel manageOrganizationJPanel = new ManageOrganizationJPanel(userProcessContainer, enterprise);
        userProcessContainer.add("manageOrganizationJPanel", manageOrganizationJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageOrganizationJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel barchart;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JButton manageEmployeeJButton;
    private javax.swing.JButton manageOrganizationJButton;
    private javax.swing.JButton userJButton;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables

    private void FillGraph() {

        if (!(enterprise instanceof Enterprise)) {
            JOptionPane.showMessageDialog(null, "Please add Enterprises.");
            return;
        }
        int org_count = 0;
        int per_count = 0;
        int user_count = 0;

        for (Org orgs : enterprise.getOrganizationDirectory().getOrganizationList()) {
            org_count++;

            for (Person person : orgs.getPersonDirectory().getPersonList()) {
                per_count++;
            }

            for (User_Account usr : orgs.getUserAccountDirectory().getUserAccountList()) {
                user_count++;
            }
        }

        

    }
}
