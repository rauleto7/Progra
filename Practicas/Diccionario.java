import java.io.*;
public class Diccionario{
	private static InputStreamReader isr = new InputStreamReader(System.in);
	private static BufferedReader bf = new BufferedReader(isr);
	private static String dato;
	private static int op;
	private static PrintStream salida = System.out;
	private static int n, i,k;
	private	String es[] = new String [40];
	private	String in[] = new String [40];
	private static String w,j;

	public void crearDiccionario(){

	salida.println("¿Cuantas palabras quieres traducir?");
	try{
		dato = bf.readLine();
		n = Integer.parseInt(dato);

	}catch(IOException ex){}

	if( n < 100){

	for(i = 0; i<n; i++){

	try{
		salida.println("Dame la palabra en Espanol");
		es[i] = bf.readLine();  
		salida.println("Dame la palabra en Ingles");
		in[i] = bf.readLine();

	}catch(IOException ex){}
	}

	}else{
	salida.println("Son demasiadas palabras tiene que ser menos de 100");
	}
	}

	public void traductor(){

		salida.println("Escribre la palabra en Ingles");
	
	try{
			
		w = bf.readLine();
		
	}catch(IOException ex){}

for( i = 0; i<n; i++){
	 if(w .equals(in[i])){

		k=i;
		
	 }else{
		//salida.println("Esa palabra no esta registrada"); aqui estaba el error
	}
	}
	 salida.println("Traduccion en Espanol : "+es[k]);


}






	public static void main(String[] args){
		Diccionario traductor01 = new Diccionario();

		do{
	salida.println("Bienvenido al Diccionario\n");
	salida.println("1.-Ingresar Palabras\n2.-Traducir palabras\n3.-Salir");

	try{
		dato = bf.readLine();
		op = Integer.parseInt(dato);
	}catch(IOException ex){}

	switch(op){
		case 1:
			salida.println("Ingresar\n");
			traductor01.crearDiccionario();
		

		break;


		case 2:
			salida.println("Traductor");
			traductor01.traductor();


		break;

		case 3:
		salida.println("Vuelva pronto");
		break;

	}

	}while(op != 3);

	

	}
}