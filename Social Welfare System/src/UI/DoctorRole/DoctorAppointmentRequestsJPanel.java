/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.DoctorRole;

import Business.Enterprises.Enterprise;
import Business.Network.NetworkSystem;
import Business.Organization.DoctorConsultantOrg;
import Business.Organization.LaboratoryOrg;
import Business.Organization.Org;
import Business.UserAccount.User_Account;
import Business.WorkStream.DocLabRequest;
import Business.WorkStream.PatientAppRequest;
import Business.WorkStream.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Makarand
 */
public class DoctorAppointmentRequestsJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private DoctorConsultantOrg organization;
    private Enterprise enterprise;
    private User_Account userAccount;
    private NetworkSystem network;
    /**
     * Creates new form DoctorAppointmentRequestsJPanel
     */
    public DoctorAppointmentRequestsJPanel() {
        initComponents();
        populateRequestTable();
    }

    public DoctorAppointmentRequestsJPanel(JPanel userProcessContainer, User_Account account, Org organization, Enterprise enterprise, NetworkSystem network) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organization = (DoctorConsultantOrg) organization;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.network = network;

        //valueLabel.setText(enterprise.getName());
        populateRequestTable();

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
        jButton1 = new javax.swing.JButton();
        refreshJButton = new javax.swing.JButton();
        processJButton = new javax.swing.JButton();
        assignJButton = new javax.swing.JButton();
        btnViewlabresult = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        docWorkRequestJTable = new javax.swing.JTable();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(239, 241, 228));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/back_button.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        refreshJButton.setBackground(new java.awt.Color(239, 241, 228));
        refreshJButton.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        refreshJButton.setText("Refresh");
        refreshJButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        refreshJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshJButtonActionPerformed(evt);
            }
        });

        processJButton.setBackground(new java.awt.Color(239, 241, 228));
        processJButton.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        processJButton.setText("Collect Medical History");
        processJButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        processJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processJButtonActionPerformed(evt);
            }
        });

        assignJButton.setBackground(new java.awt.Color(193, 212, 227));
        assignJButton.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        assignJButton.setText("Assign to me");
        assignJButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        assignJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignJButtonActionPerformed(evt);
            }
        });

        btnViewlabresult.setBackground(new java.awt.Color(239, 241, 228));
        btnViewlabresult.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btnViewlabresult.setText("View Lab Result");
        btnViewlabresult.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnViewlabresult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewlabresultActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(71, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnViewlabresult, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(assignJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(refreshJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(processJButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {assignJButton, btnViewlabresult, processJButton});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(refreshJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(81, 81, 81)
                .addComponent(processJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(assignJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(btnViewlabresult, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(618, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {assignJButton, btnViewlabresult, processJButton});

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 1080));

        jPanel2.setBackground(new java.awt.Color(193, 212, 227));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Appointment Requests");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(278, 278, 278)
                .addComponent(jLabel6)
                .addContainerGap(350, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel6)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 830, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        docWorkRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Message", "Request Intended By", "Request Received By", "Status", "Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(docWorkRequestJTable);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 682, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(78, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(520, Short.MAX_VALUE))
        );

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 100, 830, 980));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void refreshJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJButtonActionPerformed
        //     System.out.println("refresh pressed ");
        populateRequestTable();
    }//GEN-LAST:event_refreshJButtonActionPerformed

    private void processJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processJButtonActionPerformed

        PatientAppRequest p_req = new PatientAppRequest();

        String status;
        int selectedRow = docWorkRequestJTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a patient first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        String s = (String) docWorkRequestJTable.getValueAt(selectedRow, 3);

        if (s.equals("Assigned To Doc")) {

            PatientAppRequest request = (PatientAppRequest) docWorkRequestJTable.getValueAt(selectedRow, 0);

            //  request.setStatus("Med Hist Coll Req");
            //  ProcessAppointmentRequestJPanel processAppointmentRequestJPanel = new ProcessAppointmentRequestJPanel(userProcessContainer, request, userAccount,enterprise);
            DoctorPatientMedicalHistoryJPanel processAppointmentRequestJPanel = new DoctorPatientMedicalHistoryJPanel(userProcessContainer, request, userAccount, enterprise);

            userProcessContainer.add("processWorkRequestJPanel", processAppointmentRequestJPanel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();

            layout.next(userProcessContainer);

        } else if (s.equals("Med Hist Coll Req")) {
            JOptionPane.showMessageDialog(null, "Medical history already collected" + "\n"
                + "No action required", "Error", JOptionPane.WARNING_MESSAGE);
            return;
        } else {
            JOptionPane.showMessageDialog(null, "Request is not with you" + "\n"
                + "No action needed", "Error", JOptionPane.WARNING_MESSAGE);
            return;
        }
    }//GEN-LAST:event_processJButtonActionPerformed

    private void assignJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignJButtonActionPerformed

        //   System.out.println("assign to me pressed ");
        String status;

        int selectedRow = docWorkRequestJTable.getSelectedRow();

        //    System.out.println(docWorkRequestJTable.getValueAt(selectedRow, 3));
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a patient first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        } else {
            status = (String) docWorkRequestJTable.getValueAt(selectedRow, 3);

            if (status.equals("Sent By Patient")) {
                WorkRequest request = (WorkRequest) docWorkRequestJTable.getValueAt(selectedRow, 0);
                request.setReceiver(userAccount);
                request.setStatus("Assigned To Doc");

                populateRequestTable();
            } else if (status.equals("Assigned To Doc")) {
                JOptionPane.showMessageDialog(null, "Request is already with you" + "\n"
                    + "Now start capturing medical history", "Warning", JOptionPane.WARNING_MESSAGE);

                return;
            } else if (status.equals("Med Hist Coll Req")) {
                JOptionPane.showMessageDialog(null, "Already Collected Medical History" + "\n"
                    + "No Action Needed", "Warning", JOptionPane.WARNING_MESSAGE);

                return;
            } else {
                JOptionPane.showMessageDialog(null, "Request is not with you", "Warning", JOptionPane.WARNING_MESSAGE);

                return;
            }

        }
    }//GEN-LAST:event_assignJButtonActionPerformed

    private void btnViewlabresultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewlabresultActionPerformed
        String status;
        int selectedRow = docWorkRequestJTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a patient first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        WorkRequest request = (WorkRequest) docWorkRequestJTable.getValueAt(selectedRow, 0);

        ViewLabResultcases viewLabResultcases = new ViewLabResultcases(userProcessContainer, request, network, enterprise, userAccount);
        userProcessContainer.add("viewLabResultcasesJPanel", viewLabResultcases);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        populateRequestTable();
    }//GEN-LAST:event_btnViewlabresultActionPerformed

    public void populateRequestTable() {

        DefaultTableModel model = (DefaultTableModel) docWorkRequestJTable.getModel();

        model.setRowCount(0);
        for (WorkRequest request : organization.getWorkStream().getWorkRequestList()) {
            Object[] row = new Object[5];
            //    row[0] = request.getMessage();
            row[0] = request;
            row[1] = request.getSender().getUsername();
            row[2] = request.getReceiver();
            String result = request.getStatus();
            // System.out.println(result);
            row[3] = result == null ? "Waiting" : result;

            row[4] = request.getRequestDate();

            model.addRow(row);

        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignJButton;
    private javax.swing.JButton btnViewlabresult;
    private javax.swing.JTable docWorkRequestJTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton processJButton;
    private javax.swing.JButton refreshJButton;
    // End of variables declaration//GEN-END:variables
}
