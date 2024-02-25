/*
 *  @(#)TelefonoInterfaz .java
 *
 *  Fundamentos de Programacion II. GITT.
 *  Departamento de Ingenieria Telematica
 *  Universidad de Sevilla
 *  
 */

package fp2.poo.utilidades;

import  fp2.poo.utilidades.Excepciones.TelefonoIncorrectoExcepcion;

/**
 * 
 * Esta interfaz proporciona los metodos para el manejo del 
 * telefono. Una clase que la implemente mantendrá
 * al menos un objeto de tipo String.
 * Se comprueba que la longitud es de 9 digitos decimales. 
 * Si al configurar o construir un objeto de esta clase no se 
 * ajusta al formato, se debe lanzar la excepcion 
 * TelefonoIncorrectoExcepcion.
 *
 * @version version 1.0 Abril 2012
 * @author  Fundamentos de Programacion II
 */
public interface TelefonoInterfaz {

    /**
     * Devuelve el numero de telefono como String.
     */
    public String getTelefono();

    /**
     * Configura el numero de telefono.
     */
    public void setTelefono( String numeroDetelefono ) 
                                throws TelefonoIncorrectoExcepcion;
}
