
public class Carro {
	private String marca;
	private String nome;
	private String preco;
	
	public void carro(String marcaCarro, String nomeCarro, float precoCarro) {
		marca = "A marca do carro é: " + marcaCarro;
		nome = "O nome do carro é: " + nomeCarro;
		preco = "O valor do carro é: " + precoCarro;
	}
	
	public void detalheCarro(){
		System.out.println(marca);
		System.out.println(nome);
		System.out.println(preco);
	}
}
