/**
*	agenda.java
*	
*	@autor: Andres Garcia-Baquero Leon
* 	@since: Mayo 2012
* 
* 	Programa en java que implementa el funcionamiento de una agenda.
* 	Los atributos que utiliza son contactos, los cuales estan formados por:
* 	-domicilio
* 	-email	
* 	-nombre y apellidos
* 	-telefono
* 
*/



package fp2.poo.pfpooandgarleo;
import fp2.poo.utilidades.TelefonoInterfaz;
import fp2.poo.utilidades.ContactoInterfaz;
import fp2.poo.utilidades.Excepciones.OperacionNoPermitidaExcepcion;
import fp2.poo.utilidades.AgendaInterfaz;
import fp2.poo.utilidades.DatosDeEntrada;
import fp2.poo.utilidades.Excepciones.TelefonoIncorrectoExcepcion;

public class Agenda implements AgendaInterfaz{



	private ContactoInterfaz matriz [] = null;
	private int numeroContactosUsados= 0;
/**
* Maximo numero de contactos que puede incluir la agenda.
*/
	public final static int MAX_NUM_CONTACTOS = 1000;
	
	public Agenda ( String archivo ) throws OperacionNoPermitidaExcepcion {
	
	this.matriz = new ContactoInterfaz[MAX_NUM_CONTACTOS];
	DatosDeEntrada obj = null;
	
	try {
	obj = new DatosDeEntrada( archivo );
	while(obj.haySiguienteContacto()) {
	ContactoInterfaz contacto = obj.siguienteContacto();
	this.insertarContacto ( contacto );
		}
		}catch (OperacionNoPermitidaExcepcion e) {
		throw e;
		}
	}
	public void insertarContacto(ContactoInterfaz contacto) throws OperacionNoPermitidaExcepcion{
		
		int i=0;
		
		if(numeroContactosUsados>=MAX_NUM_CONTACTOS)throw new OperacionNoPermitidaExcepcion("La lista maxima de la agenda esta llena");
		
		else
		{
			for(i=0;i<numeroContactosUsados;i++)
			{
				if(matriz[i].getTelefono().getTelefono().equals(contacto.getTelefono().getTelefono())==true)
				throw new OperacionNoPermitidaExcepcion("El numero de este contacto ya existe");
				
			}
		
		
		
			this.matriz[numeroContactosUsados]=contacto;
			numeroContactosUsados++;
			
		}
			
	}
	public void modificarTelefono(TelefonoInterfaz telefonoAntiguo, TelefonoInterfaz telefonoNuevo)throws OperacionNoPermitidaExcepcion{
		
	int i,flag=0;
	try{
		for(i=0;i<numeroContactosUsados && flag==0;i++)
			{
				if(matriz[i].getTelefono().getTelefono().equals(telefonoAntiguo.getTelefono())==true)
				{
					flag=1;
					matriz[i].getTelefono().setTelefono(telefonoNuevo.getTelefono());
					
				}
				
			}
		if(flag==0)
		throw new OperacionNoPermitidaExcepcion("El numero de este contacto ya existe");
		}catch (TelefonoIncorrectoExcepcion  e) {
            System.err.println(e);
        }
	}
	
	public void eliminarContacto(TelefonoInterfaz telefono)throws  OperacionNoPermitidaExcepcion{
		
		
		int i,j,flag=0;
	
		for(i=0;i<numeroContactosUsados && flag==0;i++)
			{
				if(matriz[i].getTelefono().getTelefono().equals(telefono.getTelefono())==true)
				{
					flag=1;
					for(j=i;j<numeroContactosUsados-1;j++)
					{
					matriz[j]=matriz[j+1];
					
					}
				numeroContactosUsados--;
					
				}
				
			}
		if(flag==0)
		throw new OperacionNoPermitidaExcepcion("El numero de este contacto no existe");
		
		
	}
	public void mostrarContactos(){
		int i;
		
		for(i=0;i<numeroContactosUsados;i++)
		{
			System.out.println("Numero de telefono: "+matriz[i].getTelefono().getTelefono());
			System.out.println("Nombre: "+matriz[i].getPersona().getNombre());
			System.out.println("Primer Apellido: "+matriz[i].getPersona().getPrimerApellido());
			System.out.println("Primer Apellido: "+matriz[i].getPersona().getSegundoApellido());
			System.out.println("Domicilio: "+matriz[i].getDomicilio().getDomicilio());
			System.out.println("Correo Electronico: "+matriz[i].getCorreoElectronico().getCorreoElectronico());
			System.out.println("----------------------------------------------------------");
		}
	
}

}
