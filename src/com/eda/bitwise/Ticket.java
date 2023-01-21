package com.eda.bitwise;

public class Ticket {
    public int sector;
    public int asiento;
    public boolean comprado;
    public int ct;  // cambas asociados inc.
    public Ticket prox;

    public Ticket(int sector, int asiento, boolean comprado, int ct) {
        this.sector = sector;
        this.asiento = asiento;
        this.comprado = comprado;
        this.ct = ct;
    }

    public Ticket() {
    }

    public Ticket(int sector, int asiento, boolean comprado, int ci, Ticket prox) {
        this.sector = sector;
        this.asiento = asiento;
        this.comprado = comprado;
        this.ct = ci;
        this.prox = prox;
    }

    public Ticket getProx() {
        return prox;
    }

    public void setProx(Ticket prox) {
        this.prox = prox;
    }    
}
