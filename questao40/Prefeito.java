package questao40;
//Escreva a classe Politico que herda de uma classe Pessoa e tem um campo adicional para representar o partido do político. Escreva também as classes Prefeito e Governador que herdem da classe Politico e que contenham campos para representar a cidade ou estado governado. Escreva também uma aplicação que demonstre o uso de instâncias destas classes.

public class Prefeito extends Politico {

    private String cidade;

    Prefeito(String nome, int idade, String cpf, String sexo, String partido, String cidade) {
        super(nome, idade, cpf, sexo, partido);
        this.cidade = cidade;
    }

    public String toString() {
		String resultado = super.toString();

		resultado += "Cidade: " + this.cidade + "\n";

		return resultado;
	}

    
}
