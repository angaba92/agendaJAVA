package fp2.poo.pfpooXXX;

import fp2.poo.utilidades.PersonaInterfaz;
import fp2.poo.utilidades.TelefonoInterfaz;
import fp2.poo.utilidades.CorreoElectronicoInterfaz;
import fp2.poo.utilidades.ContactoInterfaz;
import fp2.poo.utilidades.DomicilioInterfaz;


public class Contacto implements ContactoInterfaz{ //Estructura donde voy a tener todas las cosas de un contacto
	PersonaInterfaz  Persona;
	TelefonoInterfaz Telefono;
	CorreoElectronicoInterfaz Email;
	DomicilioInterfaz Domicilio;
	
	public Contacto( TelefonoInterfaz Telefono, PersonaInterfaz Persona, DomicilioInterfaz Domicilio, CorreoElectronicoInterfaz Email){
	this.Persona = Persona;
	this.Telefono = Telefono;
	this.Email = Email;
	this.Domicilio = Domicilio;
	}
	
	public void setTelefono(TelefonoInterfaz telefono){
		this.Telefono = telefono;
	}
    public TelefonoInterfaz getTelefono(){
    	return Telefono;
    }
    public void setPersona(PersonaInterfaz persona){
    	this.Persona = persona;
    }
    public PersonaInterfaz getPersona(){
    	return Persona;
    }
    public void setDomicilio(DomicilioInterfaz domicilio){
    	this.Domicilio = domicilio;
    }
    public DomicilioInterfaz getDomicilio(){
    	return Domicilio;    	
    }
    public void setCorreoElectronico(CorreoElectronicoInterfaz eMail){
    	this.Email = eMail;
    }
    public CorreoElectronicoInterfaz getCorreoElectronico(){
    	return Email;
    }
	
}
