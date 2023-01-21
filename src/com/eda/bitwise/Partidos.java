/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eda.bitwise;

import javax.swing.JOptionPane;

public class Partidos {

    public Partido primero;
    public int cantidad;

    public Partidos() {
        primero = null;
        cantidad = 0;
    }

    public boolean vacia() {
        return primero == null;
    }

    public Partido crearPartido(String equipo1, String equipo2, String fecha, Partido p) {
        Partido q = new Partido(equipo1, equipo2, fecha, p);
        return q;
    }

    public void insertar(String equipo1, String equipo2, String fecha) {
        if (vacia()) {
            Partido q = crearPartido(equipo1, equipo2, fecha, primero);
            primero = q;
            cantidad++;
        } else {
            Partido p = primero;
            while (p.getProx() != null) {
                p = p.getProx();
            }

            Partido q = crearPartido(equipo1, equipo2, fecha, null);
            p.setProx(q);
            cantidad++;
        }
    }

    public void eliminar(int pos) {
        if (pos >= 1 && pos <= cantidad) {
            int k = 1;
            Partido ap = null, p = primero;
            while (k < pos && p != null) {
                ap = p;
                p = p.getProx();
                k = k + 1;
            }
            if (p == null) {
                return;
            }

            if (ap == null) {
                primero = p.getProx();
            } else {
                ap.setProx(p.getProx());
            }

            cantidad--;
        } else {
            JOptionPane.showMessageDialog(null, "Fuera de posición..!!");
        }
    }

}
