/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user;

import java.awt.Color;
import java.awt.event.ActionEvent;

import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.FlatLightLaf;
import user.config.ConfigPanel;
import user.consulta.ConsultaPanel;
import user.register.RegisterPanel;
import user.dashboard.DashboardPanel;
import activos.SubestacionPanel;
import finance.pagos.MainPagosPanel;
import finance.pagos.VistaRegistrarPago;
import finance.clientes.RegisterPanelCliente;

import javax.swing.*;

/**
 *
 * @author camilo
 */
public class Dashboard extends javax.swing.JFrame {
    private final RegisterPanel registerPanel = new RegisterPanel();
    private final RegisterPanelCliente registerPanelCliente = new RegisterPanelCliente();
    public final ConsultaPanel consultaPanel = new ConsultaPanel();
    private final DashboardPanel dashboardPanel = new DashboardPanel();
    private final SubestacionPanel subestacionPanel = new SubestacionPanel();
    private MainPagosPanel registerPayPanel;
    public final ConfigPanel configPanel = new ConfigPanel();
    private User usuario;
    private JFrame window;

    /**
     * Creates new form Dashboard
     */
    public Dashboard(User usuario) {
        this.usuario = usuario;
        registerPayPanel = new MainPagosPanel(usuario);
        initComponents();
        window = this;
        configUser();
        darkMode();
    }

