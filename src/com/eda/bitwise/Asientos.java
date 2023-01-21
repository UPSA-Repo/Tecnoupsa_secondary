package com.eda.bitwise;

import javax.swing.JOptionPane;

/**
 *
 * @author Joso
 */
public class Asientos {

    // Asientos
    public int cantAs;

    // Longside arriba
    public Bitwise lsAr[];
    public int cantLsAr;  // 1

    // Longside abajo
    public Bitwise lsAb[];
    public int cantLsAb;  // 2

    // Longside premium arriba
    public Bitwise lsPrAr[];
    public int cantLsPrAr;  // 3

    // Longside premium abajo
    public Bitwise lsPrAb[];
    public int cantLsPrAb;  // 4

    // Shortside arriba
    public Bitwise ssIz[];
    public int cantSsIz;  // 5

    // Shortside abajo
    public Bitwise ssDe[];
    public int cantSsDe;  // 6

    // Ctor
    public Asientos(int cantAs) {

        this.cantAs = cantAs;
        this.cantLsAr = (int)(cantAs * 0.2);
        this.cantLsAb = (int)(cantAs * 0.2);
        this.cantLsPrAr = (int)(cantAs * 0.05);
        this.cantLsPrAb = (int)(cantAs * 0.05);;
        this.cantSsIz = (int)(cantAs * 0.25);;
        this.cantSsDe = (int)(cantAs * 0.25);;

        // Define nbw e inicializa para cada seccion
        int nbwLsAr = cantLsAr / 32;
        nbwLsAr = (cantLsAr % 32 != 0) ? nbwLsAr + 1 : nbwLsAr;
        lsAr = new Bitwise[nbwLsAr];
        for (int i = 0; i < nbwLsAr; i++) {
            lsAr[i] = new Bitwise();
        }

        int nbwLsAb = cantLsAb / 32;
        nbwLsAb = (cantLsAb % 32 != 0) ? nbwLsAb + 1 : nbwLsAb;
        lsAb = new Bitwise[nbwLsAb];
        for (int i = 0; i < nbwLsAb; i++) {
            lsAb[i] = new Bitwise();
        }

        int nbwLsPrAr = cantLsPrAr / 32;
        nbwLsPrAr = (cantLsPrAr % 32 != 0) ? nbwLsPrAr + 1 : nbwLsPrAr;
        lsPrAr = new Bitwise[nbwLsPrAr];
        for (int i = 0; i < nbwLsPrAr; i++) {
            lsPrAr[i] = new Bitwise();
        }

        int nbwLsPrAb = cantLsPrAb / 32;
        nbwLsPrAb = (cantLsPrAb % 32 != 0) ? nbwLsPrAb + 1 : nbwLsPrAb;
        lsPrAb = new Bitwise[nbwLsPrAb];
        for (int i = 0; i < nbwLsPrAb; i++) {
            lsPrAb[i] = new Bitwise();
        }

        int nbwSsAr = cantSsIz / 32;
        nbwSsAr = (cantSsIz % 32 != 0) ? nbwSsAr + 1 : nbwSsAr;
        ssIz = new Bitwise[nbwSsAr];
        for (int i = 0; i < nbwSsAr; i++) {
            ssIz[i] = new Bitwise();
        }

        int nbwSsAb = cantSsDe / 32;
        nbwSsAb = (cantSsDe % 32 != 0) ? nbwSsAb + 1 : nbwSsAb;
        ssDe = new Bitwise[nbwSsAb];
        for (int i = 0; i < nbwSsAb; i++) {
            ssDe[i] = new Bitwise();
        }
    }

    public int obtenerNent(int ele) {
        return (ele / 32);
    }

    public int obtenerNbit(int ele) {
        return (ele % 32);
    }

    public void sentar(int ele, int opc) {
        int nEnt = obtenerNent(ele);
        int nBit = obtenerNbit(ele);
        switch (opc) {
            //LsAr
            case 1:
                if (ele >= 0 && ele < cantLsAr) {
                    lsAr[nEnt].encender(nBit);
                } else {
                    JOptionPane.showMessageDialog(null, "Asientos::insertar: Fuera de rango.");
                }
                break;
            //LsAb
            case 2:
                if (ele >= 0 && ele < cantLsAb) {
                    lsAb[nEnt].encender(nBit);
                } else {
                    JOptionPane.showMessageDialog(null, "Asientos::insertar: Fuera de rango.");
                }
                break;
            //LsPrAr
            case 3:
                if (ele >= 0 && ele < cantLsPrAr) {
                    lsPrAr[nEnt].encender(nBit);
                } else {
                    JOptionPane.showMessageDialog(null, "Asientos::insertar: Fuera de rango.");
                }
                break;
            //LsPrAb
            case 4:
                if (ele >= 0 && ele < cantLsPrAb) {
                    lsPrAb[nEnt].encender(nBit);
                } else {
                    JOptionPane.showMessageDialog(null, "Asientos::insertar: Fuera de rango.");
                }
                break;
            //SsaAr
            case 5:
                if (ele >= 0 && ele < cantSsIz) {
                    ssIz[nEnt].encender(nBit);
                } else {
                    JOptionPane.showMessageDialog(null, "Asientos::insertar: Fuera de rango.");
                }
                break;
            //SsAb
            case 6:
                if (ele >= 0 && ele < cantSsDe) {
                    ssDe[nEnt].encender(nBit);
                } else {
                    JOptionPane.showMessageDialog(null, "Asientos::insertar: Fuera de rango.");
                }
                break;
            default:
                JOptionPane.showMessageDialog(null, "Asientos::insertar: Seccion no encontrada");
                break;
        }
    }

