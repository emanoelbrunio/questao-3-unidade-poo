package questao40;

// Escreva a classe Politico que herda de uma classe Pessoa e tem um campo adicional para representar o partido do político. Escreva também as classes Prefeito e Governador que herdem da classe Politico e que contenham campos para representar a cidade ou estado governado. Escreva também uma aplicação que demonstre o uso de instâncias destas classes.
public class Pessoa {
    private String nome;
    private int idade;
    private String cpf;
    private String sexo;

    Pessoa(String nome, int idade, String cpf, String sexo){
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.sexo = sexo;
    }

    public String toString() {
		String resultado = "";

		resultado += "Nome: " +  this.nome + "\n";
		resultado += "Idade: " +  this.idade + "\n";
		resultado += "CPF: " +  this.cpf + "\n";
		resultado += "Sexo: " +  this.sexo + "\n";

		return resultado;
	}



}
