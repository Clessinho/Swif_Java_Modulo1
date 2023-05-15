import java.util.Scanner;

public class CalculoImc {

	public static void main(String[] args) {
		// IMC (Peso / Altura x Altura)
		/*Tabela
		 * <18.5 | Abaixo do Peso
		 * >=18.5 e <25 | Normal
		 * >=25 e <30 | Sobrepeso
		 * >=30 e <40 | Obesidade
		 * >40 | Obesidade grave
		 */
		/*Operadores lógicos
		 * nao ! - prioridade 1
		 * e &&  - prioridade 2
		 * ou || - prioridade 3
		 * OBSERVACAO: Posso quebrar as prioridades com parenteses
		 * igual == ou equals
		 */
		Scanner leitor = new Scanner(System.in);
		double peso, altura, imc;
		System.out.println("Digite seu peso em quilogramas: ");
		peso = leitor.nextDouble();
		System.out.println("Digite sua altura: ");
		altura = leitor.nextDouble();
		imc = peso / (altura * altura);
		if (imc < 18.5) 
		System.out.println("Seu IMC e: " + String.format("%.2f",imc) + ". Você esta abaixo do peso."); 
		
		else if (imc >= 18.5 && imc < 25)
		System.out.println("Seu IMC e: " + String.format("%.2f",imc) + ". Seu peso está completamente normal.");
		else if (imc >=25 && imc < 30)
		System.out.println("Seu IMC e: " + String.format("%.2f",imc) + ". Você está com sobrepeso. Adeque sua alimentação e faça exercicios");
		else if (imc >= 30 && imc < 40)
		System.out.println("Seu IMC e: " + String.format("%.2f",imc) + ". Você está com obesidade, procure um nutricionista e faça exercicios.");
		else
		System.out.println("Seu IMC e: " + String.format("%.2f",imc) + ". Sua obesidade está num nível avançado e grave. Contate seu medico.");
		
		
		

	}

}
