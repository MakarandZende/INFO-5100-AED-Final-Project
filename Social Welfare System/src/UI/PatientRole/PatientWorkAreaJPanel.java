/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.PatientRole;

import Business.Enterprises.Enterprise;
import Business.Network.NetworkSystem;
import Business.Organization.Org;
import Business.Organization.PatientPersonOrg;
import Business.UserAccount.User_Account;
import Business.WorkStream.PatientAppRequest;
import Business.WorkStream.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;




/**
 *
 * @author Pranali
 */
public class PatientWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PatientWorkAreaJPanel
     */
    private JPanel userProcessContainer;
    private PatientPersonOrg organization;
    private Enterprise enterprise;
    private User_Account userAccount;
    private NetworkSystem network;

    public PatientWorkAreaJPanel(JPanel userProcessContainer, User_Account account, Org organization, Enterprise enterprise, NetworkSystem network) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organization = (PatientPersonOrg) organization;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.network = network;
        populateAppointmentListTable();
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
        btnViewDiagnose = new javax.swing.JButton();
        refreshTestJButton = new javax.swing.JButton();
        btnReqBookAppointment = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        appointmentJTable = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(239, 241, 228));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnViewDiagnose.setBackground(new java.awt.Color(239, 241, 228));
        btnViewDiagnose.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        btnViewDiagnose.setText("View Diagnose");
        btnViewDiagnose.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnViewDiagnose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewDiagnoseActionPerformed(evt);
            }
        });
        jPanel1.add(btnViewDiagnose, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 160, 60));

        refreshTestJButton.setBackground(new java.awt.Color(249, 248, 248));
        refreshTestJButton.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        refreshTestJButton.setText("Refresh");
        refreshTestJButton.setBorder(null);
        refreshTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshTestJButtonActionPerformed(evt);
            }
        });
        jPanel1.add(refreshTestJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 160, 60));

        btnReqBookAppointment.setBackground(new java.awt.Color(239, 241, 228));
        btnReqBookAppointment.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        btnReqBookAppointment.setText("Book Appointment");
        btnReqBookAppointment.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnReqBookAppointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReqBookAppointmentActionPerformed(evt);
            }
        });
        jPanel1.add(btnReqBookAppointment, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 450, 160, 60));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/patient2.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 150, 150));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 790));

        jPanel6.setBackground(new java.awt.Color(193, 212, 227));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel3.setText("Patient Appointment Booking Requests");
        jPanel6.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, -1, -1));

        add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 1170, 70));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(239, 241, 228));
        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        appointmentJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Message", "Appointment Date", "Request Received By", "Status", "Result"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(appointmentJTable);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 560, 290));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, 630, 370));

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, 920, 650));
    }// </editor-fold>//GEN-END:initComponents

    private void btnReqBookAppointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReqBookAppointmentActionPerformed

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("BookAppointmentJPanel", new BookAppointmentJPanel(userProcessContainer, userAccount, enterprise));
        layout.next(userProcessContainer);

    }//GEN-LAST:event_btnReqBookAppointmentActionPerformed

    private void refreshTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshTestJButtonActionPerformed

        populateAppointmentListTable();

    }//GEN-LAST:event_refreshTestJButtonActionPerformed

    private void btnViewDiagnoseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewDiagnoseActionPerformed
        int selectedRow = appointmentJTable.getSelectedRow();
        String status;
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }       
        WorkRequest request = (WorkRequest) appointmentJTable.getValueAt(selectedRow, 0);
        patientViewResultJPanel patientViewResultJPanel = new patientViewResultJPanel(userProcessContainer, request);
        userProcessContainer.add("patientViewResultJPanel", patientViewResultJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnViewDiagnoseActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable appointmentJTable;
    private javax.swing.JButton btnReqBookAppointment;
    private javax.swing.JButton btnViewDiagnose;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton refreshTestJButton;
    // End of variables declaration//GEN-END:variables

    public void populateAppointmentListTable() {
        //To change body of generated methods, choose Tools | Templates.
        DefaultTableModel model = (DefaultTableModel) appointmentJTable.getModel();
        model.setRowCount(0);
        for (WorkRequest request : userAccount.getWorkStream().getWorkRequestList()) {
            Object[] row = new Object[5];
            row[0] = request;
            String date = ((PatientAppRequest) request).getAppointmentdate();
            row[1] = date;
            row[2] = request.getReceiver();
            row[3] = request.getStatus();
            String doctmessage = ((PatientAppRequest) request).getdoctormessage();
            row[4] = request.getSolution() == null ? "Waiting" : request.getSolution();
            model.addRow(row);
        }
    }
}