    public  void darkMode(){
        configPanel.itemDarkMode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                if (configPanel.itemDarkMode.isSelected()) {
                    FlatDarkLaf.install();
                    consultaPanel.darkMode();
                    window.revalidate();
                    window.repaint();

                } else {
                    FlatLightLaf.install();
                    window.revalidate();
                    window.repaint();
                }
                FlatLaf.updateUI();
            }


        });
    }

    private void configUser(){
        //Esta funcion configura la interfaz para cada usuario
        //Removiendole los paneles a los cuales no tiene acceso
        usernameLabel.setText(usuario.getPrimer_nombre() + " " + usuario.getPrimer_apellido());
        this.setTitle("SiGe | " + usuario.getStringRol());

        if (usuario.getIdRol() == 1){ // Administrador
            panelMenu.remove(itemSubestaciones);
            panelMenu.remove(registerPayPanel);
        }
        if (usuario.getIdRol() == 2){ // Gerente
            panelMenu.remove(itemRegistrar);
            panelMenu.remove(itemListaUsuarios);
            panelMenu.remove(registerPayPanel);
            configPanel.remove(configPanel.panelMantenimiento);

        }
        if (usuario.getIdRol() == 3){ // Operador
            panelMenu.remove(itemConfigurar);
            panelMenu.remove(itemSubestaciones);
            configPanel.remove(configPanel.panelMantenimiento);

        }
        this.repaint();
        this.revalidate();
        setVisible(true);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelLateral = new javax.swing.JPanel();
        panelPerfil = new javax.swing.JPanel();
        usernameLabel = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jUsername = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        panelMenu = new javax.swing.JPanel();
        itemInicio = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        itemTitle1 = new javax.swing.JLabel();
        itemListaUsuarios = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        itemTitle2 = new javax.swing.JLabel();
        itemRegistrar = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        itemTitle3 = new javax.swing.JLabel();
        itemSubestaciones = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        itemTitle4 = new javax.swing.JLabel();
        itemPagos = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        itemTitle6 = new javax.swing.JLabel();
        itemConfigurar = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        itemTitle5 = new javax.swing.JLabel();
        panelLogOut = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        panelLateral.setBackground(new java.awt.Color(50, 55, 61));
        panelLateral.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 1, new java.awt.Color(0, 0, 0)));
        panelLateral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelPerfil.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        usernameLabel.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        usernameLabel.setForeground(java.awt.Color.black);
        usernameLabel.setText("Username");
        panelPerfil.add(usernameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/avatar.png"))); // NOI18N
        panelPerfil.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 100, -1));

        jUsername.setFont(new java.awt.Font("Fira Code", 2, 14)); // NOI18N
        //jUsername.setText(username);
        panelPerfil.add(jUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, -1, -1));

        jLabel1.setBackground(new java.awt.Color(1, 1, 1));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/bg_1.jpg"))); // NOI18N
        jLabel1.setText("Username");
        panelPerfil.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 180));

        panelLateral.add(panelPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 180));

        panelMenu.setBackground(new java.awt.Color(50, 55, 61));
        panelMenu.setLayout(new java.awt.GridLayout(6, 0, 60, 2));

        itemInicio.setBorder(new javax.swing.border.LineBorder(java.awt.Color.white, 1, true));
        itemInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        itemInicio.setOpaque(false);
        itemInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemInicioMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                itemInicioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                itemInicioMouseExited(evt);
            }
        });
        java.awt.FlowLayout flowLayout2 = new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 10, 5);
        flowLayout2.setAlignOnBaseline(true);
        itemInicio.setLayout(flowLayout2);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/hogar.png"))); // NOI18N
        itemInicio.add(jLabel12);

        itemTitle1.setFont(new java.awt.Font("Fira Code", 1, 12)); // NOI18N
        itemTitle1.setForeground(new java.awt.Color(254, 254, 254));
        itemTitle1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        itemTitle1.setText("Inicio");
        itemTitle1.setAlignmentX(0.6F);
        itemTitle1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        itemTitle1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        itemTitle1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemTitle1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                itemTitle1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                itemTitle1MouseExited(evt);
            }
        });
        itemInicio.add(itemTitle1);

        panelMenu.add(itemInicio);

        itemListaUsuarios.setBorder(new javax.swing.border.LineBorder(java.awt.Color.white, 1, true));
        itemListaUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        itemListaUsuarios.setOpaque(false);
        itemListaUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemListaUsuariosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                itemListaUsuariosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                itemListaUsuariosMouseExited(evt);
            }
        });
        java.awt.FlowLayout flowLayout1 = new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 10, 5);
        flowLayout1.setAlignOnBaseline(true);
        itemListaUsuarios.setLayout(flowLayout1);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/portapapeles.png"))); // NOI18N
        itemListaUsuarios.add(jLabel11);

        itemTitle2.setFont(new java.awt.Font("Fira Code", 1, 12)); // NOI18N
        itemTitle2.setForeground(new java.awt.Color(254, 254, 254));
        itemTitle2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        itemTitle2.setText("Lista de Usuarios");
        itemTitle2.setAlignmentX(0.6F);
        itemTitle2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        itemTitle2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        itemTitle2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemTitle2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                itemTitle2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                itemTitle2MouseExited(evt);
            }
        });
        itemListaUsuarios.add(itemTitle2);

        panelMenu.add(itemListaUsuarios);

        itemRegistrar.setBorder(new javax.swing.border.LineBorder(java.awt.Color.white, 1, true));
        itemRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        itemRegistrar.setOpaque(false);
        itemRegistrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemRegistrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                itemRegistrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                itemRegistrarMouseExited(evt);
            }
        });
        java.awt.FlowLayout flowLayout3 = new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 10, 5);
        flowLayout3.setAlignOnBaseline(true);
        itemRegistrar.setLayout(flowLayout3);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/registro.png"))); // NOI18N
        itemRegistrar.add(jLabel13);

        itemTitle3.setFont(new java.awt.Font("Fira Code", 1, 12)); // NOI18N
        itemTitle3.setForeground(new java.awt.Color(254, 254, 254));
        itemTitle3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        if (usuario.getIdRol()==1){
            itemTitle3.setText("Registrar Usuarios");
        }
        else if(usuario.getIdRol()==3){
            itemTitle3.setText("Registrar Cliente");
        }
        itemTitle3.setAlignmentX(0.6F);
        itemTitle3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        itemTitle3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        itemTitle3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemTitle3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                itemTitle3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                itemTitle3MouseExited(evt);
            }
        });
        itemRegistrar.add(itemTitle3);

        panelMenu.add(itemRegistrar);

        itemSubestaciones.setBorder(new javax.swing.border.LineBorder(java.awt.Color.white, 1, true));
        itemSubestaciones.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        itemSubestaciones.setOpaque(false);
        itemSubestaciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemSubestacionesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                itemSubestacionesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                itemSubestacionesMouseExited(evt);
            }
        });
        java.awt.FlowLayout flowLayout4 = new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 10, 5);
        flowLayout4.setAlignOnBaseline(true);
        itemSubestaciones.setLayout(flowLayout4);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/transformador.png"))); // NOI18N
        itemSubestaciones.add(jLabel10);

        itemTitle4.setFont(new java.awt.Font("Fira Code", 1, 12)); // NOI18N
        itemTitle4.setForeground(new java.awt.Color(254, 254, 254));
        itemTitle4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        itemTitle4.setText("Control de Subestaciones");
        itemTitle4.setAlignmentX(0.6F);
        itemTitle4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        itemTitle4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        itemTitle4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemTitle4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                itemTitle4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                itemTitle4MouseExited(evt);
            }
        });
        itemSubestaciones.add(itemTitle4);

        panelMenu.add(itemSubestaciones);

        itemPagos.setBorder(new javax.swing.border.LineBorder(java.awt.Color.white, 1, true));
        itemPagos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        itemPagos.setOpaque(false);
        itemPagos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemPagosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                itemPagosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                itemPagosMouseExited(evt);
            }
        });
        java.awt.FlowLayout flowLayout5 = new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 10, 5);
        flowLayout5.setAlignOnBaseline(true);
        itemPagos.setLayout(flowLayout5);

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/pila-de-dinero.png"))); // NOI18N
        itemPagos.add(jLabel16);

        itemTitle6.setFont(new java.awt.Font("Fira Code", 1, 12)); // NOI18N
        itemTitle6.setForeground(new java.awt.Color(254, 254, 254));
        itemTitle6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        itemTitle6.setText("Registrar Pagos");
        itemTitle6.setAlignmentX(0.6F);
        itemTitle6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        itemTitle6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        itemTitle6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemTitle6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                itemTitle6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                itemTitle6MouseExited(evt);
            }
        });
        itemPagos.add(itemTitle6);

        panelMenu.add(itemPagos);

        itemConfigurar.setBorder(new javax.swing.border.LineBorder(java.awt.Color.white, 1, true));
        itemConfigurar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        itemConfigurar.setOpaque(false);
        itemConfigurar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemConfigurarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                itemConfigurarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                itemConfigurarMouseExited(evt);
            }
        });
        java.awt.FlowLayout flowLayout7 = new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 10, 5);
        flowLayout7.setAlignOnBaseline(true);
        itemConfigurar.setLayout(flowLayout7);

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/ajustes.png"))); // NOI18N
        itemConfigurar.add(jLabel15);

        itemTitle5.setFont(new java.awt.Font("Fira Code", 1, 12)); // NOI18N
        itemTitle5.setForeground(new java.awt.Color(254, 254, 254));
        itemTitle5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        itemTitle5.setText("Configuración");
        itemTitle5.setAlignmentX(0.6F);
        itemTitle5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        itemTitle5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        itemTitle5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemTitle5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                itemTitle5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                itemTitle5MouseExited(evt);
            }
        });
        itemConfigurar.add(itemTitle5);

        panelMenu.add(itemConfigurar);

        panelLateral.add(panelMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 230, 420));

        panelLogOut.setBackground(new java.awt.Color(50, 55, 61));
        panelLogOut.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panelLogOut.setLayout(null);

        jLabel2.setBackground(new java.awt.Color(254, 254, 254));
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(254, 254, 254));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Salir del programa");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel2MouseExited(evt);
            }
        });
        panelLogOut.add(jLabel2);
        jLabel2.setBounds(110, 30, 120, 20);

        jLabel6.setBackground(new java.awt.Color(254, 254, 254));
        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(254, 254, 254));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Cerrar Sesion");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel6MouseExited(evt);
            }
        });
        panelLogOut.add(jLabel6);
        jLabel6.setBounds(0, 30, 110, 20);

        jLabel14.setForeground(java.awt.Color.white);
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Sistema de Gestion Electrica");
        panelLogOut.add(jLabel14);
        jLabel14.setBounds(0, 0, 230, 30);

        panelLateral.add(panelLogOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 620, 230, 50));

        jPanel3.setBackground(java.awt.Color.white);
        jPanel3.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1100, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panelLateral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 870, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 691, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(panelLateral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseEntered

        jLabel6.setOpaque(true);
        jLabel6.setBackground(new Color(2, 143, 224));
    }//GEN-LAST:event_jLabel6MouseEntered

    private void jLabel6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseExited
        jLabel6.setOpaque(false);
        jLabel6.setBackground(new Color(50,55,61));
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel6MouseExited

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
        jLabel2.setOpaque(true);
        jLabel2.setBackground(new Color(2, 143, 224));// TODO add your handling code here:
    }//GEN-LAST:event_jLabel2MouseEntered

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
        jLabel2.setOpaque(false);
        jLabel2.setBackground(new Color(50,55,61));
    }//GEN-LAST:event_jLabel2MouseExited

    private void itemTitle3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemTitle3MouseEntered

    }//GEN-LAST:event_itemTitle3MouseEntered

    private void itemTitle3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemTitle3MouseExited

    }//GEN-LAST:event_itemTitle3MouseExited

    private void itemTitle2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemTitle2MouseEntered

    }//GEN-LAST:event_itemTitle2MouseEntered

    private void itemTitle2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemTitle2MouseExited

    }//GEN-LAST:event_itemTitle2MouseExited

    private void itemTitle3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemTitle3MouseClicked

    }//GEN-LAST:event_itemTitle3MouseClicked

    private void itemTitle2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemTitle2MouseClicked


    }//GEN-LAST:event_itemTitle2MouseClicked

    private void itemTitle4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemTitle4MouseClicked

    }//GEN-LAST:event_itemTitle4MouseClicked

    private void itemTitle4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemTitle4MouseEntered

    }//GEN-LAST:event_itemTitle4MouseEntered

    private void itemTitle4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemTitle4MouseExited
        itemTitle4.setOpaque(false);
        itemTitle4.setBackground(new Color(50,55,61));
    }//GEN-LAST:event_itemTitle4MouseExited

    private void itemTitle1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemTitle1MouseExited

    }//GEN-LAST:event_itemTitle1MouseExited

    private void itemTitle1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemTitle1MouseEntered

    }//GEN-LAST:event_itemTitle1MouseEntered

    private void itemTitle1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemTitle1MouseClicked

    }//GEN-LAST:event_itemTitle1MouseClicked

    private void itemTitle5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemTitle5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_itemTitle5MouseClicked

    private void itemTitle5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemTitle5MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_itemTitle5MouseEntered

    private void itemTitle5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemTitle5MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_itemTitle5MouseExited

    private void itemInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemInicioMouseClicked
        jPanel3.removeAll();
        jPanel3.add(dashboardPanel);
        if(configPanel.itemDarkMode.isSelected()){
            dashboardPanel.darkMode();
        }
        else{
            dashboardPanel.lightMode();
        }
    }//GEN-LAST:event_itemInicioMouseClicked

    private void itemInicioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemInicioMouseEntered
        itemInicio.setOpaque(true);
        itemInicio.setBackground(new Color(2, 143, 224));
    }//GEN-LAST:event_itemInicioMouseEntered

    private void itemInicioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemInicioMouseExited
        itemInicio.setOpaque(false);
        itemInicio.setBackground(new Color(50,55,61));
    }//GEN-LAST:event_itemInicioMouseExited

    private void itemListaUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemListaUsuariosMouseClicked
        jPanel3.removeAll();
        jPanel3.add(consultaPanel);
        if(configPanel.itemDarkMode.isSelected()){
            consultaPanel.darkMode();
        }
        else{
            consultaPanel.lightMode();
        }

    }//GEN-LAST:event_itemListaUsuariosMouseClicked

    private void itemListaUsuariosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemListaUsuariosMouseEntered
        itemListaUsuarios.setOpaque(true);
        itemListaUsuarios.setBackground(new Color(2, 143, 224));
    }//GEN-LAST:event_itemListaUsuariosMouseEntered

    private void itemListaUsuariosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemListaUsuariosMouseExited
        itemListaUsuarios.setOpaque(false);
        itemListaUsuarios.setBackground(new Color(50,55,61));
    }//GEN-LAST:event_itemListaUsuariosMouseExited

    private void itemRegistrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemRegistrarMouseClicked
        jPanel3.removeAll();
        
        
        if(usuario.getIdRol() == 1){
            jPanel3.add(registerPanel);
        }
        else if(usuario.getIdRol() == 3)
        {
         jPanel3.add(registerPanelCliente);
        }
        if(configPanel.itemDarkMode.isSelected()){
            registerPanel.darkMode();
        }
        else{
            registerPanel.lightMode();
        }
    }//GEN-LAST:event_itemRegistrarMouseClicked

    private void itemRegistrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemRegistrarMouseEntered
        itemRegistrar.setOpaque(true);
        itemRegistrar.setBackground(new Color(2, 143, 224));
    }//GEN-LAST:event_itemRegistrarMouseEntered

    private void itemRegistrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemRegistrarMouseExited
        itemRegistrar.setOpaque(false);
        itemRegistrar.setBackground(new Color(50,55,61));
    }//GEN-LAST:event_itemRegistrarMouseExited

    private void itemSubestacionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemSubestacionesMouseClicked
        jPanel3.removeAll();
        jPanel3.add(subestacionPanel);
        if(configPanel.itemDarkMode.isSelected()){
            subestacionPanel.darkMode();
        }
        else{
            subestacionPanel.lightMode();
        }
    }//GEN-LAST:event_itemSubestacionesMouseClicked

    private void itemSubestacionesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemSubestacionesMouseEntered
        itemSubestaciones.setOpaque(true);
        itemSubestaciones.setBackground(Color.ORANGE);
    }//GEN-LAST:event_itemSubestacionesMouseEntered

    private void itemSubestacionesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemSubestacionesMouseExited
        itemSubestaciones.setOpaque(false);
        itemSubestaciones.setBackground(new Color(50,55,61));
    }//GEN-LAST:event_itemSubestacionesMouseExited

    private void itemConfigurarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemConfigurarMouseClicked

        jPanel3.removeAll();
        jPanel3.add(configPanel);
        jPanel3.revalidate();
        jPanel3.repaint();
