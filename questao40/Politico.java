package questao40;

// Escreva a classe Politico que herda de uma classe Pessoa e tem um campo adicional para representar o partido do político. Escreva também as classes Prefeito e Governador que herdem da classe Politico e que contenham campos para representar a cidade ou estado governado. Escreva também uma aplicação que demonstre o uso de instâncias destas classes.

public class Politico extends Pessoa{
    private String partido;

    Politico(String nome, int idade, String cpf, String sexo, String partido) {
        super(nome, idade, cpf, sexo);
        this.partido = partido;
    }

    public String toString() {
		String resultado = super.toString();

		resultado += "Partido: " + this.partido + "\n";

		return resultado;
	}

    
}
