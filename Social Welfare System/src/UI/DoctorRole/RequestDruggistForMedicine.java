/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.DoctorRole;

import Business.Enterprises.Enterprise;
import Business.Enterprises.DrugStoresEnterprises;
import Business.Network.NetworkSystem;
import Business.Organization.DoctorConsultantOrg;
import Business.Organization.Org;
import Business.Organization.DruggistOrg;
import Business.UserAccount.User_Account;
import Business.WorkStream.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
/**
 *
 * @author Makarand
 */
public class RequestDruggistForMedicine extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private DoctorConsultantOrg organization;
    private Enterprise enterprise;
    private User_Account userAccount;
    private NetworkSystem network;
    WorkRequest patientrequest;
    String medlist="";
    /**
     * Creates new form RequestDruggistForMedicineJPanel
     */
    public RequestDruggistForMedicine(JPanel userProcessContainer, WorkRequest request,NetworkSystem network, User_Account account, Enterprise enterprise ) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organization = (DoctorConsultantOrg) organization;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.network = network;
        this.patientrequest = request;
        txtPatientName.setText(patientrequest.getSender().getUsername());
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
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        chkDis = new javax.swing.JCheckBox();
        chkCam = new javax.swing.JCheckBox();
        chkAnt = new javax.swing.JCheckBox();
        chkViv = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtPatientName = new javax.swing.JTextField();
        chkAca = new javax.swing.JCheckBox();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1170, 1080));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(239, 241, 228));
        jPanel1.setPreferredSize(new java.awt.Dimension(1170, 100));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel6.setText("Prescription");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(497, 28, -1, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1180, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(193, 212, 227));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        chkDis.setBackground(new java.awt.Color(193, 212, 227));
        chkDis.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        chkDis.setText("Disulfiram");
        chkDis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkDisActionPerformed(evt);
            }
        });
        jPanel3.add(chkDis, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 217, -1, -1));

        chkCam.setBackground(new java.awt.Color(193, 212, 227));
        chkCam.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        chkCam.setText("Campral");
        jPanel3.add(chkCam, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 272, -1, -1));

        chkAnt.setBackground(new java.awt.Color(193, 212, 227));
        chkAnt.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        chkAnt.setText("Antabuse");
        chkAnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAntActionPerformed(evt);
            }
        });
        jPanel3.add(chkAnt, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 322, -1, -1));

        chkViv.setBackground(new java.awt.Color(193, 212, 227));
        chkViv.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        chkViv.setText(" Vivitrol");
        chkViv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkVivActionPerformed(evt);
            }
        });
        jPanel3.add(chkViv, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 374, -1, -1));

        jButton1.setBackground(new java.awt.Color(83, 124, 142));
        jButton1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Request Pharmacist");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 440, 204, 48));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("For Patient :");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 180, 60));

        txtPatientName.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        txtPatientName.setEnabled(false);
        jPanel3.add(txtPatientName, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, 205, 30));

        chkAca.setBackground(new java.awt.Color(193, 212, 227));
        chkAca.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        chkAca.setText("Acamprosate");
        chkAca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAcaActionPerformed(evt);
            }
        });
        jPanel3.add(chkAca, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 164, -1, -1));

        jButton2.setBackground(new java.awt.Color(193, 212, 227));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/back_button.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 17, -1, -1));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, 570, 520));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/doctor_backnew.jpg"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1190, -1));

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, 96, 1180, 990));
    }// </editor-fold>//GEN-END:initComponents

    private void chkDisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkDisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkDisActionPerformed

    private void chkAntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAntActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkAntActionPerformed

    private void chkVivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkVivActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkVivActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        patientrequest.setSender(userAccount);
        // patientrequest.setReceiver();
        if (chkAca.isSelected())
        {
            medlist = medlist + " Acamprosate ,";

        }
        if (chkDis.isSelected())
        {
            medlist = medlist + "Disulfiram ,";

        }

        if(chkCam.isSelected())
        {
            medlist = medlist + "Campral ,";
        }
        if(chkAnt.isSelected())
        {
            medlist = medlist + "Antabuse ,";
        }
        if(chkViv.isSelected())
        {
            medlist = medlist + "Vivitrol ,";
        }

        System.out.println(medlist);
        patientrequest.setMedlist(medlist);
        patientrequest.setStatus("Prescription Given");
        patientrequest.setDiagnose("Following medicines have been prescribed : \n " + medlist );

        Org org = null;
        for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()){
            if (enterprise instanceof DrugStoresEnterprises){
                for (Org organization : enterprise.getOrganizationDirectory().getOrganizationList()){
                    if (organization instanceof DruggistOrg){
                        org = organization;
                        break;
                    }
                }
            }
        }
        
        if (org!=null){
            org.getWorkStream().getWorkRequestList().add(patientrequest);
            patientrequest.setReceiver(null);
            userAccount.getWorkStream().getWorkRequestList().add(patientrequest);
            JOptionPane.showMessageDialog(null, "Medical prescription sent to pharmacist successfully.");
        }
        else{
            JOptionPane.showMessageDialog(null, "No Druggist  Available");
        }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void chkAcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkAcaActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox chkAca;
    private javax.swing.JCheckBox chkAnt;
    private javax.swing.JCheckBox chkCam;
    private javax.swing.JCheckBox chkDis;
    private javax.swing.JCheckBox chkViv;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txtPatientName;
    // End of variables declaration//GEN-END:variables
}
