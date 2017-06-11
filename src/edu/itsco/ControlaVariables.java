/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.itsco;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author betom
 */
public class ControlaVariables  {
    private final List<Variable> listaVariables;
    
    public ControlaVariables(){
        listaVariables= new ArrayList<>();
    }
    
    public void agregarVariable(Variable v) throws SemanticException{
    if (listaVariables.contains(v))throw new SemanticException(SemanticException.PorVariables.YAEXISTE,v.getNombre());
    listaVariables.add(v);
    
    }
    
    public void existeVariable(Variable v)throws SemanticException
    {
        if(!listaVariables.contains(v)) throw new SemanticException(SemanticException.PorVariables.NODEFINIDA,v.getNombre());
    }
    
    public List<Variable> getAllVariables(){
    return this.listaVariables;
    }
}
