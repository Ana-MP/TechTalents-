package dia2;

public class TrocaDeVariavel {
	
	    //Escreva um algoritmo que armazene o valor 99 em uma vari�vel Y e o valor 11 em uma vari�vel Z. A seguir (utilizando apenas atribui��es entre vari�veis) troque os seus conte�dos fazendo com que o valor que est� em Y passe para Z e vice-versa. Ao final, escrever os valores que ficaram armazenados nas vari�veis.
		
		public static void main(String[] args)
		{
			
			int Y = 99;
			
			int Z = 11;
			
	       System.out.println("O valor de Y �: "+ Y);
	       System.out.println("O valor de Z �: "+ Z);
	       
	              int x= 0;
	              x=Y;
	              Y=Z;
	              Z=x;
	              

			System.out.println("O valor de Y  ap�s a troca �: "+ Y);
	       System.out.println("O valor de Z ap�s a troca �: "+ Z);


	}
	}


