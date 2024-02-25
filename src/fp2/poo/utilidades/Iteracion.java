/*
 *  @(#)Iteracion.java
 *
 *  Fundamentos de Programacion II. GITT.
 *  Departamento de Ingenieria Telematica
 *  Universidad de Sevilla
 *  
 */


package fp2.poo.utilidades;

import  fp2.poo.utilidades.Excepciones.OperacionNoPermitidaExcepcion;
import  fp2.poo.utilidades.ContactoInterfaz;

/**
 * Descripcion: Esta interfaz proporciona dos metodos para
 *              obtener todas las CuentasBancarias.
 *
 *              
 * @version version 1.0 Mayo 2012
 * @author  Fundamentos de Programacion II
 */
public interface Iteracion {

    /*
     *  Este metodo devuelve una cuenta bancaria.          
     */
    public ContactoInterfaz siguienteContacto( ) throws OperacionNoPermitidaExcepcion;

    /*
     *  Este metodo indica si hay otra objeto Cuenta.
     *
     *  @return    Devuelve un valor del tipo boolean que indica
     *             si hay mas objetos del tipo Cuenta.
     */
    public boolean haySiguienteContacto();
}
