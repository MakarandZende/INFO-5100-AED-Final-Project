/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.VolunteerRole;

import Business.Ecosystem.Ecosystem;
import Business.Enterprises.Enterprise;
import Business.Organization.VolunteerOrganization;
import Business.UserAccount.User_Account;
import Business.WorkStream.FundsWorkRequest;
import Business.WorkStream.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Pranali
 */
public class VolunteerWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form VolunteerWorkAreaJPanel
     */

    private JPanel userProcessContainer;
    private VolunteerOrganization organization;
    private Enterprise enterprise;
    private User_Account userAccount;
    private Ecosystem business;
    private int totalFundsAvailable;
    public VolunteerWorkAreaJPanel(JPanel userProcessContainer, User_Account account, VolunteerOrganization organization, Enterprise enterprise, Ecosystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.business = business;
        populateRequestTable();
    }
    
    // populate table with fundsWorkRequest
    public void populateRequestTable(){
        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();
        this.totalFundsAvailable = 0;
        model.setRowCount(0);
        System.out.println(userAccount.getWorkStream().getWorkRequestList());
        for (WorkRequest request : userAccount.getWorkStream().getWorkRequestList()){
            Object[] row = new Object[4];
            row[0] = request.getMessage();
            row[1] = request.getReceiver();
            row[2] = request.getStatus();
            String result = ((FundsWorkRequest) request).getTestResult();
            row[3] = result == null ? "Waiting" : result;
            this.totalFundsAvailable = this.totalFundsAvailable +((FundsWorkRequest) request).getAmountFunded();
            totalFundsTxt.setText("$ "+this.totalFundsAvailable);
            
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        requestFundJButton = new javax.swing.JButton();
        refreshTestJButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        totalFundsTxt = new javax.swing.JLabel();
        resReqBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Volunteer WorkArea JPanel");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, -1, -1));

        workRequestJTable.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Message", "Receiver", "Status", "Result"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workRequestJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 577, 135));

        requestFundJButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        requestFundJButton.setText("Request Funds");
        requestFundJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestFundJButtonActionPerformed(evt);
            }
        });
        add(requestFundJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 250, 161, -1));

        refreshTestJButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        refreshTestJButton.setText("Refresh");
        refreshTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshTestJButtonActionPerformed(evt);
            }
        });
        add(refreshTestJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 290, 161, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/images/volunteerimage.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 368, 281, 130));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Total Funds Available");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 180, 40));

        totalFundsTxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        add(totalFundsTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 260, 220, 40));

        resReqBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        resReqBtn.setText("Resolve Request");
        resReqBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resReqBtnActionPerformed(evt);
            }
        });
        add(resReqBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 330, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void requestFundJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestFundJButtonActionPerformed
        // go to fundRequest Page
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("RequestFundsJPanel", new RequestFundsJPanel(userProcessContainer, userAccount, enterprise));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_requestFundJButtonActionPerformed

    private void refreshTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshTestJButtonActionPerformed

        populateRequestTable();

    }//GEN-LAST:event_refreshTestJButtonActionPerformed

    private void resReqBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resReqBtnActionPerformed
        // TODO add your handling code here:
        // go to fundRequest Page
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("ResolveRequestsJPanel", new ResolveRequestsJPanel(userProcessContainer, userAccount,organization, enterprise, business));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_resReqBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton refreshTestJButton;
    private javax.swing.JButton requestFundJButton;
    private javax.swing.JButton resReqBtn;
    private javax.swing.JLabel totalFundsTxt;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
