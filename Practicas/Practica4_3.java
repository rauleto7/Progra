public class Practica4_3{
	public static void main(String[] args){
		int num[] = {2,4,6,8,2};
		int min = num[0];
		int max = num[0];
		int ran = 0;
		int sum = 0;
		int cont = 0;
		float med = 0;
		int median = 0;

		for(int i = 0; i<5; ++i){
			if(min>num[i]){
				min = num[i];
			}

		}

		for(int i = 0; i<5; ++i){
			if(max<num[i]){
				max = num[i];
			}
		}

		ran = max-min;

		for(int i = 0; i<5; ++i){
			sum = sum + num[i];
		}

		median = num[cont / 2];
		cont = num.length;
		med = sum/cont;





		System.out.println("El minimo es: "+min);
		System.out.println("El maximo es: "+max);
		System.out.println("El rango es: "+ran);
		System.out.println("La suma total es: "+sum);
		System.out.println("La mediana es: "+median);
		System.out.println("El Count es: "+cont);
		System.out.println("La media es: "+med);



	}
}