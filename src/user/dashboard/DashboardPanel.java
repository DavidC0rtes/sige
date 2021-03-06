/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package user.dashboard;

import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.FlatLightLaf;

/**
 *
 * @author camilo
 */
public class DashboardPanel extends javax.swing.JPanel {
private DashboardControl dashboardControl;

    /** Creates new form DashboardPanel */
    public DashboardPanel() {
        dashboardControl = new DashboardControl();
        dashboardControl.updateData();
        initComponents();

    }
    public void lightMode() {
        FlatLightLaf.install();
        FlatLaf.updateUI();
        this.revalidate();
        this.repaint();
    }
    public void darkMode(){
        FlatDarkLaf.install();
        FlatLaf.updateUI();
        this.revalidate();
        this.repaint();

    }
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        resumenPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        resumenItemPanel = new javax.swing.JPanel();
        itemTitlelabel = new javax.swing.JLabel();
        pagosRealizadosLabel = new javax.swing.JLabel();
        resumenItemPanel1 = new javax.swing.JPanel();
        itemTitlelabel1 = new javax.swing.JLabel();
        pagosRealizadosLabel1 = new javax.swing.JLabel();
        resumenItemPanel2 = new javax.swing.JPanel();
        itemTitlelabel2 = new javax.swing.JLabel();
        pagosRealizadosLabel2 = new javax.swing.JLabel();
        resumenItemPanel3 = new javax.swing.JPanel();
        itemTitlelabel3 = new javax.swing.JLabel();
        pagosRealizadosLabel3 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Resumen Diario");

        resumenItemPanel.setBorder(javax.swing.BorderFactory.createLineBorder(javax.swing.UIManager.getDefaults().getColor("Objects.Purple")));
        resumenItemPanel.setForeground(new java.awt.Color(255, 255, 255));
        resumenItemPanel.setPreferredSize(new java.awt.Dimension(146, 122));

        itemTitlelabel.setText("Pagos realizados");

        pagosRealizadosLabel.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        pagosRealizadosLabel.setText(String.valueOf(dashboardControl.getTodayPayments()));

        javax.swing.GroupLayout resumenItemPanelLayout = new javax.swing.GroupLayout(resumenItemPanel);
        resumenItemPanel.setLayout(resumenItemPanelLayout);
        resumenItemPanelLayout.setHorizontalGroup(
            resumenItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, resumenItemPanelLayout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addComponent(itemTitlelabel)
                .addGap(29, 29, 29))
            .addGroup(resumenItemPanelLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(pagosRealizadosLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        resumenItemPanelLayout.setVerticalGroup(
            resumenItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(resumenItemPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(itemTitlelabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pagosRealizadosLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        resumenItemPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(javax.swing.UIManager.getDefaults().getColor("Objects.Purple")));
        resumenItemPanel1.setForeground(new java.awt.Color(255, 255, 255));
        resumenItemPanel1.setPreferredSize(new java.awt.Dimension(146, 122));

        itemTitlelabel1.setText("Pendientes para hoy");

        pagosRealizadosLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        pagosRealizadosLabel1.setText(String.valueOf(dashboardControl.getExpectedPayments()));

        javax.swing.GroupLayout resumenItemPanel1Layout = new javax.swing.GroupLayout(resumenItemPanel1);
        resumenItemPanel1.setLayout(resumenItemPanel1Layout);
        resumenItemPanel1Layout.setHorizontalGroup(
            resumenItemPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, resumenItemPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(itemTitlelabel1)
                .addGap(29, 29, 29))
            .addGroup(resumenItemPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(pagosRealizadosLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );
        resumenItemPanel1Layout.setVerticalGroup(
            resumenItemPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(resumenItemPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(itemTitlelabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pagosRealizadosLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        resumenItemPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(javax.swing.UIManager.getDefaults().getColor("Objects.Purple")));
        resumenItemPanel2.setForeground(new java.awt.Color(255, 255, 255));
        resumenItemPanel2.setPreferredSize(new java.awt.Dimension(146, 122));

        itemTitlelabel2.setText("Clientes Activos");

        pagosRealizadosLabel2.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        pagosRealizadosLabel2.setText(String.valueOf(dashboardControl.getActiveClients()));

        javax.swing.GroupLayout resumenItemPanel2Layout = new javax.swing.GroupLayout(resumenItemPanel2);
        resumenItemPanel2.setLayout(resumenItemPanel2Layout);
        resumenItemPanel2Layout.setHorizontalGroup(
            resumenItemPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(resumenItemPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(resumenItemPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(itemTitlelabel2)
                    .addComponent(pagosRealizadosLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        resumenItemPanel2Layout.setVerticalGroup(
            resumenItemPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(resumenItemPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(itemTitlelabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pagosRealizadosLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                .addContainerGap())
        );

        resumenItemPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(javax.swing.UIManager.getDefaults().getColor("Objects.Purple")));
        resumenItemPanel3.setForeground(new java.awt.Color(255, 255, 255));

        itemTitlelabel3.setText("Usuarios Activos");

        pagosRealizadosLabel3.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        pagosRealizadosLabel3.setText(String.valueOf(dashboardControl.getActiveUsers()));

        javax.swing.GroupLayout resumenItemPanel3Layout = new javax.swing.GroupLayout(resumenItemPanel3);
        resumenItemPanel3.setLayout(resumenItemPanel3Layout);
        resumenItemPanel3Layout.setHorizontalGroup(
            resumenItemPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, resumenItemPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(itemTitlelabel3)
                .addGap(29, 29, 29))
            .addGroup(resumenItemPanel3Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(pagosRealizadosLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        resumenItemPanel3Layout.setVerticalGroup(
            resumenItemPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(resumenItemPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(itemTitlelabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pagosRealizadosLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout resumenPanelLayout = new javax.swing.GroupLayout(resumenPanel);
        resumenPanel.setLayout(resumenPanelLayout);
        resumenPanelLayout.setHorizontalGroup(
            resumenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(resumenPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(resumenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(resumenPanelLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(resumenPanelLayout.createSequentialGroup()
                        .addComponent(resumenItemPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                        .addComponent(resumenItemPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                        .addComponent(resumenItemPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 21, Short.MAX_VALUE)
                        .addComponent(resumenItemPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(13, Short.MAX_VALUE))))
        );
        resumenPanelLayout.setVerticalGroup(
            resumenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(resumenPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(resumenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(resumenItemPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, resumenPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(resumenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(resumenItemPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(resumenItemPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(resumenItemPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(resumenPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(resumenPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 239, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel itemTitlelabel;
    private javax.swing.JLabel itemTitlelabel1;
    private javax.swing.JLabel itemTitlelabel2;
    private javax.swing.JLabel itemTitlelabel3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel pagosRealizadosLabel;
    private javax.swing.JLabel pagosRealizadosLabel1;
    private javax.swing.JLabel pagosRealizadosLabel2;
    private javax.swing.JLabel pagosRealizadosLabel3;
    private javax.swing.JPanel resumenItemPanel;
    private javax.swing.JPanel resumenItemPanel1;
    private javax.swing.JPanel resumenItemPanel2;
    private javax.swing.JPanel resumenItemPanel3;
    private javax.swing.JPanel resumenPanel;
    // End of variables declaration//GEN-END:variables

}
