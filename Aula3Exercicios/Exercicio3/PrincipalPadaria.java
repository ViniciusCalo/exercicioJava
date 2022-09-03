import java.util.Scanner;

public class PrincipalPadaria {
	
	public static void main(String args[]) {
		Padaria pad = new Padaria();
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite a quantidade Pães: ");
		pad.quantidadePaes = entrada.nextInt();
		System.out.println("Digite a quantidade de sonhos: ");
		pad.quantidadeSonhos = entrada.nextInt();
		System.out.println("Digite a quantidade de leites: ");
		pad.quantidadeLeite = entrada.nextInt();
		
		System.out.print(pad.verificar());
		
	}
}
