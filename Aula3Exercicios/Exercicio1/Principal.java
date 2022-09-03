import java.util.Scanner;

public class Principal {

	public static void main(String args[]){
		Carro car = new Carro();
		Scanner entrada = new Scanner(System.in);
		String marcaCarro, nomeCarro;
		float precoCarro;
		
		System.out.println("Digite a marca do carro desejado: ");
		marcaCarro = entrada.next();
		System.out.println("Digite o nome do carro: ");
		nomeCarro = entrada.next();
		System.out.println("Qual o valor do carro? ");
		precoCarro = entrada.nextFloat();
		car.carro(marcaCarro, nomeCarro, precoCarro);
		car.detalheCarro();
	}
}
