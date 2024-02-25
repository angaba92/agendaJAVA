/**
*
*	Clase Contacto
* 
* 	Esta clase tiene String para el nombre completo que el constructor rellena 
* 	Contiene los metodos get y set 
*  
*
*
*/

package fp2.poo.pfpooandgarleo;

import fp2.poo.utilidades.PersonaInterfaz;

public class Persona implements PersonaInterfaz{
	
	String Nombre;
	String PrimerApellido;
	String SegundoApellido;
	
	public Persona(String n, String p, String s){
		this.Nombre=n;
		PrimerApellido=p;
		SegundoApellido=s;
		}
	public void setNombre(String n){
	Nombre=n;
	}
	public void setPrimerApellido(String n){
	PrimerApellido=n;
	}
	public void setSegundoApellido(String n){
	SegundoApellido=n;
	}
	public String getNombre(){
	return Nombre;	
	}	
	public String getPrimerApellido(){
	return PrimerApellido;	
	}
	public String getSegundoApellido(){
	return SegundoApellido;	
	}



}
