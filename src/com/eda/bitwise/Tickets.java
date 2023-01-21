package com.eda.bitwise;

import javax.swing.JOptionPane;

public class Tickets {

    public Ticket primero;
    public int cantidad;

    public Tickets() {
        primero = null;
        cantidad = 0;
    }

    public boolean vacia() {
        return primero == null;
    }

    public Ticket crearTicket(int sector, int asiento, boolean comprado, int ci, Ticket p) {
        return new Ticket(sector, asiento, comprado, ci, p);
    }

    public void insertar(int sector, int asiento, boolean comprado, int ci) {
        if (vacia()) {
            Ticket q = crearTicket(sector, asiento, comprado, ci, primero);
            primero = q;
            cantidad++;
        } else {
            Ticket p = primero;
            while (p.getProx() != null) {
                p = p.getProx();
            }

            Ticket q = crearTicket(sector, asiento, comprado, ci, null);
            p.setProx(q);
            cantidad++;
        }
    }

    public void eliminar(int pos) {
        if (pos >= 1 && pos <= cantidad) {
            int k = 1;
            Ticket ap = null, p = primero;
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
