import java.io.*;
public class Practica4_1{

    public static void printCapitalized(String n){
    	String m;
    	m=n.toUpperCase();
    	System.out.println(m);
    }

    
	public static void main(String[] args) 

	{

		System.out.println("Ejercicio 2 Practica 4");
		System.out.println("\n");

		String n="Hola mundo java";

		printCapitalized(n);
	}
}