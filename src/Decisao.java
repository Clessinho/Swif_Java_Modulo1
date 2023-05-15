import java.util.Scanner;

public class Decisao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leitor = new Scanner (System.in);
		int idade;
		System.out.println("Digite sua idade: ");
		idade = leitor.nextInt();
		//Decisao simples
		//if (condicao) => variavel operadorRelacional valor|variavel
		/*Operadores relacionais
		 * >  maior
		 * >= maior ou igual
		 * <  menor
		 * <= menor ou igual
		 * == igual
		 * != diferente
		 */
		if (idade >=12) {//essa é decisão verdadeira
			System.out.println("Pode assistir ao filme");
		}
		// else = se a condição for falsa, mas a condição não é nessario escrever	
		else {
			System.out.println("Filme não recomendado para sua idade");
		}
	}

}
