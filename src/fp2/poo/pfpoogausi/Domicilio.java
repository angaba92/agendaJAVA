package fp2.poo.pfpooXXX;

import fp2.poo.utilidades.*;//O pongo el nombre tmb domicilioInterfaz

public class Domicilio implements DomicilioInterfaz{

	String Domicilio;
	
	public Domicilio(String a){
		Domicilio = a;
	}
	
	public void setDomicilio(String domicilio){
		this.Domicilio = domicilio;
	}
	public String getDomicilio(){
		return Domicilio;
	}
}
