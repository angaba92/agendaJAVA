/*
 *  @(#)CorreoElectronicoIncorrectoExcepcion.java
 *
 *  Fundamentos de Programacion II. GITT.
 *  Departamento de Ingenieria Telematica
 *  Universidad de Sevilla
 *  
 */

package fp2.poo.utilidades.Excepciones;
        
/**
 * Esta excepcion se lanza cuando se intenta
 * dar un valor al correo electronico incorrecto.
 * El correo electronico es correcto cuando incluye un caracter @ (solo uno).
 *                             
 * @version version 1.0 Abril 2012
 * @author  Fundamentos de Programacion II
 */
public class CorreoElectronicoIncorrectoExcepcion extends Exception{
    private static final long serialVersionUID = -1L;
    private String s = null;

    public CorreoElectronicoIncorrectoExcepcion() {
    }  

    public CorreoElectronicoIncorrectoExcepcion(String s) {
        this.s = s;
    }  

    public String toString() {
        return this.s;
    }
}
