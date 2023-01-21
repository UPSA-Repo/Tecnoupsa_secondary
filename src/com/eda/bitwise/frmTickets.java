/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eda.bitwise;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class frmTickets extends javax.swing.JFrame {
    
    Tickets ticketsComprados;
    Asientos asientos;
    
    public frmTickets() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
     public frmTickets(Tickets t, Asientos a) {
        initComponents();
        this.setLocationRelativeTo(null);
        ticketsComprados = t;
        asientos = a;
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtaTickets = new javax.swing.JTextArea();
        jbtnDevolver = new javax.swing.JButton();
        jbtnComprar = new javax.swing.JButton();
        jbtnVolver = new javax.swing.JButton();

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CREAR ESTADIO");

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(32, 66, 107));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("COMPRAR TICKET");

        jtaTickets.setColumns(20);
        jtaTickets.setRows(5);
        jScrollPane1.setViewportView(jtaTickets);

        jbtnDevolver.setText("Devolver");
        jbtnDevolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDevolverActionPerformed(evt);
            }
        });

        jbtnComprar.setText("Comprar");
        jbtnComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnComprarActionPerformed(evt);
            }
        });

        jbtnVolver.setText("Volver");
        jbtnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(35, 35, 35)
                .addComponent(jbtnVolver)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jbtnComprar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbtnDevolver, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jbtnVolver)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtnComprar, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                    .addComponent(jbtnDevolver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void mostrar() {
        jtaTickets.setText("Tickets comprados\n");
        jtaTickets.setText("Tickets comprados\n");
        Ticket p = ticketsComprados.primero;
        while (p != null) {
            if(p.comprado) 
                jtaTickets.append("CodAsiento: " + p.sector + "-" + p.asiento + " -> CodTrans:" + p.ct + "\n");
            p = p.getProx();
        }
    }
    
    private void jbtnComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnComprarActionPerformed
        // TODO add your handling code here:
        int t = 0;
        
        while(t < 1 || t > 6){
            t = Integer.parseInt(JOptionPane.showInputDialog("-Sectores del Estadio-\n" +
                                                                  "1. Longside arriba\n" +
                                                                  "2. Longside abajo\n" +
                                                                  "3. Longside premium arriba\n" +
                                                                  "4. Longside premium abajo\n" +
                                                                  "5. Shortside izquierda\n" +
                                                                  "6. Shortside derecha\n" +
                                                                  "Ingrese el numero de la zona que desea comprar:"
            ));
        }
        
        int a = 0;
        int lim = asientos.getCant(t);
        while(a < 1 || a >= lim)
            a = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero del asiento que desea comprar:"));
        
        int ci = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su CI:"));
        
        
        
        ticketsComprados.insertar(t, a, true, ci);
        mostrar();
    }//GEN-LAST:event_jbtnComprarActionPerformed

    private void jbtnDevolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDevolverActionPerformed
        int ct = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su CodTrans:"));
        Ticket p = ticketsComprados.primero;
        boolean devuelto = false;
        while (p != null) {
            if (p.ct == ct) {
                p.comprado = false;
                devuelto = true;
                break;
            }
            p = p.getProx();
        }
        //ticketsComprados.eliminar(pos);
        if(devuelto)
            mostrar();
        else
            JOptionPane.showMessageDialog(null, "Codigo de transaccion incorrecto");
    }//GEN-LAST:event_jbtnDevolverActionPerformed

    private void jbtnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnVolverActionPerformed
        // TODO add your handling code here:
        this.hide();
    }//GEN-LAST:event_jbtnVolverActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmTickets().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtnComprar;
    private javax.swing.JButton jbtnDevolver;
    private javax.swing.JButton jbtnVolver;
    private javax.swing.JTextArea jtaTickets;
    // End of variables declaration//GEN-END:variables
}
