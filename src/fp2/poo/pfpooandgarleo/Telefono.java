/**
*
*	Clase Telefono
* 
* 	Esta clase tiene un String que el constructor rellena con el numero de telefono.
* 	Comprueba si la longitud es 9 digitos y si contiene solo numeros, si no salta la excepcion 
* 	Contiene los metodos get y set 
*  
*
*
*/


package fp2.poo.pfpooandgarleo;
import fp2.poo.utilidades.Excepciones.TelefonoIncorrectoExcepcion;
import fp2.poo.utilidades.TelefonoInterfaz;

public class Telefono implements TelefonoInterfaz{
	String Telefono;
	
	public Telefono(String Telefono)throws TelefonoIncorrectoExcepcion{

	if(Telefono.length()!=9)
	throw new TelefonoIncorrectoExcepcion("El telefono no tiene el formato estandar de 9 digitos");
	
	else
	{
	char cad[]=new char[Telefono.length()];
		int i,cont;
		Telefono.getChars(0,Telefono.length()-1,cad,0);
		for(i=0,cont=0;i<Telefono.length();i++)
		{
		if(cad[i]>='0'&& cad[i]<='9')cont++;
		}	
	if(cont!=8)
	throw new TelefonoIncorrectoExcepcion("El telefono no contiene elementos numericos en su totalidad");
	
	else
	this.Telefono=Telefono;
	}
}
	public String getTelefono(){
	return this.Telefono;
	} 
	
	public void setTelefono(String NumeroDeTelefono)throws TelefonoIncorrectoExcepcion{
	if(Telefono.length()!=9)
	throw new TelefonoIncorrectoExcepcion("El telefono no tiene el formato estandar de 9 digitos");
	
	else
	{
	char cad[]=new char[Telefono.length()];
		int i,cont;
		Telefono.getChars(0,Telefono.length()-1,cad,0);
		for(i=0,cont=0;i<Telefono.length();i++)
		{
		if(cad[i]>='0'&& cad[i]<='9')cont++;
		}	
	if(cont!=8)
	throw new TelefonoIncorrectoExcepcion("El telefono no contiene elementos numericos en su totalidad");
	
	else
	this.Telefono=NumeroDeTelefono;
	}
}
	

}

