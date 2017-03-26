public class Fechatest{
	public static void main(String args[]){
   
    Fecha fecha01 = new Fecha();
	System.out.println("Fecha\n");

	int ret_fecha[] = new int[3];
	fecha01.asignarFecha(6,7,1990);
	fecha01.obtenerFecha(ret_fecha);

	Fecha fecha_raul = new Fecha();
	int ret_fecha_raul[] = new int[3];
	fecha_raul.asignarFecha();
	fecha_raul.obtenerFecha(ret_fecha_raul);

	Fecha.dmaFecha(ret_fecha);
	Fecha.dmaFecha(ret_fecha_raul);

	

	

	}
}