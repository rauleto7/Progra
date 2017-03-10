import java.io.*;
public class Practica5{
	public static void main(String[] args) throws IOException {
		System.out.println("Pedir Datos al usuario");
		int i,j, aux = 0;
		int [] array =new int[5];
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader fentrada = new BufferedReader(isr);
		PrintStream fsalida = System.out;

		String dato;

			for(i=0; i<5; i++ ){
			fsalida.println("Escibre los numeros");

			dato = fentrada.readLine();
			array[i]=Integer.parseInt(dato);
		}	
		for(i = 0; i<5; i++){
			System.out.print("\t");
			System.out.println(array[i]);
		}	

		for(i = 0; i<array.length-1;i++){
			for(j = 0; j<array.length-1;j++){
				if(array[i]>array[j]){
					aux = array[i];
					array[i] = array[j];
					array[j] = aux;
				}
				
			
					}
			}
		
		System.out.println("Este es el arrelglo acomodado:");
		
		for(i = 0; i<array.length;i++){
			
			System.out.println(array[i]);
		}
		 System.out.println("\t");
		 System.out.println("La mediana del arreglo es: "+array[2]);
		



		 




                 //fsalida.println(dato);
			
		 

	}
}