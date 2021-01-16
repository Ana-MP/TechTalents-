package dia2;

public class TrocaDeVariavel {
	
	    //Escreva um algoritmo que armazene o valor 99 em uma variável Y e o valor 11 em uma variável Z. A seguir (utilizando apenas atribuições entre variáveis) troque os seus conteúdos fazendo com que o valor que está em Y passe para Z e vice-versa. Ao final, escrever os valores que ficaram armazenados nas variáveis.
		
		public static void main(String[] args)
		{
			
			int Y = 99;
			
			int Z = 11;
			
	       System.out.println("O valor de Y é: "+ Y);
	       System.out.println("O valor de Z é: "+ Z);
	       
	              int x= 0;
	              x=Y;
	              Y=Z;
	              Z=x;
	              

			System.out.println("O valor de Y  após a troca é: "+ Y);
	       System.out.println("O valor de Z após a troca é: "+ Z);


	}
	}


