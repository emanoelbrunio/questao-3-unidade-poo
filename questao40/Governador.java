package questao40;
//Escreva a classe Politico que herda de uma classe Pessoa e tem um campo adicional para representar o partido do político. Escreva também as classes Prefeito e Governador que herdem da classe Politico e que contenham campos para representar a cidade ou estado governado. Escreva também uma aplicação que demonstre o uso de instâncias destas classes.

public class Governador extends Politico{

    private String uf;

    Governador(String nome, int idade, String cpf, String sexo, String partido, String uf) {
        super(nome, idade, cpf, sexo, partido);
        this.uf = uf;
    }

    public String toString() {
		String resultado = super.toString();

		resultado += "Unidade Federal (UF): " + this.uf + "\n";

		return resultado;
	}
    
}
