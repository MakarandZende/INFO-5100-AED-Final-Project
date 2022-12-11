/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.DruggistRole;

import Business.Enterprises.Enterprise;
import Business.Network.NetworkSystem;
import Business.Organization.DoctorConsultantOrg;
import Business.Organization.Org;
import Business.Organization.DruggistOrg;
import Business.UserAccount.User_Account;
import Business.WorkStream.PatientAppRequest;
import Business.WorkStream.WorkRequest;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Makarand
 */
public class DruggistWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PharmacistWorkAreaJPanel
     */
    private JPanel userProcessContainer;
    private DruggistOrg organization;
    private Enterprise enterprise;
    private User_Account userAccount;
    private NetworkSystem network;

    public DruggistWorkAreaJPanel(JPanel userProcessContainer, User_Account account, Org organization, Enterprise enterprise, NetworkSystem network) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organization = (DruggistOrg) organization;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.network = network;
        populateMedData();
    }

    private void populateMedData() {
        DefaultTableModel model = (DefaultTableModel) DruggistMedRequestJTable.getModel();

        model.setRowCount(0);
        for (WorkRequest request : organization.getWorkStream().getWorkRequestList()) {
            Object[] row = new Object[6];
            row[0] = request;
            row[1] = request.getSender().getUsername();
            row[2] = request.getReceiver() == null? "" :request.getReceiver().getUsername();
            String result = request.getStatus();
            // System.out.println(result);
            row[3] = result == null ? "Waiting" : result;

            row[4] = request.getRequestDate();
            row[5] = request.getMedlist();

            model.addRow(row);

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
        sendDrugPatientBtn = new javax.swing.JButton();
        assignDrugReqBtn = new javax.swing.JButton();
        checkInventoryBtn = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        DruggistMedRequestJTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(239, 241, 228));

        sendDrugPatientBtn.setBackground(new java.awt.Color(239, 241, 228));
        sendDrugPatientBtn.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        sendDrugPatientBtn.setText("Send Drug to Patient");
        sendDrugPatientBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        sendDrugPatientBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendDrugPatientBtnActionPerformed(evt);
            }
        });

        assignDrugReqBtn.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        assignDrugReqBtn.setText("Assign to Me");
        assignDrugReqBtn.setBorder(null);
        assignDrugReqBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignDrugReqBtnActionPerformed(evt);
            }
        });

        checkInventoryBtn.setBackground(new java.awt.Color(239, 241, 228));
        checkInventoryBtn.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        checkInventoryBtn.setText("Check Inventory");
        checkInventoryBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        checkInventoryBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkInventoryBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(72, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(checkInventoryBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(assignDrugReqBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sendDrugPatientBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(204, 204, 204)
                .addComponent(sendDrugPatientBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(assignDrugReqBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addComponent(checkInventoryBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(603, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {assignDrugReqBtn, checkInventoryBtn, sendDrugPatientBtn});

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 1080));

        jPanel6.setBackground(new java.awt.Color(193, 212, 227));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel1.setText("Lab Requests Received");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(381, 381, 381)
                .addComponent(jLabel1)
                .addContainerGap(533, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 1120, -1));

        jPanel2.setBackground(new java.awt.Color(239, 241, 228));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        DruggistMedRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Message", "Patient", "Doctor", "Status", "Date", "MedList"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(DruggistMedRequestJTable);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 740, -1));

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 150, 850, 510));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/drug.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void checkInventoryBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkInventoryBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkInventoryBtnActionPerformed

    private void sendDrugPatientBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendDrugPatientBtnActionPerformed
        int selectedRow = DruggistMedRequestJTable.getSelectedRow();

        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Select a request to proceed");
            return;
        }
        
        PatientAppRequest patientrequest = (PatientAppRequest)DruggistMedRequestJTable.getValueAt(selectedRow, 0);
        
        patientrequest.setSender(userAccount);
        patientrequest.setStatus("Drugs Sent to patient");
        patientrequest.setDiagnose(patientrequest.getDiagnose()+"\nFollowing medicines have been sent by "+ userAccount);
        JOptionPane.showMessageDialog(null,"Drugs Sent to Patient");
        populateMedData();
    }//GEN-LAST:event_sendDrugPatientBtnActionPerformed

    private void assignDrugReqBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignDrugReqBtnActionPerformed
        int selectedRow = DruggistMedRequestJTable.getSelectedRow();

        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Select a request to proceed");
            return;
        }
        
        PatientAppRequest patientrequest = (PatientAppRequest)DruggistMedRequestJTable.getValueAt(selectedRow, 0);
        patientrequest.setStatus("Prescription Received");
        patientrequest.setSender(userAccount);
        populateMedData();
    }//GEN-LAST:event_assignDrugReqBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable DruggistMedRequestJTable;
    private javax.swing.JButton assignDrugReqBtn;
    private javax.swing.JButton checkInventoryBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton sendDrugPatientBtn;
    // End of variables declaration//GEN-END:variables
}
