
public class Padaria {
	//PADARIA
	
	//DECLARAÇÃO DE VARIAVEIS
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
			System.out.println("Quantidade de pães: " + quantidadePaes);
			System.out.println("Quantidade de sonhos: " + quantidadeSonhos);
			System.out.println("Quantidade de leites: " + quantidadeLeite);
			System.out.println("Você tem mais pães na padaria!");
		} else {
			System.out.println("Quantidade de pães: " + quantidadePaes);
			System.out.println("Quantidade de sonhos: " + quantidadeSonhos);
			System.out.println("Quantidade de leites: " + quantidadeLeite);
			System.out.println("Você tem mais sonhos do que pães!");
		}
		
		return 0;
	}
}
