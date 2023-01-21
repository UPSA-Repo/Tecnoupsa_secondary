/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.eda.bitwise;

public class Partido {
    public String equipo1;
    public String equipo2;
    public String fecha;
    public Partido prox;

    public Partido() {
        equipo1 = "";
        equipo2 = "";
        fecha = "";
        prox = null;
    }

    public Partido(String equipo1, String equipo2, String fecha) {
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
        this.fecha = fecha;
    }
    
    public Partido(String equipo1, String equipo2, String fecha, Partido prox) {
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
        this.fecha = fecha;
        this.prox = prox;
    }

    public Partido getProx() {
        return prox;
    }

    public void setProx(Partido prox) {
        this.prox = prox;
    }
    
    

    

}
