package fp2.poo.pfpooXXX;

import fp2.poo.utilidades.PersonaInterfaz;

public class Persona implements PersonaInterfaz{ //LA RUTA O NO
	
	String Nombre;   //This donde sea se refiere a este 
	String PrimerApellido;
	String SegundoApellido;
	
	public Persona(String a, String b, String c){
		Nombre = a;
		PrimerApellido = b;
		SegundoApellido = c;
		}

	public String getNombre(){      //Acceden a ese  nombre desde otra clase
		return Nombre;		
	}
	public String getPrimerApellido(){
		return PrimerApellido;
	}
	public String getSegundoApellido(){
		return SegundoApellido;
	}
	
	public void setNombre(String nombre){    //Meten ese nombre en otra clase osea en la clase nombre
		this.Nombre = nombre;
	}
	public void setPrimerApellido(String primerApellido){
		this.PrimerApellido = primerApellido;
	}
	public void setSegundoApellido(String segundoApellido){
		this.SegundoApellido = segundoApellido;
	}
}
