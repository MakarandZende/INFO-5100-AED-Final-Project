/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.PatientRole;

import Business.WorkStream.WorkRequest;
import javax.swing.JPanel;

/**
 *
 * @author Pranali
 */
public class patientViewResultJPanel extends javax.swing.JPanel {

    /**
     * Creates new form patientViewResultJPanel
     */
       JPanel userProcessContainer;
         WorkRequest request;

    patientViewResultJPanel(JPanel userProcessContainer, WorkRequest request) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.request = request;
        txtDiagnose.setText(request.getDiagnose());
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtDiagnose = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        enterpriseLabel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtDiagnose.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtDiagnose.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(txtDiagnose, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 200, 510, 150));

        jPanel6.setBackground(new java.awt.Color(239, 241, 228));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        enterpriseLabel.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        enterpriseLabel.setText("Patient Treatment Result ");
        jPanel6.add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 0, 1080, 60));

        add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel1.setBackground(new java.awt.Color(249, 248, 248));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(249, 248, 248));
        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel1.setText("View Diagnosis :");
        jLabel1.setOpaque(true);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 80, 150, 50));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 1370, 630));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel txtDiagnose;
    // End of variables declaration//GEN-END:variables
}
