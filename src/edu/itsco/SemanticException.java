/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.itsco;

/**
 *
 * @author Sergio
 */
public class SemanticException extends Exception{
    
    public enum PorVariables{
    YAEXISTE,NODEFINIDA,TIPODATO,YAEXISTEMETODO,NUMARGERRONEO,METODONODECLARADO
    }
    public SemanticException(PorVariables causa,String nombre)
    {
    super(inicializador(causa,nombre));
    }
    
    private static String inicializador(PorVariables causa,String nombre){
    
        String message=null;
        switch(causa){
            case YAEXISTE:
                message="La variable "+nombre+" ya fue declarada";
            break;
            case NODEFINIDA:
                message="La variable "+nombre+" no ha sido declarada";
            break;
            case YAEXISTEMETODO:
                message="El metodo "+nombre+" ya fue declarado";
            break;
        }
        return message;
    }
}
