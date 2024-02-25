/*
 *  @(#)OperacionNoPermitidaExcepcion.java
 *
 *  Fundamentos de Programacion II. GITT.
 *  Departamento de Ingenieria Telematica
 *  Universidad de Sevilla
 *  
 */

package fp2.poo.utilidades.Excepciones;


/**
 * Esta excepcion se lanza cuando se intenta
 * realizar una operacion incorrecta.
 * En el caso del Iterador para obtener los
 * objetos del tipo contacto, si se inteta obtener
 * un objeto que no existe.
 *                             
 * @version version 1.0 Abril 2012
 * @author  Fundamentos de Programacion II
 */
public class OperacionNoPermitidaExcepcion extends Exception {

    private static final long serialVersionUID = -1L;
    private String s;

    public OperacionNoPermitidaExcepcion( ){
    }

    public   OperacionNoPermitidaExcepcion(String s ){
        this.s = s;
    }

    public String toString(){  return this.s;}}
