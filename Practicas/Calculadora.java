import java.io.*;
public class Calculadora{

public 	static InputStreamReader isr = new InputStreamReader(System.in);
public 	static BufferedReader bf = new BufferedReader(isr);
public	static String dato;
public static	int opcion = 0;
public	static PrintStream fsalida = System.out;



public void suma(){  
	double num1 = 0;
	double num2 = 0;
	double res = 0;

try{
	fsalida.println("Dame un numero");
	dato = bf.readLine();
	num1 = Double.parseDouble(dato);
	fsalida.println("Dame otro numero");
	dato = bf.readLine();
	num2 = Double.parseDouble(dato);
}catch(IOException ex){}                      
	
  	res = num1 + num2;

	fsalida.println("El resultado es: "+res);
}

public void resta(){  
	double num1 = 0;
	double num2 = 0;
	double res = 0;


	try{
		fsalida.println("Dame un numero");
		dato = bf.readLine();
		num1 = Double.parseDouble(dato);
		fsalida.println("Dame otro numero");
		dato = bf.readLine();
		num2 = Double.parseDouble(dato);
	}catch(IOException ex){}

	res = num1 - num2;



	fsalida.println("La resta es igual a: "+res);
}

public void multiplicacion(){
	double num1 = 0;
	double num2 = 0;
	double res = 0;

	try{
		fsalida.println("Dame un numero");
		dato = bf.readLine();
		num1 = Double.parseDouble(dato);
		fsalida.println("Dame otro numero");
		dato = bf.readLine();
		num2 = Double.parseDouble(dato);
	}catch(IOException ex){}

	res = num1 * num2;

	fsalida.println("La multiplicacion es :"+res);

}

public void division(){
	double num1 = 0;
	double num2 = 0;
	double res = 0;

	try{
		fsalida.println("Dame un numero");
		dato = bf.readLine();
		num1 = Double.parseDouble(dato);
		fsalida.println("Dame otro numero");
		dato = bf.readLine();
		num2 = Double.parseDouble(dato);
	}catch(IOException ex){}

	res = num1 / num2;
	if( num2 == 0){
		fsalida.println("La division no se puede hacer, elija otro numero");
	}
	else{

	fsalida.println("La division es :"+res);
}

	
	

}


public static void main (String[] args) {
	
	Calculadora calculadora01 = new Calculadora();


	do{
	fsalida.println("\tBienvenido al menu de tu calculadora\n");
	fsalida.println("¿Que opcion desea elegir?\n");
	fsalida.println("1.-Sumar\n2.-Restar\n3.-Multiplicar\n4.-Dividir\n5.-Salir");

	try{
	dato = bf.readLine();
	opcion = Integer.parseInt(dato);
	}catch(IOException ex){}

	switch(opcion){
		case 1:
		fsalida.println("Bienvenido a la suma");
		calculadora01.suma();


		

	break;


		case 2:
		fsalida.println("Bienvenido a la resta");
		calculadora01.resta();
		

	break;


		case 3:
		fsalida.println("Bienvenido a la multiplicacion");
		calculadora01.multiplicacion();
		
	break;

		case 4:
		fsalida.println("Bienvenido a la division");
		calculadora01.division();
		
	break;

		case 5:
		fsalida.println("Vuelve Pronto");

		break;


	}

}while(opcion != 5);



}
}