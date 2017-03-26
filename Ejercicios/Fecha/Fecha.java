import java.util.*;
public class Fecha{
	private int dia;
	private int mes;
	private int anio;

	public void asignarFecha(int dia_param, int mes_param, int anio_param){
		this.dia = dia_param;
		this.mes = mes_param;
		this.anio = anio_param;
	}

	public void asignarFecha(){
		Calendar current_day = new GregorianCalendar();
		this.dia = current_day.get(Calendar.DAY_OF_MONTH);
		this.mes = current_day.get(Calendar.MONTH) + 1;
		this.anio = current_day.get(Calendar.YEAR);
	}

	public void asignarFecha(int dia_param){
		this.asignarFecha();
		this.dia = dia_param;
	}

	public void obtenerFecha(int[] fecha){
		fecha[0] = this.dia;
		fecha[1] = this.mes;
		fecha[2] = this.anio;

	}

	public static void dmaFecha(int [] fecha){
		System.out.println(fecha[0]+"/"+fecha[1]+"/"+fecha[2]);
	}

	public static void amdFecha(int[] fecha){
		System.out.println(fecha[2]+"/"+fecha[1]+"/"+fecha[0]);
	}
	
}