    public void levantar(int ele, int opc) {
        int nEnt = obtenerNent(ele);
        int nBit = obtenerNbit(ele);
        switch (opc) {
            //LsAr
            case 1:
                if (ele >= 0 && ele < cantLsAr) {
                    lsAr[nEnt].apagar(nBit);
                } else {
                    JOptionPane.showMessageDialog(null, "Asientos::insertar: Fuera de rango.");
                }
                break;
            //LsAb
            case 2:
                if (ele >= 0 && ele < cantLsAb) {
                    lsAb[nEnt].apagar(nBit);
                } else {
                    JOptionPane.showMessageDialog(null, "Asientos::insertar: Fuera de rango.");
                }
                break;
            //LsPrAr
            case 3:
                if (ele >= 0 && ele < cantLsPrAr) {
                    lsPrAr[nEnt].apagar(nBit);
                } else {
                    JOptionPane.showMessageDialog(null, "Asientos::insertar: Fuera de rango.");
                }
                break;
            //LsPrAb
            case 4:
                if (ele >= 0 && ele < cantLsPrAb) {
                    lsPrAb[nEnt].apagar(nBit);
                } else {
                    JOptionPane.showMessageDialog(null, "Asientos::insertar: Fuera de rango.");
                }
                break;
            //SsaAr
            case 5:
                if (ele >= 0 && ele < cantSsIz) {
                    ssIz[nEnt].apagar(nBit);
                } else {
                    JOptionPane.showMessageDialog(null, "Asientos::insertar: Fuera de rango.");
                }
                break;
            //SsAb
            case 6:
                if (ele >= 0 && ele < cantSsDe) {
                    ssDe[nEnt].apagar(nBit);
                } else {
                    JOptionPane.showMessageDialog(null, "Asientos::insertar: Fuera de rango.");
                }
                break;
            default:
                JOptionPane.showMessageDialog(null, "Asientos::insertar: Seccion no encontrada");
                break;
        }
    }

    public String mostrar(int opc) {
        String s = "";
        int cont = 0;
        String libre = "o ";
        String ocupado = "x ";
        switch (opc) {
            //LsAr
            case 1:
                for (int i = 0; i < cantLsAr; i++) {
                    int nEnt = obtenerNent(i);
                    int nBit = obtenerNbit(i);
                    if (cont == 40) {
                        s = s + "\n";
                        cont = 0;
                    }
                    if(lsAr[nEnt].getBit(nBit) == 0)
                        s += libre;
                    else 
                        s += ocupado;
                    cont++;
                }
                break;
            case 2:
                for (int i = 0; i < cantLsAb; i++) {
                    int nEnt = obtenerNent(i);
                    int nBit = obtenerNbit(i);
                    if (cont == 40) {
                        s = s + "\n";
                        cont = 0;
                    }
                    if(lsAb[nEnt].getBit(nBit) == 0)
                        s += libre;
                    else 
                        s += ocupado;
                    cont++;
                }
                break;
            case 3:
                for (int i = 0; i < cantLsPrAr; i++) {
                    int nEnt = obtenerNent(i);
                    int nBit = obtenerNbit(i);
                    if (cont == 20) {
                        s = s + "\n";
                        cont = 0;
                    }
                    if(lsPrAr[nEnt].getBit(nBit) == 0)
                        s += libre;
                    else 
                        s += ocupado;
                    cont++;
                }
                break;
            case 4:
                for (int i = 0; i < cantLsPrAb; i++) {
                    int nEnt = obtenerNent(i);
                    int nBit = obtenerNbit(i);
                    if (cont == 20) {
                        s = s + "\n";
                        cont = 0;
                    }
                    if(lsPrAb[nEnt].getBit(nBit) == 0)
                        s += libre;
                    else 
                        s += ocupado;
                    cont++;
                }
                break;
             case 5:
                for (int i = 0; i < cantSsIz; i++) {
                    int nEnt = obtenerNent(i);
                    int nBit = obtenerNbit(i);
                    if (cont == 22) {
                        s = s + "\n";
                        cont = 0;
                    }
                    if(ssIz[nEnt].getBit(nBit) == 0)
                        s += libre;
                    else 
                        s += ocupado;
                    cont++;
                }
                break;
            case 6:
                for (int i = 0; i < cantSsDe; i++) {
                    int nEnt = obtenerNent(i);
                    int nBit = obtenerNbit(i);
                    if (cont == 22) {
                        s = s + "\n";
                        cont = 0;
                    }
                    if(ssDe[nEnt].getBit(nBit) == 0)
                        s += libre;
                    else 
                        s += ocupado;
                    cont++;
                }
                break;
        }

        return s;
    }

    public int getCant(int seccion){
        int cant = 0;
        switch(seccion){
            case 1:
                cant = cantLsAr;
                break;
            case 2:
                cant = cantLsAb;
                break;
            case 3:
                cant = cantLsPrAr;
                break;
            case 4:
                cant = cantLsPrAb;
                break;
            case 5:
                cant = cantSsIz;
                break;
            case 6:
                cant = cantSsDe;
                break;
        }
        return cant;
    }
    
}
