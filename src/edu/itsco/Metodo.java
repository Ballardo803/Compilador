/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.itsco;

/**
 *
 * @author betom
 */
public class Metodo {
    private String nombre;
    private int noArgumentos;
    private String tipoRetorno;
    private ControlaVariables Variables;

    public void agregarVariable(Variable v){}
    
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the noArgumentos
     */
    public int getNoArgumentos() {
        return noArgumentos;
    }

    /**
     * @param noArgumentos the noArgumentos to set
     */
    public void setNoArgumentos(int noArgumentos) {
        this.noArgumentos = noArgumentos;
    }

    /**
     * @return the tipoRetorno
     */
    public String getTipoRetorno() {
        return tipoRetorno;
    }

    /**
     * @param tipoRetorno the tipoRetorno to set
     */
    public void setTipoRetorno(String tipoRetorno) {
        this.tipoRetorno = tipoRetorno;
    }

    /**
     * @return the Variables
     */
    public ControlaVariables getVariables() {
        return Variables;
    }

    /**
     * @param Variables the Variables to set
     */
    public void setVariables(ControlaVariables Variables) {
        this.Variables = Variables;
    }
}