//        FlatDarkLaf.install();
//        this.revalidate();
//
//         this.repaint();
//         FlatLaf.updateUI();

    }//GEN-LAST:event_itemConfigurarMouseClicked

    private void itemConfigurarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemConfigurarMouseEntered
        itemConfigurar.setOpaque(true);
        itemConfigurar.setBackground(Color.RED);
    }//GEN-LAST:event_itemConfigurarMouseEntered

    private void itemConfigurarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemConfigurarMouseExited
        itemConfigurar.setOpaque(false);
        itemConfigurar.setBackground(new Color(50,55,61));
    }//GEN-LAST:event_itemConfigurarMouseExited

    private void itemTitle6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemTitle6MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_itemTitle6MouseClicked

    private void itemTitle6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemTitle6MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_itemTitle6MouseEntered

    private void itemTitle6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemTitle6MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_itemTitle6MouseExited

    private void itemPagosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemPagosMouseClicked
        jPanel3.removeAll();
        jPanel3.add(registerPayPanel);
        if(configPanel.itemDarkMode.isSelected()){
            registerPayPanel.darkMode();
        }
        else{
            registerPayPanel.lightMode();
        }
    }//GEN-LAST:event_itemPagosMouseClicked

    private void itemPagosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemPagosMouseEntered
    	itemPagos.setOpaque(true);
        itemPagos.setBackground(new Color(2, 143, 224));
    }//GEN-LAST:event_itemPagosMouseEntered

    private void itemPagosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemPagosMouseExited
    	itemPagos.setOpaque(false);
        itemPagos.setBackground(new Color(50,55,61));
    }//GEN-LAST:event_itemPagosMouseExited

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel itemConfigurar;
    private javax.swing.JPanel itemInicio;
    private javax.swing.JPanel itemListaUsuarios;
    private javax.swing.JPanel itemPagos;
    private javax.swing.JPanel itemRegistrar;
    private javax.swing.JPanel itemSubestaciones;
    private javax.swing.JLabel itemTitle1;
    private javax.swing.JLabel itemTitle2;
    private javax.swing.JLabel itemTitle3;
    private javax.swing.JLabel itemTitle4;
    private javax.swing.JLabel itemTitle5;
    private javax.swing.JLabel itemTitle6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel jUsername;
    private javax.swing.JPanel panelLateral;
    private javax.swing.JPanel panelLogOut;
    private javax.swing.JPanel panelMenu;
    private javax.swing.JPanel panelPerfil;
    private javax.swing.JLabel usernameLabel;
    // End of variables declaration//GEN-END:variables
}
