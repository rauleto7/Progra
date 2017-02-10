public class Operadores1{
	public static void main(String[] args){
        
    int a_1=2;
    int a_2=7;


    System.out.println("Operadores y Estructuras de Control 2");
    System.out.println("\n");
    System.out.println("**Even or Odd**");
    System.out.println("\n");

    if(1<=a_1&&a_2<=1000){

    if(a_1%2==0){
    System.out.println("input is " +a_1+", then output should be: 'Even' ");
    }else{
    	System.out.println("input is " +a_1 +", then output should be: 'Odd' ");
    }

    if(a_2%2==0){
    System.out.println("input is " +a_2+", then output should be: 'Even' ");
    }else{
    	System.out.println("input is " +a_2+", then output should be: 'Odd' ");
    }
}else{
	System.out.println("El numero es muy grande o muy chico, no se puede resolver");
}


	}
}