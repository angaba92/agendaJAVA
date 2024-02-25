/*
 *  @(#)DomicilioInterfaz.java
 *
 *  Fundamentos de Programacion II. GITT.
 *  Departamento de Ingenieria Telematica
 *  Universidad de Sevilla
 *  
 */

package fp2.poo.utilidades;

/**
 * Descripcion: Esta es una clase que representa el domicilio 
 *              asociado a un contacto de agenda.
 *
 * @version version 1.0 Abril 2012
 * @author  Fundamentos de Programacion II
 */
public interface DomicilioInterfaz {

    /*
     *  Descripcion: Metodo de configuracion del atributo domicilio.          
     */
    public void  setDomicilio( String domicilio);

    /*
     *  Descripcion: Metodo de obtencion del domicilio.          
     */
    public String getDomicilio( );

}
