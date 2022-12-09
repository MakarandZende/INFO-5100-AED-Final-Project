/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.AdminRole;

import Business.Enterprises.Enterprise;
import Business.Organization.Org;
import Business.Organization.Org.Type;
import Business.Organization.OrgDirectory;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Pranali
 */
public class ManageOrganizationJPanel extends javax.swing.JPanel {

    private OrgDirectory directory;
    private JPanel userProcessContainer;
    private Enterprise enterprise;

    /**
     * Creates new form ManageOrganizationJPanel
     */
    public ManageOrganizationJPanel(JPanel userProcessContainer, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        //  this.directory = directory;
        this.enterprise = enterprise;

        populateTable();
        populateCombo();
    }

    private void populateCombo() {
        organizationJComboBox.removeAllItems();
        for (Type type : Org.Type.values()) {
            if (type.getEType() == enterprise.getEnterpriseType()) {
                System.out.println("Added type "+type.getEType());
                organizationJComboBox.addItem(type);
            }
        }
    }

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) organizationJTable.getModel();

        model.setRowCount(0);

        for (Org organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
            Object[] row = new Object[2];
            row[0] = organization.getOrganizationID();
            row[1] = organization;

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
        backJButton = new javax.swing.JButton();
        deleteOrgBtn = new javax.swing.JButton();
        addJButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        organizationJTable = new javax.swing.JTable();
        organizationJComboBox = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(193, 212, 227));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backJButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        backJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/back_button.png"))); // NOI18N
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        jPanel1.add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 60, -1));

        deleteOrgBtn.setBackground(new java.awt.Color(193, 212, 227));
        deleteOrgBtn.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        deleteOrgBtn.setForeground(new java.awt.Color(255, 255, 255));
        deleteOrgBtn.setText("Delete Organization");
        deleteOrgBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        deleteOrgBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteOrgBtnActionPerformed(evt);
            }
        });
        jPanel1.add(deleteOrgBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 490, 160, 50));

        addJButton1.setBackground(new java.awt.Color(193, 212, 227));
        addJButton1.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        addJButton1.setForeground(new java.awt.Color(255, 255, 255));
        addJButton1.setText("Add Organization");
        addJButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        addJButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addJButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(addJButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 160, 50));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/images/admin3.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, 100, 100));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 233, 940));

        jPanel6.setBackground(new java.awt.Color(239, 241, 228));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel7.setText("Manage Organization Work Area");
        jPanel6.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, -1, -1));

        add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 890, 60));

        jPanel2.setBackground(new java.awt.Color(193, 212, 227));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel1.setText("Organization Type ");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, -1, -1));

        organizationJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(organizationJTable);
        if (organizationJTable.getColumnModel().getColumnCount() > 0) {
            organizationJTable.getColumnModel().getColumn(0).setResizable(false);
            organizationJTable.getColumnModel().getColumn(1).setResizable(false);
        }

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 246, 124));

        organizationJComboBox.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        organizationJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel2.add(organizationJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 144, -1));

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 230, 380, 320));
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 890, 880));
    }// </editor-fold>//GEN-END:initComponents

    private void deleteOrgBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteOrgBtnActionPerformed
        int selectedRow = organizationJTable.getSelectedRow();

        if (selectedRow < 0){
            return;
        }
        
        Org org = (Org) organizationJTable.getValueAt(selectedRow, 1);
        enterprise.getOrganizationDirectory().deleteOrganization(org);
        populateTable();
    }//GEN-LAST:event_deleteOrgBtnActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void addJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addJButton1ActionPerformed
        Type type = (Type) organizationJComboBox.getSelectedItem();
        enterprise.getOrganizationDirectory().createOrganization(type);
//        for (Org org : directory.getOrganizationList()) {
//            if (org.getName().equals(type.getValue())) {
//                JOptionPane.showMessageDialog(null, "Already exists!!.");
//                return;
//            }
//
//        }
//
//        directory.createOrganization(type);
        populateTable();
    }//GEN-LAST:event_addJButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addJButton1;
    private javax.swing.JButton backJButton;
    private javax.swing.JButton deleteOrgBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox organizationJComboBox;
    private javax.swing.JTable organizationJTable;
    // End of variables declaration//GEN-END:variables
}
