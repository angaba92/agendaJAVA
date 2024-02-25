/**
*	domicilio.java
*	@autor: Andres Garcia-Baquero Leon
* 	@since: Mayo 2012
* 
* 	Clase Domicilio
* 
* 	Esta clase tiene un String para el domicilio y el constructor lo rellena
* 	Contiene los metodos get y set 
*  
*
*
*/

package fp2.poo.pfpooandgarleo;

import fp2.poo.utilidades.DomicilioInterfaz;


public class Domicilio implements DomicilioInterfaz{
	
	String Domicilio;
	public Domicilio(String Domicilio){
		this.Domicilio=Domicilio;
		
	}
	
	public void setDomicilio(String n){
	this.Domicilio=n;
	}
	public String getDomicilio(){
	return Domicilio;	
	}	
	
	
	
}
