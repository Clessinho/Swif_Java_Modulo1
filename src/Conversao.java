import java.util.Scanner;

public class Conversao {
	static final double COTACAO = 5.3;

			
	public static void main(String[] args) {
		// Formatacao de casas decimais (como fazer)
		// double dolar = 5.4784887;
		// System.out.println("dolar: " + String.format("%.2f",dolar));
		double doacaoDolar, valorReais;
		Scanner leitor = new Scanner (System.in);
		System.out.println("Digite o valor da doação em dolares : $ ");
		doacaoDolar = leitor.nextDouble();
		//abaixo tem um condicao if (verdadeira) vai acontecer se for verdadeiro dps em chave
		if (doacaoDolar >0) {valorReais = doacaoDolar*COTACAO;
		System.out.println("O valor da doacao recebida em reais foi de: " + String.format("%.2f",valorReais));}
		
		
		
		
		

	}

}
