/**
*	contacto.java
* 	@autor: Andres Garcia-Baquero Leon
* 	@since: Mayo 2012
* 	
*	Clase Contacto
* 
* 	Esta clase importa las demas clases para implemetar la Agenda 
* 	Contiene los metodos get y set 
*  
*
*
*/

package fp2.poo.pfpooandgarleo;
import fp2.poo.utilidades.TelefonoInterfaz;
import fp2.poo.utilidades.ContactoInterfaz;
import fp2.poo.utilidades.CorreoElectronicoInterfaz;
import fp2.poo.utilidades.PersonaInterfaz;
import fp2.poo.utilidades.DomicilioInterfaz;


public class Contacto implements ContactoInterfaz{
	
	TelefonoInterfaz Telefono;
	PersonaInterfaz Persona;
	DomicilioInterfaz Domicilio;
	CorreoElectronicoInterfaz Correo;
	
	public Contacto(TelefonoInterfaz t,	PersonaInterfaz p, DomicilioInterfaz d, CorreoElectronicoInterfaz c){
		
		this.Telefono=t;
		this.Persona=p;
		this.Domicilio=d;
		this.Correo=c;	
			
	}
	
	public void setDomicilio(DomicilioInterfaz n){
	this.Domicilio=n;
	}
	public DomicilioInterfaz getDomicilio(){
	return Domicilio;	
	}
	
	public TelefonoInterfaz getTelefono(){
	return this.Telefono;
	} 
	public void setTelefono(TelefonoInterfaz n){
	
	this.Telefono=n;
	}
	public void setPersona(PersonaInterfaz n){
	Persona=n;
	}
	public PersonaInterfaz getPersona(){
	return Persona;	
	}
	
	public CorreoElectronicoInterfaz getCorreoElectronico(){
		
		return this.Correo;
	}
	public void setCorreoElectronico(CorreoElectronicoInterfaz correo){
		
		
		this.Correo=correo;
		
	}
	
	
	
	
}
