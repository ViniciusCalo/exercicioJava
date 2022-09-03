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
		System.out.println("Digite o gênero do livro: ");
		genero = entrada.next();
		System.out.println("Digite o nome do autor: ");
		autor = entrada.next();
		System.out.println("Digite o ano de lançamento: ");
		ano = entrada.nextInt();
		
		System.out.println("O seu livro é " + nomeLivro + "\n Gênero: " + genero + "\n Autor: " + autor + "\n Ano de lançamento: " + ano);
	}
}
