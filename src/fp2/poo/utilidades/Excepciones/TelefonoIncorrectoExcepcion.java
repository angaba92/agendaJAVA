/*
 *  @(#)TelefonoIncorrectoExcepcion.java
 *
 *  Fundamentos de Programacion II. GITT.
 *  Departamento de Ingenieria Telematica
 *  Universidad de Sevilla
 *  
 */

package fp2.poo.utilidades.Excepciones;

/**
 * Esta excepcion se lanza cuando se intenta
 * dar un valor al telefono incorrecto.
 * El telefono es correcto cuando tiene 9 digitos decimales.
 *                             
 * @version version 1.0 Abril 2012
 * @author  Fundamentos de Programacion II
 */
public class TelefonoIncorrectoExcepcion extends Exception {

    private static final long serialVersionUID = -1L;
    private String s = null;

    public TelefonoIncorrectoExcepcion( ) {
    }  

    public TelefonoIncorrectoExcepcion( String s ) {
        this.s = s;
    }  

    public String toString(){
        return this.s;
    }
}


