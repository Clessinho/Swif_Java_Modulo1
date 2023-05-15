import java.util.Scanner;

public class DecisaoEncadeada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//verificar se o numero dado pelo usuario é Positivo, Negativo ou Nulo
		Scanner leitor = new Scanner (System.in);
		int numero;
		System.out.println("Digite um numero: ");
		numero = leitor.nextInt();
		
		if (numero>0) 
		System.out.println("Numero Positivo");
		
		else if(numero<0) 
		System.out.println("Numero Negativo");
		
		else
		System.out.println("Numero Nulo");
	}

}
