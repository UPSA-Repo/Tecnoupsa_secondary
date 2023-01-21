/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eda.bitwise;

import javax.swing.JOptionPane;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class frmPartidos extends javax.swing.JFrame {

    Partidos partidos;
    String[] partidoActual;
    
    public frmPartidos(String[] str) {
        initComponents();
        this.setLocationRelativeTo(null);
        partidos = new Partidos();
        partidoActual = str;
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
        jPanel1 = new javax.swing.JPanel();
        jlabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtaPartidos = new javax.swing.JTextArea();
        jbtnEliminar = new javax.swing.JButton();
        jbtnAgregar = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jbtnSiguiente = new javax.swing.JButton();
        jlbJugando = new javax.swing.JLabel();

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CREAR ESTADIO");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(32, 66, 107));

        jlabel1.setBackground(new java.awt.Color(255, 255, 255));
        jlabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jlabel1.setForeground(new java.awt.Color(255, 255, 255));
        jlabel1.setText("PARTIDOS");

        jtaPartidos.setColumns(20);
        jtaPartidos.setRows(5);
        jScrollPane1.setViewportView(jtaPartidos);

        jbtnEliminar.setText("Eliminar");
        jbtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEliminarActionPerformed(evt);
            }
        });

        jbtnAgregar.setText("Agregar");
        jbtnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAgregarActionPerformed(evt);
            }
        });

        jButton3.setText("Volver");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jbtnSiguiente.setText("Comenzar Partido");
        jbtnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSiguienteActionPerformed(evt);
            }
        });

        jlbJugando.setForeground(new java.awt.Color(255, 255, 255));
        jlbJugando.setText("Jugando:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbtnEliminar)
                            .addComponent(jbtnAgregar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbtnSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jlbJugando)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jlabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                        .addComponent(jButton3)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jlabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(jlbJugando)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jbtnAgregar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                        .addComponent(jbtnEliminar))
                    .addComponent(jbtnSiguiente, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE))
                .addContainerGap())
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
        Partido p = partidos.primero;
        int cont = 1;
        jtaPartidos.setText("Siguientes partidos programados \n");
        while(p != null) {
            jtaPartidos.append(cont + ". " + p.equipo1 + " vs " + p.equipo2 + " " + p.fecha + "\n");
            cont++;
            p = p.getProx();
        }
    }
    
    
    private void jbtnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAgregarActionPerformed
        // TODO add your handling code here:
        String eq1 = JOptionPane.showInputDialog("Ingresar Equipo 1: ");
        String eq2 = JOptionPane.showInputDialog("Ingresar Equipo 2: ");
        String fecha = JOptionPane.showInputDialog("Ingresar fecha y hora del partido");
        partidos.insertar(eq1, eq2, fecha);
        mostrar();
    }//GEN-LAST:event_jbtnAgregarActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        this.hide();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jbtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEliminarActionPerformed
        // TODO add your handling code here:
        if(partidos.vacia()){
            JOptionPane.showMessageDialog(null, "No existen partidos registrados");
            return;
        }
        int pos = Integer.parseInt(JOptionPane.showInputDialog("Ingresar el numero del partido a eliminar: "));
        partidos.eliminar(pos);
        mostrar();
    }//GEN-LAST:event_jbtnEliminarActionPerformed

    private void jbtnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSiguienteActionPerformed
        // TODO add your handling code here:
        if (partidos.primero != null) {
            partidoActual[0] = "Jugando: " + partidos.primero.equipo1 + " vs " + partidos.primero.equipo2;
            jlbJugando.setText(partidoActual[0]);
            partidos.eliminar(1);
            mostrar();
            jbtnSiguiente.setText("Siguiente Partido");
        } else 
            JOptionPane.showMessageDialog(rootPane, "No hay partidos programados");
        
    }//GEN-LAST:event_jbtnSiguienteActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        String [] p = {};
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPartidos(p).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtnAgregar;
    private javax.swing.JButton jbtnEliminar;
    private javax.swing.JButton jbtnSiguiente;
    private javax.swing.JLabel jlabel1;
    private javax.swing.JLabel jlbJugando;
    private javax.swing.JTextArea jtaPartidos;
    // End of variables declaration//GEN-END:variables
}