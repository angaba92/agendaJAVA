/*
 *  @(#)CorreoElectronicoInterfaz .java
 *
 *  Fundamentos de Programacion II. GITT.
 *  Departamento de Ingenieria Telematica
 *  Universidad de Sevilla
 *  
 */
 
package fp2.poo.utilidades;

import  fp2.poo.utilidades.Excepciones.CorreoElectronicoIncorrectoExcepcion;

/**
 *
 * La interfaz CorreoElectronico mantiene los metodos 
 * para manejar objetos del tipo CorreoElectronico.
 */
public interface CorreoElectronicoInterfaz {

    /**
     *  Metodo que proporciona un valor 
     *  para configurar  el correo electronico.
     */ 
    public void setCorreoElectronico( String correoElectronico ) 
                throws CorreoElectronicoIncorrectoExcepcion;

    /**
     * Metodo que devuelve como String el correo electronico.
     */
    public String getCorreoElectronico();

}
