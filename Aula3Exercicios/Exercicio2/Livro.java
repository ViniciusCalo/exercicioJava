import java.util.Scanner;

public class Livro {
	public static void main(String args[]) {
	
		String nomeLivro;
		String genero;
		String autor;
		int ano;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o nome do livro: ");
		nomeLivro = entrada.next();
		System.out.println("Digite o g�nero do livro: ");
		genero = entrada.next();
		System.out.println("Digite o nome do autor: ");
		autor = entrada.next();
		System.out.println("Digite o ano de lan�amento: ");
		ano = entrada.nextInt();
		
		System.out.println("O seu livro � " + nomeLivro + "\n G�nero: " + genero + "\n Autor: " + autor + "\n Ano de lan�amento: " + ano);
	}
}
