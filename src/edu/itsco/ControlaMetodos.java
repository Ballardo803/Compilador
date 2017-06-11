/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.itsco;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Sergio
 */
public class ControlaMetodos {
    private final List<Metodo> listaMetodos;
    
    public ControlaMetodos(){
        listaMetodos= new ArrayList<>();
    }
    public void agregarMetodos(Metodo m) throws SemanticException{
    if (listaMetodos.contains(m))throw new SemanticException(SemanticException.PorVariables.YAEXISTEMETODO,m.getNombre());
    listaMetodos.add(m);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + Objects.hashCode(this.listaMetodos);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ControlaMetodos other = (ControlaMetodos) obj;
        if (!Objects.equals(this.listaMetodos, other.listaMetodos)) {
            return false;
        }
        return true;
    }

    /**
     * @return the listaMetodos
     */
    public List<Metodo> getListaMetodos() {
        return listaMetodos;
    }
}
