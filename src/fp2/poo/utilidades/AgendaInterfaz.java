/*
 *  @(#)AgendaInterfaz.java
 *
 *  Fundamentos de Programacion II. GITT.
 *  Departamento de Ingenieria Telematica
 *  Universidad de Sevilla
 */

package fp2.poo.utilidades;

import fp2.poo.utilidades.ContactoInterfaz;
import fp2.poo.utilidades.TelefonoInterfaz; 
import fp2.poo.utilidades.Excepciones.OperacionNoPermitidaExcepcion;

/**
 * Esta es una clase que representa una agenda de telefonos.
 * Mantiene un conjunto de contactos.
 *
 * @version version 1.0 Abril 2012
 * @author  Fundamentos de Programacion II
 */
public interface AgendaInterfaz {

    /**
     * Maximo numero de contactos que puede incluir la agenda.
     */
    public final static int MAX_NUM_CONTACTOS = 1000;

    /**
     *  Inserta un nuevo contacto, proporcionandolo como parametro.
     *  En el caso de superar el numero maximo de contactos permitidos
     *  o en el caso de que ya exista un contacto con el mismo numero de telefono
     *  se lanzara la excepcion OperacionNoPermitidaExcepcion-
     */
    public void insertarContacto(ContactoInterfaz contacto) throws OperacionNoPermitidaExcepcion;

    /**
     *  Modifica el telefono de un contacto.
     *  Se proporciona como parametro el telefono del contacto a modificar
     *  y el nuevo telefono.
     *  Si el numero de telefono no existe se lanzara la excepcion
     *  OperacionNoPermitidaExcepcion.
     */
    public void modificarTelefono(TelefonoInterfaz telefonoAntiguo, 
                                  TelefonoInterfaz telefonoNuevo) 
            throws OperacionNoPermitidaExcepcion;

    /**
     *  Elimina un contacto de la agenda.
     *  Se proporciona como parametro el numero de telefono del contacto a eliminar
     *  Si el telefono indicado no esta en la agenda
     *   se lanzara la excepcion OperacionNoPermitidaExcepcion.
     */
    public void eliminarContacto(TelefonoInterfaz telefono) 
            throws  OperacionNoPermitidaExcepcion;

    /**
     *  Muestra por la salida estandar (System.out) todos los contactos que hay en la
     *  agenda.
     *  El orden de salida de los datos es el siguiente:
     *  Numero de telefono, Nombre, Primer Apellido, Segundo Apellido, Domicilio y 
     *  Correo electronico.
     *   Cada uno de estos datos debe ir en una l¡nea diferente.
     *   No se inserta  ninguna informacion adicional a la especificada.
     */

    public void mostrarContactos();

}
