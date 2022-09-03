
public class Padaria {
	//PADARIA
	
	//DECLARA��O DE VARIAVEIS
	int quantidadePaes;
	int quantidadeSonhos;
	int quantidadeLeite;
	
	//GETTERS AND SETTERS
	public int getQuantidadePaes() {
		return quantidadePaes;
	}
	public void setQuantidadePaes(int quantidadePaes) {
		this.quantidadePaes = quantidadePaes;
	}
	public int getQuantidadeSonhos() {
		return quantidadeSonhos;
	}
	public void setQuantidadeSonhos(int quantidadeSonhos) {
		this.quantidadeSonhos = quantidadeSonhos;
	}
	public int getQuantidadeLeite() {
		return quantidadeLeite;
	}
	public void setQuantidadeLeite(int quantidadeLeite) {
		this.quantidadeLeite = quantidadeLeite;
	}
	
	//VERIFICANDO A QUANTIDADE
	public int verificar() {
		if (quantidadePaes > quantidadeSonhos) {
			System.out.println("Quantidade de p�es: " + quantidadePaes);
			System.out.println("Quantidade de sonhos: " + quantidadeSonhos);
			System.out.println("Quantidade de leites: " + quantidadeLeite);
			System.out.println("Voc� tem mais p�es na padaria!");
		} else {
			System.out.println("Quantidade de p�es: " + quantidadePaes);
			System.out.println("Quantidade de sonhos: " + quantidadeSonhos);
			System.out.println("Quantidade de leites: " + quantidadeLeite);
			System.out.println("Voc� tem mais sonhos do que p�es!");
		}
		
		return 0;
	}
}
