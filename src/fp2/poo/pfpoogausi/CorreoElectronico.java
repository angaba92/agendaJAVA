package fp2.poo.pfpooXXX;

import fp2.poo.utilidades.*;
import fp2.poo.utilidades.Excepciones.*;

public class CorreoElectronico implements CorreoElectronicoInterfaz {
	String EmailElectronico;
	
	public CorreoElectronico(String a) throws CorreoElectronicoIncorrectoExcepcion{//es capaz de tirar una excepcion
		char cadena[] = new char[a.length()];
		int bandera = 0;
		int i = 0;
		a.getChars(0, a.length()-1, cadena, 0);//Esto es para que se me llene la cadena strcpy
		
		for(i = 0; i<a.length(); i++){
			if(cadena[i] == '@')
				bandera++;
		}
	if(bandera != 1){
		throw new CorreoElectronicoIncorrectoExcepcion("El Correo electronico es incorrecto");		
	}
		this.EmailElectronico = a;
	
	}
	
	public void setCorreoElectronico( String correoElectronico ) throws CorreoElectronicoIncorrectoExcepcion{
		char cadena[] = new char[correoElectronico.length()];
		int bandera = 0;
		int i = 0;
		correoElectronico.getChars(0, correoElectronico.length()+1, cadena, 0);//Esto es para que se me llene la cadena strcpy
		
		for(i = 0; i<correoElectronico.length(); i++){
			if(cadena[i] == '@')
				bandera++;
		}
	if(bandera != 1){
		throw new CorreoElectronicoIncorrectoExcepcion("El Correo electronico es incorrecto");		
	}
	else
		this.EmailElectronico = correoElectronico;
	
	}
	
	public String getCorreoElectronico(){
		return EmailElectronico;
	}

}
