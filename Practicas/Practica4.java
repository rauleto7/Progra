public class Practica4{
	public static void main(String[] args){

String word= "lago";
String word1= "goal";

int len = word.length();
int len1 = word1.length();

String word2 = word.substring(2,4);
String word3 = word1.substring(0,2);

int index = word.charAt(0);
int index1 = word1.charAt(3);

int index2 = word.charAt(1);
int index3 = word1.charAt(2);

if(len==len1){

if(word2.equals(word3)){
	if(index==index1){
		if(index2==index3){
		
		System.out.println(""+word+" is an anagram of "+word1+""); 	

		}
	}
}
}else{
	System.out.println("la palabra "+word);
	System.out.println("la palabra "+word1);
	System.out.println("No son anagramas");
}








		/*
	String word = "java laoh";
	String word1= "avaj hola";

	
	char [] ordenada1 = word.toCharArray();
	java.util.Arrays.sort(ordenada1);
	String cadena1 = new String(ordenada1);

	char [] ordenada2 = word1.toCharArray();
	java.util.Arrays.sort(ordenada2);
	String cadena2 = new String(ordenada2);

	System.out.println("La primera palabra es: "+word);

	System.out.println("La segunda palabra es: "+word1);
	System.out.println("--------------");
	System.out.println(cadena1);
	System.out.println("------------");
	System.out.println(cadena2);
	System.out.println("--------------");

	if(cadena1.equals(cadena2)){
		System.out.println("Es un anagrama");
	}else{
		System.out.println("NO es un anagrama");

			}


			*/
	






	}
}