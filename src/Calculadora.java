import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		// Criar uma calculadora
		//primeiro criar a(s) variavel(is) de valor com base no tipo (int)
		int valor1;
		int valor2;
		int soma, subtracao, multiplicacao;
		double divisao;
		
		//criar o recurso Scanner de leitura
		Scanner leitor = new Scanner (System.in);
		// acima foi declarado as variaveis, mas precisa sair informacão..
		//...para o usuario (o que ele precisar fazer)
		System.out.println("Esse programa vai somar, subtrair, multiplicar e dividir");
		System.out.println("Digite o primeiro valor: ");
		// abaixo estou dizendo que o valor1 ou 2 refere-se ao que o usuario digitou
		valor1 = leitor.nextInt();
		System.out.println("Digite o segundo valor: ");
		valor2 = leitor.nextInt();
		//declaro o que é a soma ou a subtracao ou a divisao
		soma = valor1 + valor2;
		// criando uma condicao para deixar meu valor sempre positivo
		/* se a decisao if conter 1 linha, não precisa da chave { }
		 * caso contrario, se tiver 2 ou mais linhas para a decisao, colocar chaves
		 */
		if (valor1 >= valor2) {
		subtracao = valor1 - valor2; 
		System.out.println("A soma dos valores digitados e igual a " + subtracao);
		}
		// no caso do else, como aqui só temos 1 linha, não precisou da chave {}
		else		
		subtracao =valor2 - valor1; 
		System.out.println("A soma dos valores digitados e igual a " + subtracao);
			
		System.out.println("A soma dos valores digitados e igual a " + soma);
		subtracao = valor1 - valor2;
		System.out.println("A subtracao dos valores digitados e igual a " + subtracao);
		multiplicacao = valor1 * valor2;
		System.out.println("A multiplicacao dos valores digitados e igual a " + multiplicacao);
		if (valor2 >0) {
		divisao = valor1 / (double) valor2;
		System.out.println("A divisao dos valores digitados e igual a " + divisao);
		}
		else
		System.out.println("Essa operacao nao funciona divindo por zero ou negativos");
			
	}

}
