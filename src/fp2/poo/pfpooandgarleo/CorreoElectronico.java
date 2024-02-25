/**
*	email.java
* 
* 	@autor: Andres Garcia-Baquero Leon
* 	@since: Mayo 2012
* 
*	Clase Correo Electronico
* 
* 	Esta clase tiene un String para el email, el contructor lo rellena comprobando si hay mas de una arroba
* 	Si no salta la excepcion 
* 	Contiene los metodos get y set 
*  
*
*
*/



package fp2.poo.pfpooandgarleo;
import fp2.poo.utilidades.Excepciones.CorreoElectronicoIncorrectoExcepcion;
import fp2.poo.utilidades.CorreoElectronicoInterfaz;


public class CorreoElectronico implements CorreoElectronicoInterfaz{
		
		String email;
	public CorreoElectronico (String correo) throws CorreoElectronicoIncorrectoExcepcion{
		char cad[]= new char[correo.length()];
		int i,cont;
		correo.getChars(0,correo.length()-1,cad,0);
		for(i=0,cont=0;i<correo.length();i++)
		{
		if(cad[i]=='@')cont++;
		}
		if(cont!=1)
		throw new CorreoElectronicoIncorrectoExcepcion("El correo electronico contiene mas de una arroba");
		
		
		this.email=correo;
		}
	public void setCorreoElectronico(String correo)throws CorreoElectronicoIncorrectoExcepcion{
		char cad[]= new char[correo.length()];
		int i,cont;
		correo.getChars(0,correo.length()-1,cad,0);
		for(i=0,cont=0;i<correo.length();i++)
		{
		if(cad[i]=='@')cont++;
		}
		if(cont!=1)
		throw new CorreoElectronicoIncorrectoExcepcion("El correo electronico contiene mas de una arroba");
		
		
		this.email=correo;
		
	}
	public String getCorreoElectronico(){
		
		return this.email;
	}
	
}
