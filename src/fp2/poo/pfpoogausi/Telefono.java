package fp2.poo.pfpooXXX;

import fp2.poo.utilidades.*;
import fp2.poo.utilidades.Excepciones.TelefonoIncorrectoExcepcion;

public class Telefono implements TelefonoInterfaz{
	public String NumeroDeTelefono;

	public Telefono(String numero)throws TelefonoIncorrectoExcepcion{
		if(numero.length()!= 9){
			throw new TelefonoIncorrectoExcepcion("El telefono no tiene 9 digitos");
		}	
		else{
			char cadena[]= new char[numero.length()];
			int i = 0;
			int bandera = 0;
			numero.getChars(0, numero.length()-1, cadena, 0);//Esto es para que se me llene la cadena strcpy
			
			for(i = 0; i<numero.length(); i++){
				if(cadena[i]>= '0' && cadena[i]<= '9')
					bandera++;
			}
		if(bandera != 8){
			throw new TelefonoIncorrectoExcepcion("El telefono debe contener solo numeros");		
		}
		else{
			this.NumeroDeTelefono = numero;
		}	
		}
	}
	public String getTelefono(){ 
		return this.NumeroDeTelefono; 
		} 

	public void setTelefono( String numeroDetelefono ) throws TelefonoIncorrectoExcepcion{
		if(numeroDetelefono.length()!= 9){
			throw new TelefonoIncorrectoExcepcion("El telefono no tiene 9 digitos");
		}	
		else{
			char cadena[]= new char[numeroDetelefono.length()];
			int i = 0;
			int bandera = 0;
			numeroDetelefono.getChars(0, numeroDetelefono.length()+1, cadena, 0);//Esto es para que se me llene la cadena strcpy
			
			for(i = 0; i<numeroDetelefono.length(); i++){
				if(cadena[i]>= '0' && cadena[i]<= '9')
					bandera++;
			}
		if(bandera != 8){
			throw new TelefonoIncorrectoExcepcion("El telefono debe contener solo numeros");		
		}
		else{
			this.NumeroDeTelefono = numeroDetelefono;
		}	
		}
	}	
}
