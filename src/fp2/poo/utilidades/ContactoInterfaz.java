/*
 *  @(#)ContactoInterfaz .java
 *
 *  Fundamentos de Programacion II. GITT.
 *  Departamento de Ingenieria Telematica
 *  Universidad de Sevilla
 *  
 */

package fp2.poo.utilidades;
      
import  fp2.poo.utilidades.TelefonoInterfaz;
import  fp2.poo.utilidades.PersonaInterfaz;
import  fp2.poo.utilidades.DomicilioInterfaz;
import  fp2.poo.utilidades.CorreoElectronicoInterfaz;

/**
 * Esta es una clase que representa un contacto de una agenda.
 * Mantiene para el contacto informacion acerca de un numero de telefono, 
 * una persona, un domicilio y un correo electronico.
 *
 * @version version 1.0 Abril 2012
 * @author  Fundamentos de Programacion II
 */
public interface ContactoInterfaz {


    public void                      setTelefono(TelefonoInterfaz telefono);
    public TelefonoInterfaz          getTelefono();

    public void                      setPersona(PersonaInterfaz persona );
    public PersonaInterfaz           getPersona();

    public void                      setDomicilio(DomicilioInterfaz domicilio);
    public DomicilioInterfaz         getDomicilio();
    
    public void                      setCorreoElectronico(CorreoElectronicoInterfaz eMail);
    public CorreoElectronicoInterfaz getCorreoElectronico();
}
