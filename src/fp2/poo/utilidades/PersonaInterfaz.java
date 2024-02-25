/*
 *  @(#)PersonaInterfaz.java
 *
 *  Fundamentos de Programacion II. GITT.
 *  Departamento de Ingenieria Telematica
 *  Universidad de Sevilla
 *  
 */

package fp2.poo.utilidades;

/**
 * Descripcion: Esta es una clase que representa una persona 
 *              asociada a un contacto de agenda.
 *
 * @version version 1.0 Abril 2012
 * @author  Fundamentos de Programacion II
 */
public interface PersonaInterfaz {

    /*
     *  Metodo de configuracion del atributo nombre.          
     */
    public void setNombre( String nombre );

    /*
     *  Metodo de obtencion del nombre.          
     */
    public String getNombre( );


    /*
     *  Metodo de configuracion del atributo 
     *  relacionado con el primer apellido.          
     */
    public void setPrimerApellido( String primerApellido);

    /*
     *  Metodo de obtencion del primer apellido.          
     */
    public String getPrimerApellido( );

    /*
     *  Metodo de configuracion del atributo 
     *  relacionado con el segundo apellido.          
     */
    public void setSegundoApellido( String segundoApellido);

    /*
     *  Metodo de obtencion del segundo apellido.          
     */
    public String getSegundoApellido( );

}
